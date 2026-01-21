package Tema3.Ejercicios2;

import java.util.Random;

public class Persona {

    private String nombre;
    private int edad;
    private String DNI;
    private char sexo; // H / M
    private int peso; // En Kg
    private int altura; // En cm

    public Persona(String n) {
        this.nombre = n;
        this.DNI = generaDNI();
    }
    public Persona(String n, int e, char s) {
        this(n);
        this.edad = e;
        this.sexo = s;
    }
    public Persona(String n, int e, char s, int p, int a) {
        this(n, e, s);
        this.peso = p;
        this.altura = a;
    }

    /*
    calcularIMC():
    calculara si la persona está en su peso ideal (peso en kg/(altura^2 en m)),
    si esta fórmula devuelve un valor menor que 20, el metodo devuelve un -1,
    si devuelve un número entre 20 y 25 (incluidos), está en un peso normal, por tanto,
    devuelve un 0 y si devuelve un valor mayor que 25 significa que tiene sobrepeso,
    devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.
     */
    public static final int NORMAL = 0;
    public static final int SOBREPESO = 1;
    public static final int DELGADO = -1;
    public static final int NO_CALCULADO = 99;
    public static final int LIMITE_DELGADEZ = 20;
    public static final int LIMITE_GORDURA = 25;

    public int calcularIMC() {
        if (peso > 0 && altura > 0) {
            double resultado = peso / (altura/100d * altura/100d);
            if (resultado < LIMITE_DELGADEZ) {
                return DELGADO;
            } else if (resultado > LIMITE_DELGADEZ && resultado < LIMITE_GORDURA) {
                return NORMAL;
            } else {
                return SOBREPESO;
            }
        } else {
            return NO_CALCULADO;
        }
    }

    /*
    comprueba que el sexo introducido es correcto. Si no es correcto, será H.
    No sería visible al exterior. Devolverá el carácter correspondiente al sexo.
     */
    public char comprobarSexo(char sexo) {
        if (sexo == 'M') {
            this.sexo = 'M';
        } else {
            this.sexo = 'H';
        }
        return this.sexo;
    }

    public String toString() {
        int imc = this.calcularIMC();
        String imcTexto = "";
        switch (imc) {
            case NORMAL: imcTexto = "Normal"; break;
            case SOBREPESO: imcTexto = "Sobrepeso"; break;
            case DELGADO: imcTexto = "Delgado"; break;
            default: imcTexto = "No calculado"; break;
        }
        return this.nombre + " (" + this.edad + ") IMC " + imcTexto;
    }

    /*
    generaDNI(): genera un número aleatorio de 8 cifras y con ese número,
    calcula su letra correspondiente. Este metodo será invocado cuando se construya el objeto.
    No será visible al exterior.
    Para calcular el DNI se debe obtener el módulo 23 del número. Y una vez obtenido,
    se relaciona el resto con la letra correspondiente:
     */
    public static final String DNI_LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
    private String generaDNI() {
        Random r = new Random();
        int numero = r.nextInt(1000000,99999999);
        int resto = numero % 23;
        char letra = DNI_LETRAS.charAt(resto);
        // Montamos el DNI
        StringBuilder dniBuilder = new StringBuilder();
        if (numero < 10000000) {
            // Si entra aquí es menor de 10mill y mayor que 1mill
            dniBuilder.append("0");
        }
        dniBuilder.append(numero);
        dniBuilder.append(letra);
        return dniBuilder.toString();
    }

}
