package Tema4.ExcepcionesPresentacion.Division;

import Tema4.ExcepcionesPresentacion.Producto.ValorInvalidoException;

public class DivisionSimple {

    public static void realizarDivision(String numerador, String denominador) {

        try {
            int num = Integer.parseInt(numerador);
            int den = Integer.parseInt(denominador);
            if (den == 0) throw new ArithmeticException("El denominador no puede ser cero");
            double division = (double) num / den;
            System.out.println("La división da " + division);
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("No podemos realizar la división: " + e.getMessage());
        }

    }




}
