package domain.comidas

import domain.gary

object comidaBalanceada : comestible {

    override fun afectarHambreDe(gary : gary, raciones : Int) {
        domain.gary.disminuirHambreEn(raciones * 3)
    }
}