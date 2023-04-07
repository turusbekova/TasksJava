package practice1;

import java.util.Random;

public class Aiperi3 {
//    public static void main(String[] args){
//        int[][] a = new int[10][10];
//        int min = Integer.MAX_VALUE,
//                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             max = Integer.MIN_VALUE,
//                lmax = -1,
//                lmin = -1,
//                s = 0;
//
//        Random r = new Random();
//
//        for(int i = 0; i < 10; i++){
//            System.out.println();
//            for(int j = 0; j < 10; j++){
//                a[i][j] = r.nextInt(1000);
//                s += a[i][j];
//                System.out.print(a[i][j] + " ");
//            }
//            if(min > s){
//                min = s;
//                lmin = i;
//            }
//            if(max < s){
//                max = s;
//                lmax = i;
//            }
//        }
//        System.out.println();
//        System.out.println("Max in line " + (lmax + 1) +
//                ", min in line " + (lmin + 1));
//        for(int j = 0; j < 10; j++)
//            System.out.print(a[lmax][j] + " ");
//        System.out.print("sum = " + max);
//        System.out.println();
//        for(int j = 0; j < 10; j++)
//            System.out.print(a[lmin][j] + " ");
//        System.out.print("sum = " + min);
//    }

    public static void main(String[] args){
        int[][] a = new int[10][10];
        int min = Integer.MAX_VALUE,
                max = Integer.MIN_VALUE,
                lmax = -1,
                lmin = -1,
                s = 0;

        Random r = new Random();

        for(int i = 0; i < 10; i++){
            System.out.println();
            s = 0;
            for(int j = 0; j < 10; j++){
                a[i][j] = r.nextInt(1000);
                s += a[i][j];
                System.out.print(a[i][j] + " ");
            }
            if(min > s){
                min = s;
                lmin = i;
            }
            if(max < s){
                max = s;
                lmax = i;
            }
        }
        System.out.println();
        System.out.println("Max in line " + (lmax + 1) +
                ", min in line " + (lmin + 1));
        for(int j = 0; j < 10; j++)
            System.out.print(a[lmax][j] + " ");
        System.out.print("sum = " + max);
        System.out.println();
        for(int j = 0; j < 10; j++)
            System.out.print(a[lmin][j] + " ");
        System.out.print("sum = " + min);
    }
}
