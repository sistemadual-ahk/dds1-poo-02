package domain.estados

import domain.gary
import domain.juguetes.juguete

interface estado {
    fun jugarCon(unjuguete: juguete, gary : gary)
    fun dormir(unosMinutos : Int, gary: gary)
}