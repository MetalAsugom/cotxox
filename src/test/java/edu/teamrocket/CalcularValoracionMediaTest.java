package edu.teamrocket;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcularValoracionMediaTest {

    @Test
    public void testValoracionMediaConductor() {
        Conductor conductor = new Conductor("Test");
        conductor.setValoracion((byte) 3);
        conductor.setValoracion((byte) 4);
        conductor.setValoracion((byte) 5);
        conductor.setValoracion((byte) 9);

        double media = conductor.getValoracion();

        assertEquals(5.25, media);
    }
}
