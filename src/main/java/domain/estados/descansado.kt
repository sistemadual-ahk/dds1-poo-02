package domain.estados

import domain.gary
import domain.juguetes.juguete

object descansado : estado {
    private var cantidadDeVecesJugadas : Int = 0

    override fun dormir(unosMinutos: Int, gary: gary) {

    }

    override fun jugarCon(unjuguete: juguete, gary: gary) {
        cantidadDeVecesJugadas++
        unjuguete.jugarCon(gary)
        verificarCansancioDe(gary)
    }

    private fun verificarCansancioDe(gary: gary){
        if (cantidadDeVecesJugadas >= 5) {
            domain.gary.setEstado(cansado)
            resetearContador()
        }
    }

    private fun resetearContador(){
        cantidadDeVecesJugadas = 0
    }
}