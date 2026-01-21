package Tema3.Ejercicios2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    @Test
    void calcularIMC() {

        Persona personaH = new Persona("H");
        assertEquals(Persona.NO_CALCULADO, personaH.calcularIMC());

        Persona personaFlaca = new Persona("Flaca", 20, 'H', 60, 190);
        assertEquals(Persona.DELGADO, personaFlaca.calcularIMC());

        Persona personaGorda = new Persona("Gorda", 20, 'H', 120, 167);
        assertEquals(Persona.SOBREPESO, personaGorda.calcularIMC());

        Persona personaNormal = new Persona("Normal", 20, 'H', 60, 160);
        assertEquals(Persona.NORMAL, personaNormal.calcularIMC());

    }
}