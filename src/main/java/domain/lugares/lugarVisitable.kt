package domain.lugares

interface lugarVisitable {
    fun serVisitadoPorGary()
    fun distanciaXHacia(otroPunto: Int) : Int
    fun distanciaYHacia(otroPunto : Int) : Int
    fun getPosicionX() : Int
    fun getPosiconY() : Int
}