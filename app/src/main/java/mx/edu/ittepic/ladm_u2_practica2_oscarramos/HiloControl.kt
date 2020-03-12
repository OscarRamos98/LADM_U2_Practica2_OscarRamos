package mx.edu.ittepic.ladm_u2_practica2_oscarramos

class HiloControl (p:MainActivity):Thread(){
    var puntero = p

    override fun run() {
        super.run()

        while(true){
            sleep(20)
            puntero.runOnUiThread {
                puntero.lienzo!!.animarCirculo()
            }
        }
    }
}