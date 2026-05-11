package edu.teamrocket;

public class Tarifa {

    protected static final double COSTE_MILLA = 1.35;
    protected static final double COSTE_MINUTO = 0.35;
    protected static final double COSTE_MINIMO = 5;
    protected static final double PORCENTAJE_COMISION = 0.20;

    private Tarifa() {
    }

    public static double getCosteDistancia(double distancia) {
        return distancia * COSTE_MILLA;
    }

    public static double getCosteTiempo(int tiempo) {
        return tiempo * COSTE_MINUTO;
    }

    public static double getCosteTotal(Carrera carrera) {

        if (getCosteDistancia(carrera.getDistancia()) +
                getCosteTiempo(carrera.getTiempoEsperado()) < 5) {
            return COSTE_MINIMO;
        } else {
            return getCosteDistancia(carrera.getDistancia()) +
                    getCosteTiempo(carrera.getTiempoEsperado());
        }
    }
}
