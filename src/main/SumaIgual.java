package main;

import java.util.Scanner;

public class SumaIgual {
    public static void main(String[] args) {
        int[] nums = {5, 6, 7, 3, 4, 5, 6, 7};
        String res = "";
        Scanner sc  = new Scanner(System.in);

        for (int i = 0; i < nums.length; i++){
            for (int j = i +1; j < nums.length; j ++){
                if (nums[i] == nums[j]){
                    res += "[" + nums[i]+ " + " + nums[j] + "]";
                }
            }
            System.out.println(res);
        }
    }
}
