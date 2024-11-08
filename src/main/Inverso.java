package main;

import java.util.Arrays;

public class Inverso {
    public static int[] alReves(int[] num){
        int [] inverso = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            inverso[i] = num[num.length-1-i];
        }
        return inverso;
    }
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5,6,7,8,9,10};
        int[] numInvertido = alReves(num);

        System.out.println("Array original" + Arrays.toString(num));
        System.out.println("array invertido: "+Arrays.toString(alReves(num)));
    }
}
