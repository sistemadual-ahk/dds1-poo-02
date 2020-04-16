package domain

object cansado : estado {

    override fun dormir(unosMinutos: Int, gary: gary) {
        if (unosMinutos >= 30)
            gary.setEstado(descansado)
    }

    override fun jugarCon(unjuguete: juguete, gary: gary) {

    }
}