package domain.prendas

import domain.gary

object chaquetaDeJean : prendaAbrigable {

    override fun abrigarA(gary: gary) {
        domain.gary.aumentarTemperaturaCorporalEn(0.4)
    }

    override fun quitateDe(gary: gary) {
        domain.gary.disminuirTemperaturaCorporalEn(0.4)
    }
}