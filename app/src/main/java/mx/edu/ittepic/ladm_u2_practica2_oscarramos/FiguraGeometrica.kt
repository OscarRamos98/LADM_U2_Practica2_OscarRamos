package mx.edu.ittepic.ladm_u2_practica2_oscarramos

import android.graphics.Canvas
import android.graphics.Paint

class FiguraGeometrica () {
    var x = 0f
    var y = 0f
    var radio = 0f
    var ancho = 0f
    var alto = 0f
    var incX = 1
    var incY = 1

    constructor(x:Int, y:Int, radio:Int) : this(){
        this.x = x.toFloat()
        this.y = y.toFloat()
        this.radio = radio.toFloat()
        //dando valor a ancho y alto para tratar circulo como cuadrado
        ancho = this.radio*2
        alto = ancho

        if(radio<20){
            incX = 60
            incY = 60
        }else if(radio <40){
            incX = 40
            incY= 40
        }else if(radio<60){
            incX = 30
            incY = 30
        }else if(radio<80){
            incX = 15
            incY = 15
        }else if(radio<100){
            incX = 5
            incY = 5
        }else{
            incX = 1
            incY = 1
        }
    }


    fun pintar(c: Canvas, p: Paint){

         c.drawCircle(x+radio,y+radio,radio,p)

    }


    fun rebote(ancho:Int, alto:Int){

        x+= incX
        if(x<=-100 || x>=ancho){
            incX *= -1
        }
        y+= incY
        if(y<=-100 || y>=alto){
            incY *= -1
        }

    }

}