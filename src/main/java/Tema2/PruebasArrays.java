package Tema2;

import java.util.Arrays;

public class PruebasArrays {

    public static void main(String[] args) {

        int notaPrimerExamenCARLA = 7;
        int notaSegundoExamenCARLA = 6;

        int[] notasCarla = new int[3];
        notasCarla[0] = 7;
        notasCarla[1] = 9;
        notasCarla[2] = 4;
        System.out.println(Arrays.toString(notasCarla));
        int[] notasCarlaAuxiliares = notasCarla;
        notasCarla = new int[4];
        // Copiamos los valores
        for (int i = 0; i < notasCarlaAuxiliares.length; i++) {
            notasCarla[i] = notasCarlaAuxiliares[i];
        }
        notasCarla[3] = 9;
        System.out.println("notasCarla :: " + Arrays.toString(notasCarla));
        System.out.println("notasCarlaAuxiliares :: " + Arrays.toString(notasCarlaAuxiliares));

        // Ya tenemos en notasCarla los 4 valores
        int[] otra = notasCarla;
        otra[3] = 1;
        System.out.println("otra :: " + Arrays.toString(otra));
        System.out.println("notasCarla :: " + Arrays.toString(notasCarla));

        // Inicialización
        int[] masNotas = {4, 5, 6, 7};
        System.out.println("masNotas :: " + Arrays.toString(masNotas));

    }

}
