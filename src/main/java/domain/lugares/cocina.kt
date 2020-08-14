package domain.lugares

import kotlin.math.abs

object cocina : lugarVisitable {
    private var pelos : Int = 1
    private var posicionX : Int = 4
    private var posicionY : Int = 30

    fun cantidadDePelos() : Int{
        return pelos
    }

    override fun getPosicionX(): Int {
        return posicionX
    }

    override fun getPosiconY(): Int {
        return posicionY
    }

    override fun serVisitadoPorGary() {
        pelos *= 2
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