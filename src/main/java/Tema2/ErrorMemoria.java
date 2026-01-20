package Tema2;

public class ErrorMemoria {
    public static void main(String[] args) {

        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 100000; i++)
            s.append("hola");

        for (int i = 0; i < 100000; i++)
            s.append(s);


    }
}
