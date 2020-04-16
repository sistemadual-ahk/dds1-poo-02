package domain

import kotlin.math.abs

object cocina : lugarVisitable {
    private var pelos : Int = 1
    private var posicionX : Int = 4
    private var posicionY : Int = 30

    fun cantidadDePelos() : Int{
        return this.pelos
    }

    override fun getPosicionX(): Int {
        return this.posicionX
    }

    override fun getPosiconY(): Int {
        return this.posicionY
    }

    override fun serVisitadoPorGary() {
        this.pelos *= 2
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