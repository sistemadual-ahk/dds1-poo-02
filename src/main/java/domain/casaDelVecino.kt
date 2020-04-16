package domain

import kotlin.math.abs

object casaDelVecino : lugarVisitable {
    private var cantidadVisitasGary : Int = 0
    private var posicionX : Int = 180
    private var posicionY : Int = 5

    fun cantidadDeVecesVisitado() : Int{
        return this.cantidadVisitasGary
    }

    override fun getPosicionX(): Int {
        return this.posicionX
    }

    override fun getPosiconY(): Int {
        return this.posicionY
    }

    override fun serVisitadoPorGary() {
        this.cantidadVisitasGary++;
    }

    fun distanciaAbsolutaEntre(unPunto : Int, otroPunto: Int) : Int{
        return abs(unPunto - otroPunto)
    }

    override fun distanciaXHacia(otroPunto: Int) : Int {
        return this.distanciaAbsolutaEntre(this.posicionX, otroPunto)
    }

    override fun distanciaYHacia(otroPunto: Int) : Int {
        return this.distanciaAbsolutaEntre(this.posicionY, otroPunto)
    }
}