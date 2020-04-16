package domain

import kotlin.math.abs

object habitacion : lugarVisitable {
    private var desorden :  Int = 0
    private var posicionX : Int = 14
    private var posicionY : Int = 10

    fun desordenTotal() : Int{
        return this.desorden
    }

    override fun getPosicionX(): Int {
        return this.posicionX
    }

    override fun getPosiconY(): Int {
        return this.posicionY
    }

    override fun serVisitadoPorGary() {
        this.desorden++
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