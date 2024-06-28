package com.example.appdeconverso
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.appdeconverso.databinding.ActivityMainBinding
import java.io.IOException

class MainActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.converter.setOnClickListener{
            val texto:String = binding.idDolar.text.toString().trim();

            try{
                var converter: Double = texto.replace(",", ".").toDouble()*5.59;
                binding.resultado.setText(String.format("R$ %.2f", converter).replace(".",","))

            }catch (e:NumberFormatException){
                binding.resultado.setText("deu erro")
            }
        }

    }

}

