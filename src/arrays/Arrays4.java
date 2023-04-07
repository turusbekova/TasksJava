package arrays;

import java.util.Arrays;

public class Arrays4 {
    public static void main(String[] args) {

//        int num [] = new int[0];
//        System.out.println(Arrays.toString(num));

        int nums [][] = new int[2][3]; // многомерный массив
        // 1-ая [] - сколько скобок, 2-ая [] - сколько элементов
        //   0   1    2    0    1   2
        // [[10, 89, 65], [10, 89, 65]]
        //        0           1
        nums[0][0] = 10;
        nums[0][1] = 89;
        nums[0][2] = 65;

        nums[1][0] = 10;
        nums[1][1] = 89;
        nums[1][2] = 65;

        System.out.print(Arrays.deepToString(nums));
        System.out.println();
        System.out.println(nums[0][1] + "\n" + nums[1][1]);
        System.out.println(nums[1][2]);

        System.out.println("-----------------------------");
        for(int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("----------------------------------");

        int nums2 [][] = new int[][]{{23,76,45}, {12,43,65}}; // new + ТИП ДАННЫХ = СТАРАЯ ВЕРСИ //

        System.out.println(Arrays.deepToString(nums2));
        // deeptoString - в цикле не используется
        System.out.println("-------------------------------");

        int nums3 [][] = {{1,2,3,4,5,6,7}, {2,4,6,4,5,8,7}, {1,2,3,4,5,6,7}, {9,8,7,6,5,4,3}};
        // можно и без new объекта
        System.out.println(Arrays.deepToString(nums3));
        System.out.println("-----------------------------------");

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 7; j++){
                System.out.print(nums3[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
        double nums5 [][] = {{2.3,4.5,43.1,23.4},{2.3,4.5,43.1,23.4},{2.3,4.5,43.1,23.4}};
        System.out.println(Arrays.deepToString(nums5));

        System.out.println("-----------------------------");
        for( int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(nums5[i][j] + "   ");
            }
            System.out.println();
        }

        // трехмерный массив - разобрать в цикле
    }
    }

