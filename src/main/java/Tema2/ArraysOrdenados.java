package Tema2;

import java.util.Arrays;
import java.util.Random;

public class ArraysOrdenados {
    public static void main(String[] args) {

        int[] arr = new int[20];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(estaOrdenado(arr) ? "Está ordenado" : "NO está ordenado");

    }

    private static boolean estaOrdenado(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int elementoActual = arr[i];
            int elementoSiguiente = arr[i + 1];
            if (elementoSiguiente < elementoActual) {
                return false;
            }
        }
        return true;
    }
}
