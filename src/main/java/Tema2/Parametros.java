package Tema2;

import java.util.Arrays;

public class Parametros {

    public static void main(String[] args) {

        int[] numero = {3};
        hazAlgo(numero);

        System.out.println("numero vale " + Arrays.toString(numero));

    }

    static void hazAlgo(int[] num) {
        num[0]++;
        System.out.println("num vale " + Arrays.toString(num));
    }

}
