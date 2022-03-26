package mx.tecnm.tepic.ladm_u2_practica2_garciamoreno_loteria

import kotlinx.coroutines.*
import kotlin.coroutines.EmptyCoroutineContext

class Loteria(activity: MainActivity) : Thread() {
    val activity = activity
    val baraja = arrayOf(
        R.drawable.carta1,
        R.drawable.carta2,
        R.drawable.carta3,
        R.drawable.carta4,
        R.drawable.carta5,
        R.drawable.carta6,
        R.drawable.carta7,
        R.drawable.carta8,
        R.drawable.carta9,
        R.drawable.carta10,
        R.drawable.carta11,
        R.drawable.carta12,
        R.drawable.carta13,
        R.drawable.carta14,
        R.drawable.carta15,
        R.drawable.carta16,
        R.drawable.carta17,
        R.drawable.carta18,
        R.drawable.carta19,
        R.drawable.carta20,
        R.drawable.carta21,
        R.drawable.carta22,
        R.drawable.carta23,
        R.drawable.carta24,
        R.drawable.carta25,
        R.drawable.carta26,
        R.drawable.carta27,
        R.drawable.carta28,
        R.drawable.carta29,
        R.drawable.carta30,
        R.drawable.carta31,
        R.drawable.carta32,
        R.drawable.carta33,
        R.drawable.carta34,
        R.drawable.carta35,
        R.drawable.carta36,
        R.drawable.carta37,
        R.drawable.carta38,
        R.drawable.carta39,
        R.drawable.carta40,
        R.drawable.carta41,
        R.drawable.carta42,
        R.drawable.carta43,
        R.drawable.carta44,
        R.drawable.carta45,
        R.drawable.carta46,
        R.drawable.carta47,
        R.drawable.carta48,
        R.drawable.carta49,
        R.drawable.carta50,
        R.drawable.carta51,
        R.drawable.carta52,
        R.drawable.carta53,
        R.drawable.carta54
    )
    var baraja2 = arrayOf(
        Carta(R.drawable.carta1,R.raw.carta1,activity),
        Carta(R.drawable.carta2,R.raw.carta2,activity),
        Carta(R.drawable.carta3,R.raw.carta3,activity),
        Carta(R.drawable.carta4,R.raw.carta4,activity),
        Carta(R.drawable.carta5,R.raw.carta5,activity),
        Carta(R.drawable.carta6,R.raw.carta6,activity),
        Carta(R.drawable.carta7,R.raw.carta7,activity),
        Carta(R.drawable.carta8,R.raw.carta8,activity),
        Carta(R.drawable.carta9,R.raw.carta9,activity),
        Carta(R.drawable.carta10,R.raw.carta10,activity),
        Carta(R.drawable.carta11,R.raw.carta11,activity),
        Carta(R.drawable.carta12,R.raw.carta12,activity),
        Carta(R.drawable.carta13,R.raw.carta13,activity),
        Carta(R.drawable.carta14,R.raw.carta14,activity),
        Carta(R.drawable.carta15,R.raw.carta15,activity),
        Carta(R.drawable.carta16,R.raw.carta16,activity),
        Carta(R.drawable.carta17,R.raw.carta17,activity),
        Carta(R.drawable.carta18,R.raw.carta18,activity),
        Carta(R.drawable.carta19,R.raw.carta19,activity),
        Carta(R.drawable.carta20,R.raw.carta20,activity),
        Carta(R.drawable.carta21,R.raw.carta21,activity),
        Carta(R.drawable.carta22,R.raw.carta22,activity),
        Carta(R.drawable.carta23,R.raw.carta23,activity),
        Carta(R.drawable.carta24,R.raw.carta24,activity),
        Carta(R.drawable.carta25,R.raw.carta25,activity),
        Carta(R.drawable.carta26,R.raw.carta26,activity),
        Carta(R.drawable.carta27,R.raw.carta27,activity),
        Carta(R.drawable.carta28,R.raw.carta28,activity),
        Carta(R.drawable.carta29,R.raw.carta29,activity),
        Carta(R.drawable.carta30,R.raw.carta30,activity),
        Carta(R.drawable.carta31,R.raw.carta31,activity),
        Carta(R.drawable.carta32,R.raw.carta32,activity),
        Carta(R.drawable.carta33,R.raw.carta33,activity),
        Carta(R.drawable.carta34,R.raw.carta34,activity),
        Carta(R.drawable.carta35,R.raw.carta35,activity),
        Carta(R.drawable.carta36,R.raw.carta36,activity),
        Carta(R.drawable.carta37,R.raw.carta37,activity),
        Carta(R.drawable.carta38,R.raw.carta38,activity),
        Carta(R.drawable.carta39,R.raw.carta39,activity),
        Carta(R.drawable.carta40,R.raw.carta40,activity),
        Carta(R.drawable.carta41,R.raw.carta41,activity),
        Carta(R.drawable.carta42,R.raw.carta42,activity),
        Carta(R.drawable.carta43,R.raw.carta43,activity),
        Carta(R.drawable.carta44,R.raw.carta44,activity),
        Carta(R.drawable.carta45,R.raw.carta45,activity),
        Carta(R.drawable.carta46,R.raw.carta46,activity),
        Carta(R.drawable.carta47,R.raw.carta47,activity),
        Carta(R.drawable.carta48,R.raw.carta48,activity),
        Carta(R.drawable.carta49,R.raw.carta49,activity),
        Carta(R.drawable.carta50,R.raw.carta50,activity),
        Carta(R.drawable.carta51,R.raw.carta51,activity),
        Carta(R.drawable.carta52,R.raw.carta52,activity),
        Carta(R.drawable.carta53,R.raw.carta53,activity),
        Carta(R.drawable.carta54,R.raw.carta54,activity)
    )
    var lot = false
    var it = 0
    val scope = CoroutineScope(Job() + Dispatchers.Main)
    var corrutina = scope.launch(EmptyCoroutineContext, CoroutineStart.LAZY){
        while(it<baraja2.size){
            activity.runOnUiThread{
                //activity.binding.imagen.setImageResource(baraja[it++])
                activity.binding.imagen.setImageResource(baraja2[it++].img)

            }
            delay(1000L)

        }
        activity.binding.iniciar.setEnabled(true)
        activity.binding.loteria.setEnabled(false)
        activity.binding.restantes.setEnabled(false)

    }
    init {
        baraja2.shuffle()
    }
    fun barajear(){
        baraja2.shuffle()

    }
    fun detener(){
        lot = true
    }
    fun iniciar(){
        lot = false
        it = 0
    }
    fun verRestantes(){
        corrutina.start()
    }
    override fun run() {
        super.run()

        while (!lot && it<baraja2.size){
            activity.runOnUiThread {
                //activity.binding.imagen.setImageResource(baraja[it++])
                activity.binding.imagen.setImageResource(baraja2[it].img)
                baraja2[it].reproducir()
            }
            sleep(2000L)
            baraja2[it++].detener()
        }
        if(it>=baraja2.size){
            activity.binding.iniciar.setEnabled(true)
            activity.binding.loteria.setEnabled(false)
            activity.binding.restantes.setEnabled(false)

        }
        it--
    }

}