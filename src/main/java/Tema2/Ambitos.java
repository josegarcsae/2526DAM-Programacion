package Tema2;

public class Ambitos {

    public static void main(String[] args) {

        int edad = 74;

        if (edad > 65) {
            System.out.println("Enhorabuena, estás jubilado, su billete a Benidorm");
            float pension = calculameLaPension(edad);
            System.out.println("Y su pensión es de " + pension);
            System.out.println(edad);
        }

//        NO se puede
//        System.out.println(pension);

    }

    static float calculameLaPension(int e) {
        e++;
        return e * 10;
    }

}
