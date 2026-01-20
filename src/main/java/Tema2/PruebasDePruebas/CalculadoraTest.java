package Tema2.PruebasDePruebas;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraTest {

    @org.junit.jupiter.api.Test
    void suma() {
        assertEquals(2, Calculadora.suma(1, 1));
        assertEquals(4, Calculadora.suma(2, 2));
        assertEquals(0, Calculadora.suma(1, -1));
        assertEquals(0, Calculadora.suma(-1, 1));
        assertEquals(-2, Calculadora.suma(-1, -1));


        assertEquals(2d, Calculadora.suma(1d, 1d));
        assertEquals(4d, Calculadora.suma(2d, 2d));
        assertEquals(0d, Calculadora.suma(1d, -1d));
        assertEquals(0d, Calculadora.suma(-1d, 1d));
        assertEquals(-2d, Calculadora.suma(-1d, -1d));
    }

    @org.junit.jupiter.api.Test
    void multiplica() {
    }

    @org.junit.jupiter.api.Test
    void divide() {
        assertEquals(2, Calculadora.divide(4, 2));
        assertEquals(0, Calculadora.divide(4, 0));
    }
}