package Practice;

import java.util.Arrays;

public class Practice3 {
    public static void main(String[] args) {
//        Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.
        int[] mass = {10,3,5,6};
        int[] mass1 = {7,8,9,4};
        System.out.println(num(mass));
        System.out.println(num(mass));
//
//        bigDiff([10, 3, 5, 6]) → 7
//        bigDiff([7, 2, 10, 9]) → 8
//        bigDiff([2, 10, 7, 2]) → 8
    }
    public static  int num (int [] num1){
        int min = num1[0];
        int max = num1[0];
        for (int i = 0; i < num1.length; i++){
         min = Math.min(min,num1[i]);
         max = Math.max(max,num1[i]);

        } return max-min;
    }
}
