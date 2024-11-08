package main;

public class Duplicados {
    public static String duplicados(int[] num1) {
        String resultado = "";
        for (int i = 0; i < num1.length; i++) {
            for (int j =i + 1; j < num1.length; j++)
                if (num1[i] == num1[j]) {
                    resultado += num1[j] + " ";
                    break;
                }
        }
        return resultado;
    }

    public static void main(String[] args) {
        int[] num = {4, 5, 7, 9, 6, 2, 7, 4};

        System.out.println(Duplicados.duplicados(num));

    }
}