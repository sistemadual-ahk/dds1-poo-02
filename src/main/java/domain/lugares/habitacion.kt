package domain.lugares

import kotlin.math.abs

object habitacion : lugarVisitable {
    private var desorden :  Int = 0
    private var posicionX : Int = 14
    private var posicionY : Int = 10

    fun desordenTotal() : Int{
        return desorden
    }

    override fun getPosicionX(): Int {
        return posicionX
    }

    override fun getPosiconY(): Int {
        return posicionY
    }

    override fun serVisitadoPorGary() {
        desorden++
    }

    fun distanciaAbsolutaEntre(unPunto : Int, otroPunto: Int) : Int{
        return abs(unPunto - otroPunto)
    }

    override fun distanciaXHacia(otroPunto: Int) : Int {
        return distanciaAbsolutaEntre(posicionX, otroPunto)
    }

    override fun distanciaYHacia(otroPunto: Int) : Int {
        return distanciaAbsolutaEntre(posicionY, otroPunto)
    }
}