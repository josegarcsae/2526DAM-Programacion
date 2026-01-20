package Tema2;

public class Cadenas {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            sb.append(i).append("-");
        }
        System.out.println(sb.subSequence(0, sb.length() - 1));

    }
}
