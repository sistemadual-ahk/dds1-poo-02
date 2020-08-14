package domain.lugares

import kotlin.math.abs

object casaDelVecino : lugarVisitable {
    private var cantidadVisitasGary : Int = 0
    private var posicionX : Int = 180
    private var posicionY : Int = 5

    fun cantidadDeVecesVisitado() : Int{
        return cantidadVisitasGary
    }

    override fun getPosicionX(): Int {
        return posicionX
    }

    override fun getPosiconY(): Int {
        return posicionY
    }

    override fun serVisitadoPorGary() {
        cantidadVisitasGary++;
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