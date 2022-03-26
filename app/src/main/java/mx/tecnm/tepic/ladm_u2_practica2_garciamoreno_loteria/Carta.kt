package mx.tecnm.tepic.ladm_u2_practica2_garciamoreno_loteria

import android.media.MediaPlayer

class Carta(img_:Int,voz_:Int,activity_: MainActivity) {
    var img = img_
    var voz = voz_
    var activity = activity_
    var mediaPlayer : MediaPlayer ?= null
    fun reproducir(){
        if(mediaPlayer==null){
            mediaPlayer = MediaPlayer.create(activity,voz)
            mediaPlayer!!.isLooping = true
            mediaPlayer!!.start()
        }else mediaPlayer!!.start()

    }
    fun pausar(){
        if(mediaPlayer?.isPlaying==true) mediaPlayer?.pause()
    }
    fun detener(){
        if(mediaPlayer!=null){
            mediaPlayer!!.stop()
            mediaPlayer!!.release()
            mediaPlayer = null
        }
    }

}