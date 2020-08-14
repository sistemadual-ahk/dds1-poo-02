package domain.prendas

import domain.gary

object capa : prendaAbrigable {

    override fun abrigarA(gary: gary) {
        domain.gary.aumentarTemperaturaCorporalEn(0.1)
    }

    override fun quitateDe(gary: gary) {
        domain.gary.disminuirTemperaturaCorporalEn(0.1)
    }
}