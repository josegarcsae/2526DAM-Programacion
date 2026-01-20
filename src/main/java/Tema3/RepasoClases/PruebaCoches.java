package Tema3.RepasoClases;

public class PruebaCoches {
    public static void main(String[] args) {

        Coche cocheLaura = new Coche("5554ABF", "azul", "Ford");
        System.out.println(cocheLaura);
        cocheLaura.conducir(120);
        System.out.println(cocheLaura);
        cocheLaura.conducir(130);
        System.out.println(cocheLaura);

        Coche cocheMartin = cocheLaura;
        cocheMartin.conducir(100);
        System.out.println(cocheLaura);

        Coche cocheJoseLuis = new Coche("4546BDH", "verde", "Opel", 34000);
        System.out.println(cocheJoseLuis);

        cocheMartin = new Coche("7865FDM", "rojo", "Peugeot", 45000);
        System.out.println("Martin :: " + cocheMartin);
        System.out.println("Laura :: " + cocheLaura);
        System.out.println(cocheMartin);
        cocheMartin.conducir(100);
        System.out.println("Martin :: " + cocheMartin);
        System.out.println("Laura :: " + cocheLaura);

        cocheJoseLuis = new Coche("8746FGH", "rojo", "Ferrari", 12000);
        System.out.println(cocheJoseLuis);

    }
}
