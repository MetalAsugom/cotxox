package edu.teamrocket;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TarifaTest {
    
    @Test
    void getCosteDistanciaTest() {

        double distancia = 530;
        assertEquals(715.5, Tarifa.getCosteDistancia(distancia));
    }

    @Test
    void getCosteTiempoTest() {

        int tiempo = 40;
        assertEquals(14, Tarifa.getCosteTiempo(tiempo));
    }

    @Test
    void getCosteTotalTest() {

        String tarjetaCredito = "4916119711304546";
		String origen = "Aeroport Son Sant Joan";
		String destino = "Magaluf";
        Carrera carrera = new Carrera(tarjetaCredito);
        int tiempo = 1;
        double distancia = 2;
		carrera.setOrigen(origen);
		carrera.setDestino(destino);
		carrera.setDistancia(distancia);
		carrera.setTiempoEsperado(tiempo);
        assertEquals(5, Tarifa.getCosteTotal(carrera));
    }
}
