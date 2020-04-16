package domain

import org.junit.Test
import org.junit.Assert.*

class GaryTest {

    @Test
    fun garyVisitaLugares() {
        gary.caminaHacia(cocina)
        assertEquals(2, cocina.cantidadDePelos())
        assertEquals(10, gary.getEnergia())
        assertEquals(10, gary.getHambre())

        gary.caminaHacia(habitacion)
        assertEquals(1, habitacion.desordenTotal())

        gary.caminaHacia(casaDelVecino)
        assertEquals(8, gary.getEnergia())
        assertEquals(18, gary.getHambre())
        assertEquals(1, casaDelVecino.cantidadDeVecesVisitado())
    }

    @Test
    fun garyAbrigate() {
        gary.abrigateCon(buso)
        assertEquals(37.5, gary.getTemperaturaCorporal(), 0.0)

        gary.sacateElAbrigo()
        assertEquals(37.0, gary.getTemperaturaCorporal(), 0.0)

        gary.abrigateCon(capa)
        assertEquals(37.1, gary.getTemperaturaCorporal(), 0.0)

        gary.sacateElAbrigo()
        assertEquals(37.0, gary.getTemperaturaCorporal(), 0.0)

        gary.abrigateCon(chaquetaDeJean)
        assertEquals(37.4, gary.getTemperaturaCorporal(), 0.0)

        gary.sacateElAbrigo()
        assertEquals(37.0, gary.getTemperaturaCorporal(), 0.0)
    }

    @Test
    fun garyJugaConRaton() {
        gary.jugarCon(raton)
        assertEquals(10, gary.getDiversion())
    }

    @Test
    fun garyJugaConRatonYAburrite(){
        gary.jugarCon(raton)
        gary.jugarCon(raton)
        gary.jugarCon(raton)
        gary.jugarCon(raton)
        gary.jugarCon(raton)
        gary.jugarCon(raton)
        assertEquals(50, gary.getDiversion())
    }

    @Test
    fun garyJugaLuegoDesaburrite() {
        gary.jugarCon(raton)
        assertEquals(50, gary.getDiversion())

        gary.dormi(30)
        gary.jugarCon(raton)
        assertEquals(60, gary.getDiversion())
    }
}