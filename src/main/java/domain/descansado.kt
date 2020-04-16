package domain

object descansado : estado {
    private var cantidadDeVecesJugadas : Int = 0

    override fun dormir(unosMinutos: Int, gary: gary) {

    }

    override fun jugarCon(unjuguete: juguete, gary: gary) {
        this.cantidadDeVecesJugadas++
        unjuguete.jugarCon(gary)
        verificarCansancioDe(gary)
    }

    private fun verificarCansancioDe(gary: gary){
        if (this.cantidadDeVecesJugadas >= 5) {
            gary.setEstado(cansado)
            resetearContador()
        }
    }

    private fun resetearContador(){
        this.cantidadDeVecesJugadas = 0
    }
}