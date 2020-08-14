package domain.comidas

import domain.gary

interface comestible {
    fun afectarHambreDe(gary : gary, raciones : Int)
}