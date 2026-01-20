package Tema3.Ejercicios1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectanguloTest {

    @Test
    void creacion() {
        Rectangulo r = new Rectangulo();
        assertEquals(5, r.getAlto());
        assertEquals(10, r.getAncho());

        Rectangulo r2 = new Rectangulo(7, 9);
        assertEquals(7, r2.getAlto());
        assertEquals(9, r2.getAncho());

        Rectangulo r3 = new Rectangulo(-1, 9);
        assertEquals(5, r3.getAlto());
        assertEquals(10, r3.getAncho());

        Rectangulo r4 = new Rectangulo(10, -1);
        assertEquals(5, r4.getAlto());
        assertEquals(10, r4.getAncho());

        Rectangulo r5 = new Rectangulo(-10, -1);
        assertEquals(5, r5.getAlto());
        assertEquals(10, r5.getAncho());

        Rectangulo r6 = new Rectangulo(0, 0);
        assertEquals(5, r6.getAlto());
        assertEquals(10, r6.getAncho());
        r6.setAlto(-1);
        assertEquals(5, r6.getAlto());
        r6.setAncho(-1);
        assertEquals(10, r6.getAncho());
        r6.setAlto(100);
        assertEquals(100, r6.getAlto());
        r6.setAncho(200);
        assertEquals(200, r6.getAncho());
        System.out.println("hola");

        // El cero para Rafa
        Rectangulo r7 = new Rectangulo(0, 0);
        assertEquals(5, r7.getAlto());
        assertEquals(10, r7.getAncho());

    }

    @Test
    void getArea() {
        Rectangulo r = new Rectangulo(10, 20);
        assertEquals(200, r.getArea());
    }

    @Test
    void getPerimetro() {
        Rectangulo r = new Rectangulo(10, 20);
        assertEquals(60, r.getPerimetro());
    }

    @Test
    void orientacion() {
        Rectangulo r = new Rectangulo(10, 20);
        assertEquals(-1, r.orientacion());
        Rectangulo r2 = new Rectangulo(20, 10);
        assertEquals(1, r2.orientacion());
        Rectangulo r3 = new Rectangulo(20, 20);
        assertEquals(0, r3.orientacion());
    }

    @Test
    void pantalla() {
        Rectangulo r = new Rectangulo(12, 3);
        assertEquals("Rectangulo de alto 12 y ancho 3", r.toString());
        r.pintar();
    }

}