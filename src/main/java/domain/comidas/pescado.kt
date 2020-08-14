package domain.comidas

import domain.gary

object pescado : comestible {

    override fun afectarHambreDe(gary : gary, raciones : Int) {
        domain.gary.disminuirHambreEn(raciones * 4)
    }
}