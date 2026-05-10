package edu.teamrocket;

public class Carrera {

    private final String tarjetaCredito;
    private String origen;
    private String destino;
    private double distancia;
    private int tiempoEsperado;
    private int tiemporCarrera;
    private double costeTotal;
    private int propina;
    private Conductor conductor;

    public Carrera(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getTarjetaCredito() {
        return this.tarjetaCredito;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getOrigen() {
        return this.origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getDistancia() {
        return this.distancia;
    }

    public void setTiempoEsperado(int tiempoEsperado) {
        this.tiempoEsperado = tiempoEsperado;
    }

    public int getTiempoEsperado() {
        return this.tiempoEsperado;
    }

    public void setTiemporCarrera(int tiemporCarrera) {
        this.tiemporCarrera = tiemporCarrera;
    }

    public int getTiemporCarrera() {
        return this.tiemporCarrera;
    }

    public double getCosteEsperado() {
        return Tarifa.getCosteTotal(this);
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void asignarConductor(PoolConductores conductores) {
        this.conductor = conductores.asignarConductor();
        this.conductor.setOcupado(true);
    }

    public void realizarPago(double pago) {
        this.costeTotal += pago;
    }

    public void recibirPropina(int propina) {
        this.propina = propina;
        this.costeTotal += propina;
    }

    public void liberarConductor() {
        this. conductor.setOcupado(false);
        this.conductor = null;
    }
}
