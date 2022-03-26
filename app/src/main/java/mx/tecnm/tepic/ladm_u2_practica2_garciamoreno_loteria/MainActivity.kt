package mx.tecnm.tepic.ladm_u2_practica2_garciamoreno_loteria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mx.tecnm.tepic.ladm_u2_practica2_garciamoreno_loteria.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var loteria = Loteria(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.iniciar.setOnClickListener {
            loteria = Loteria(this)
            //loteria.barajear()
            loteria.start()
            binding.loteria.setEnabled(true)
            binding.iniciar.setEnabled(false)
        }
        binding.loteria.setOnClickListener {
            loteria.detener()
            binding.iniciar.setEnabled(false)
            binding.loteria.setEnabled(false)
            binding.restantes.setEnabled(true)
        }
        binding.restantes.setOnClickListener {
            loteria.verRestantes()
            binding.iniciar.setEnabled(false)
            binding.restantes.setEnabled(false)
        }
    }
}