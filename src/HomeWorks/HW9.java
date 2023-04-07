package HomeWorks;

import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int num1 = scan.nextInt();
        System.out.println("Enter second integer: ");
        int num2 = scan.nextInt();

        num1 += num2;
        System.out.println("Sum of two numbers: " + num1);
        num1 -= num2;
        System.out.println("Difference of two numbers: " + num1);
        num1 *= num2;
        System.out.println("Product of two numbers: " + num1);
        num1 /= num2;
        System.out.println("Average of two numbers: " + num1);
        System.out.println("Distance of two numbers: " + Math.abs(num1 - num2));
        System.out.println("Max integer: " + Math.max(num1,num2));
        System.out.println("Min integer: " + Math.min(num1,num2));



    }
}
