package Tema4.ExcepcionesPersonalizadas;

public class AseguradoraMain {
    public static void main(String[] args) {

        Aseguradora mapfre = new Aseguradora();

        Persona a1 = new Persona("Luis", 29);
        Persona a2 = new Persona("Marta", 35);

        addTomador(mapfre, a1);
        addTomador(mapfre, a2);
        addTomador(mapfre, new Persona("Matias", 16));
        addTomador(mapfre, new Persona("Tomás", 96));

        System.out.println(mapfre);

    }

    public static void addTomador(Aseguradora aseguradora, Persona asegurado) {
        try {
            aseguradora.añadirAsegurado(asegurado);
        } catch (DemasiadoJovenException e) {
            System.out.println("Has intentado añadir un tomador de seguro demasiado joven: " + e.getMessage());
        } catch (DemasiadoMayorException e) {
            System.out.println("Has intentado añadir un tomador de seguro demasiado mayor: " + e.getMessage());
        }
    }

}
