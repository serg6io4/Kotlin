package com.serg6io4.androidmaster.imccalculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.serg6io4.androidmaster.R
import com.serg6io4.androidmaster.imccalculator.imcCalculatorActivity.Companion.IMC_KEY

class ResultIMCActivity : AppCompatActivity() {

    private lateinit var tvResult: TextView
    private lateinit var tvIMC: TextView
    private lateinit var tvDescription: TextView

    private lateinit var btnRecalculate:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result_imcactivity)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val result:Double = intent.extras?.getDouble(IMC_KEY) ?: -1.0
        initComponent()
        initListener()
        initUI(result)
    }

    private fun initListener() {
        btnRecalculate.setOnClickListener{
            onBackPressedDispatcher
        }
    }

    private fun initUI(result: Double) {
        tvIMC.text =  tvResult.toString()
        when(result){
            in 0.00..18.50->{//Bajo Peso
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.peso_bajo))
                tvResult.text = getString(R.string.bajopeso)
                tvDescription.text = getString(R.string.bajopesodesc)
            }
            in 18.51..24.99->{//Peso Normal
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.peso_normal))
                tvResult.text = getString(R.string.normal)
                tvDescription.text = getString(R.string.normaldesc)
            }
            in 25.00..29.99->{//Sobrepeso
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.peso_alto))
                tvResult.text = getString(R.string.altopeso)
                tvDescription.text = getString(R.string.altopesodesc)
            }
            in 30.00..99.99->{//Obesidad
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.peso_obesidad))
                tvResult.text = getString(R.string.obesidad)
                tvDescription.text = getString(R.string.obseidaddesc)
            }
            else->{//Error
                tvIMC.text = getString(R.string.error)
                tvResult.text = getString(R.string.error)
                tvDescription.text = getString(R.string.error)
            }

        }

    }

    private fun initComponent (){
        btnRecalculate = findViewById(R.id.btnRecalculate)
        tvResult = findViewById(R.id.tvResult)
        tvIMC = findViewById(R.id.tvIMC)
        tvDescription = findViewById(R.id.tvDescription)
    }
}