package edu.teamrocket;

import java.util.ArrayList;

public class Conductor {
    private String nombre;
    private String modelo;
    private String matricula;
    private double valoracionMedia = 0;
    private boolean ocupado;
    private ArrayList<Byte> valoraciones = new ArrayList<>();

    public Conductor() {

    }

    public Conductor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public ArrayList<Byte> getValoraciones() {
        return this.valoraciones;
    }

    public void  setValoracion(byte valoracion) {
        valoraciones.add(valoracion);
    }

    public double getValoracion() {
        return calcularValoracionMedia();
    }

    public int getNumeroValoraciones() {
        return getValoraciones().size();
    }

    private double calcularValoracionMedia() {

        for (byte valoracion : getValoraciones()) {
            this.valoracionMedia += valoracion;
        }
        return this.valoracionMedia / getNumeroValoraciones();
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public boolean isOcupado() {
        if (this.ocupado) {
            return this.ocupado;
        }
        else {
            setOcupado(false);
            return this.ocupado;
        }
    }

    

    

    

    

    


}
