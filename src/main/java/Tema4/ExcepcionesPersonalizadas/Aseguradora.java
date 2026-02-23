package Tema4.ExcepcionesPersonalizadas;

import java.util.Arrays;

public class Aseguradora {

    private Persona[] personas;

    public Aseguradora() {
        this.personas = new Persona[10];
    }

    public String toString() {
        return Arrays.toString(this.personas);
    }

    public boolean añadirAsegurado(Persona persona) throws DemasiadoJovenException, DemasiadoMayorException {
        if (persona.getEdad() < 18)
            throw new DemasiadoJovenException("No se puede hacer un seguro con " + persona.getEdad() + " años");
        if (persona.getEdad() > 75)
            throw new DemasiadoMayorException("No se puede hacer un seguro tan mayor, deja de conducir");
        for (int i = 0; i < personas.length; i++) {
            if (personas[i] == null) {
                personas[i] = persona;
                return true;
            }
        }
        return false;
    }

}
