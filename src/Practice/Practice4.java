package Practice;

import java.util.Arrays;

public class Practice4 {
    public static void main(String[] args) {
        // Дан массив, содержащий положительные и отрицательные числа. 
        // Заменить все элементы массива на противоположные по знаку.
        // Например, задан массив [1, -5, 0, 3, -4]. 
        // После преобразования должно получиться [-1, 5, 0, -3, 4].
//        int num1[] = {1, -2, 0, -4};
//        System.out.println(Arrays.toString(negative(num1)));
//    }
//
//    public static int[] negative(int num1[]) {
//        int res[] = new int[num1.length];
//        for (int i = 0; i < num1.length; i++) {
//            res[i] = num1[i] * -1;
//
//        }
//        return res;
        int nums [] = {1, -5, 0, 3, -4};

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(negative(nums)));
    }
    public static int [] negative(int nums []){
        for( int i = 0; i < nums.length; i++){
            nums [i] = nums[i] * -1;
        }
        return nums;

    }

}

