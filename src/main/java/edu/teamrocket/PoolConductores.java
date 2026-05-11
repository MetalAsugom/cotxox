package edu.teamrocket;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class PoolConductores {

    private List<Conductor> conductores = new ArrayList<>();

    public PoolConductores(List<Conductor> conductores) {
        this.conductores = conductores;
    }

    public List<Conductor> getPoolConductores() {
        return this.conductores;
    }

    public Conductor asignarConductor() {
        int indiceConductor = ThreadLocalRandom.current().nextInt(getPoolConductores().size());
        return conductores.get(indiceConductor);
    }

}