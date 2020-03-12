package mx.edu.ittepic.ladm_u2_practica2_oscarramos

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.MotionEvent
import android.view.View

class Lienzo(p:MainActivity) : View(p) {


    var circulo = FiguraGeometrica(139, 150, 9)
    var circulo2 = FiguraGeometrica(100, 538,25 )
    var circulo3 = FiguraGeometrica(260, 587, 38)
    var circulo4 = FiguraGeometrica(177, 497, 46)
    var circulo5 = FiguraGeometrica(355, 412, 51)
    var circulo6 = FiguraGeometrica(197, 846, 69)
    var circulo7 = FiguraGeometrica(756, 249, 77)
    var circulo8 = FiguraGeometrica(723, 817, 83)
    var circulo9 = FiguraGeometrica(654, 546,96 )
    var circulo10 = FiguraGeometrica(900, 150, 100)




    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()

        canvas.drawColor(Color.BLACK)

        paint.color = Color.WHITE
        circulo.pintar(canvas, paint)
        circulo2.pintar(canvas, paint)
        circulo3.pintar(canvas, paint)
        circulo4.pintar(canvas, paint)
        circulo5.pintar(canvas, paint)
        circulo6.pintar(canvas, paint)
        circulo7.pintar(canvas, paint)
        circulo8.pintar(canvas, paint)
        circulo9.pintar(canvas, paint)
        circulo10.pintar(canvas, paint)


    }


    fun animarCirculo() {
        circulo.rebote(width, height)
        circulo2.rebote(width,height)
        circulo3.rebote(width,height)
        circulo4.rebote(width,height)
        circulo5.rebote(width,height)
        circulo6.rebote(width,height)
        circulo7.rebote(width,height)
        circulo8.rebote(width,height)
        circulo9.rebote(width,height)
        circulo10.rebote(width,height)


        invalidate()
    }

}