package domain

object gary {
    private var color : String? = "Naranja"
    private var hambre : Int = 10
    private var energia : Int = 10
    private var posicionX : Int = 0
    private var posicionY : Int = 0
    private var temperaturaCorporalActual : Double = 37.0
    private var prenda : prendaAbrigable? = null
    private var diversion : Int = 0
    private var estado : estado = descansado

    fun getColor() : String? {
        return this.color
    }

    fun getEnergia() : Int {
        return this.energia
    }

    fun getHambre() : Int {
        return this.hambre
    }

    fun getDiversion() : Int {
        return this.diversion
    }

    fun getTemperaturaCorporal() : Double {
        return this.temperaturaCorporalActual
    }

    fun setEstado(estado: estado){
        this.estado = estado
    }

    fun come(algunasRaciones : Int){
        this.hambre -= algunasRaciones
    }

    fun come(algunasRaciones: Int, comida : comestible){
        comida.afectarHambreDe(this, algunasRaciones)
    }

    fun dormi(unosMinutos : Int){
        this.energia += 2 * (unosMinutos/30)
        this.estado.dormir(unosMinutos, this)
    }

    fun jugarCon(unjuguete: juguete){
        this.estado.jugarCon(unjuguete, this)
    }

    fun abrigateCon(unaPrenda : prendaAbrigable){
        this.prenda = unaPrenda
        unaPrenda.abrigarA(this)
    }

    fun sacateElAbrigo(){
        this.prenda!!.quitateDe(this)
        this.prenda = null
    }

    fun aumentarDiversionEn(algunasUnidades: Int){
        this.diversion += algunasUnidades
    }

    private fun aumentarHambreEn(algunasUnidades : Int){
        this.hambre += algunasUnidades
    }

    private fun disminuirEnergiaEn(algunasUnidades: Int){
        this.energia -= algunasUnidades
    }

    fun aumentarTemperaturaCorporalEn(algunasUnidades: Double){
        this.temperaturaCorporalActual += algunasUnidades
    }

    fun disminuirTemperaturaCorporalEn(algunasUnidades: Double){
        this.temperaturaCorporalActual -= algunasUnidades
    }

    fun disminuirHambreEn(algunasUnidades: Int){
        this.hambre -= algunasUnidades
    }

    fun camina(unosMetros : Int){
        disminuirEnergiaEn(unosMetros/70)
        aumentarHambreEn(2 * (unosMetros/40))
    }

    fun caminaHacia(unLugar : lugarVisitable){
        unLugar.serVisitadoPorGary()
        desplazarEnEjeXHacia(unLugar)
        desplazarEnEjeYHacia(unLugar)
    }

    private fun desplazarEnEjeXHacia(unLugar: lugarVisitable){
        var unParDeMetrosEnX = unLugar.distanciaXHacia(this.posicionX)
        this.posicionX = unLugar.getPosicionX()
        camina(unParDeMetrosEnX)
    }

    private fun desplazarEnEjeYHacia(unLugar: lugarVisitable){
        var unParDeMetrosEnY = unLugar.distanciaYHacia(this.posicionY)
        this.posicionY = unLugar.getPosiconY()
        camina(unParDeMetrosEnY)
    }
}