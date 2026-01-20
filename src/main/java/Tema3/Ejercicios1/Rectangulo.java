package Tema3.Ejercicios1;

public class Rectangulo {

    int alto;
    int ancho;

    /*
    Un metodo constructor que no reciba ningún parámetro y que inicialice las dimensiones
          del rectángulo (largo y ancho) con dos enteros positivos por defecto.
     */
    public Rectangulo() {
        this(5, 10);
    }

    /*
    Otro metodo constructor que reciba el ancho y el largo como parámetros.
    Se debe chequear que ambos valores sean positivos antes de asignárselos
    a los atributos correspondientes. En caso contrario, se asignarán valores por defecto.
     */
    public Rectangulo(int alto, int ancho) {
        if (alto > 0 && ancho > 0) {
            this.alto = alto;
            this.ancho = ancho;
        } else {
            this.alto = 5;
            this.ancho = 10;
        }
//        if (alto > 0) {
//            this.alto = alto;
//        } else {
//            this.alto = 5;
//        }
//        if (ancho > 0) {
//            this.ancho = ancho;
//        } else {
//            this.ancho = 10;
//        }
    }

    /*
    Métodos get y set para la clase.
    Los métodos set deben chequear que las nuevas dimensiones efectivamente sean enteros positivos.
     */

    public int getAlto() {
        return alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAlto(int alto) {
        if (alto > 0) this.alto = alto;
    }

    public void setAncho(int ancho) {
        if (ancho > 0) this.ancho = ancho;
    }

    /*
    Un metodo que calcule y retorne el área del rectángulo.
     */
    public double getArea() {
        return alto * ancho;
    }

    /*
    Metodo que calcule y retorne el perímetro del rectángulo.
     */
    public double getPerimetro() {
        return (alto + ancho) * 2;
    }

    /*
    Otro metodo que determine si el rectángulo es horizontal o vertical.
    Decimos que el rectángulo es horizontal si el valor del largo es mayor que el del ancho.
    En caso contrario, decimos que el rectángulo es vertical.
     */
    /*
    3 casos:
        - más alto que ancho --> 1
        - más ancho que alto --> -1
        - cuadrado (iguales) --> 0
     */
    public int orientacion() {
        if (ancho == alto) {
            System.out.println("Cuadrado");
            return 0;
        } else if (ancho > alto) {
            System.out.println("Horizontal");
            return -1;
        } else {
            System.out.println("Vertical");
            return 1;
        }
    }

    /*
    Un metodo que despliegue en pantalla los valores de las dimensiones (largo y ancho) del rectángulo.
     */
    public void muestraInformacion() {
        System.out.println(this.toString());
    }

    public String toString() {
        return "Rectangulo de alto " + alto + " y ancho " + ancho;
    }

    public void pintar() {
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("■ ");
            }
            System.out.println();
        }
    }

}
