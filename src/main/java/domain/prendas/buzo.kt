package domain.prendas

import domain.gary

object buzo : prendaAbrigable {

    override fun abrigarA(gary: gary) {
        domain.gary.aumentarTemperaturaCorporalEn(0.5)
    }

    override fun quitateDe(gary: gary) {
        domain.gary.disminuirTemperaturaCorporalEn(0.5)
    }
}