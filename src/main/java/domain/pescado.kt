package domain

object pescado : comestible{

    override fun afectarHambreDe(gary : gary, raciones : Int) {
        gary.disminuirHambreEn(raciones * 4)
    }
}