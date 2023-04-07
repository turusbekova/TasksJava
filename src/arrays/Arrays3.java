package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args) {
        int [] years = new int[]{1999, 2005, 1809, 2022};
        System.out.println(Arrays.toString(years));
        years[2]= 2007;
        System.out.println(Arrays.toString(years));
//        System.out.println(years[3]);
//
//        int [] ints = {1,2,3,4,};
//        System.out.println(years[0] + "  " + years[1]);
//
//        int [] var = {years[0], years[1]};
//        System.out.println(Arrays.toString(var));

        for (int i = 0; i < years.length; i++){
            System.out.print(years[i] + " ");
        }

        System.out.println("-----------------------------");

        for (int i : years){
            System.out.println(i + " ");
        }

        // int i : years --> 1: 1999
        // int i : years --> 2: 2005
        // int i : years --> 3: 2007
        // int i : years --> 2: 2022

        System.out.println("--------------------------");

//        int zero = 0;
//        while (zero < years.length){
//            System.out.println(years[zero]);
//            zero++;
//        }

        int zero = 0;
        int ten = 10;
        Scanner sc = new Scanner(System.in);
        while (zero < 10){
            System.out.println("Please enter your number: ");
            int b = sc.nextInt();
            if (b == 10){
                System.out.println(b);
                break;
            }
            zero++;
        }

    }
}
