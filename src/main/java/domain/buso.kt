package domain

object buso : prendaAbrigable {

    override fun abrigarA(gary: gary) {
        gary.aumentarTemperaturaCorporalEn(0.5)
    }

    override fun quitateDe(gary: gary) {
        gary.disminuirTemperaturaCorporalEn(0.5)
    }
}