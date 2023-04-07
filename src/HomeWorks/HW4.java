package HomeWorks;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        int num = 25;
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int res = num / num1;

        int num2 = scan.nextInt();
        int res2 = num % num2;
        int res3 = res + res2;
        System.out.println("The sum of the digits is: " + res3);


    }


}
