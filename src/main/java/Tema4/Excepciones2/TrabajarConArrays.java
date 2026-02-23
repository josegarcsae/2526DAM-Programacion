package Tema4.Excepciones2;

public class TrabajarConArrays {
    public static void main(String[] args) {

        int[] myArray = new int[5];
        myArray[0] = 1;
        myArray[1] = 2;

        // Mala práctica
        // NO se debe comprobar RuntimeException
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(myArray[i]);
            }
        } catch (RuntimeException e) {
            System.out.println("Soy un gañán, no sé iterar un array");
        }

    }
}
