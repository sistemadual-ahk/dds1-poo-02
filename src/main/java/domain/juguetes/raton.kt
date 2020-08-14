package domain.juguetes

import domain.gary

object raton : juguete {

    override fun jugarCon(gary: gary) {
        domain.gary.aumentarDiversionEn(10)
    }
}