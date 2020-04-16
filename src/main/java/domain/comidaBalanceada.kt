package domain

object comidaBalanceada : comestible {

    override fun afectarHambreDe(gary : gary, raciones : Int) {
        gary.disminuirHambreEn(raciones * 3)
    }
}