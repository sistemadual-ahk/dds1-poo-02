package domain

object chaquetaDeJean : prendaAbrigable {

    override fun abrigarA(gary: gary) {
        gary.aumentarTemperaturaCorporalEn(0.4)
    }

    override fun quitateDe(gary: gary) {
        gary.disminuirTemperaturaCorporalEn(0.4)
    }
}