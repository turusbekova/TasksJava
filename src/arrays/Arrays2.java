package arrays;

import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {

        StringBuilder cars [] = new StringBuilder[3];

        cars [0] = new StringBuilder("BMW");
        cars [1] = new StringBuilder("Audi");
        cars [2] = new StringBuilder("Toyota");

        System.out.println(Arrays.toString(cars));

        System.out.println(cars[2]);

        StringBuilder audi = new StringBuilder(cars[1]);
        cars[2].reverse();
        System.out.println(Arrays.toString(cars));

        System.out.println("--------------------------");

        int [] num = new int[4]; // 0 1 2 3
        num[0] = 90;
        num[3] = 100;
//        num[4] = 34;
        System.out.println(Arrays.toString(num));

        String [] str = new String[3];
        System.out.println(Arrays.toString(str)); // null - пусто

        str[0] = "James";
        str[1] = "Bond";
        System.out.println(Arrays.toString(str));
    }
}
