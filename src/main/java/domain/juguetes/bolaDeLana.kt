package domain.juguetes

import domain.gary

object bolaDeLana : juguete {

    override fun jugarCon(gary: gary) {
        domain.gary.aumentarDiversionEn(5)
    }
}