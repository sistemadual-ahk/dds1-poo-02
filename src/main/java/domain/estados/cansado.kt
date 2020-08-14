package domain.estados

import domain.gary
import domain.juguetes.juguete

object cansado : estado {

    override fun dormir(unosMinutos: Int, gary: gary) {
        if (unosMinutos >= 30)
            domain.gary.setEstado(descansado)
    }

    override fun jugarCon(unjuguete: juguete, gary: gary) {

    }
}