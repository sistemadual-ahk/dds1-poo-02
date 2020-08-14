package domain.comidas

import domain.gary

object ceso : comestible {

    override fun afectarHambreDe(gary : gary, raciones : Int) {
        domain.gary.disminuirHambreEn(raciones * 2)
    }
}