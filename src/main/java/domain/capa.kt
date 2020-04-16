package domain

object capa : prendaAbrigable {

    override fun abrigarA(gary: gary) {
        gary.aumentarTemperaturaCorporalEn(0.1)
    }

    override fun quitateDe(gary: gary) {
        gary.disminuirTemperaturaCorporalEn(0.1)
    }
}