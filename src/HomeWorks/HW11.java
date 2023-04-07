package HomeWorks;

import java.util.Scanner;

public class HW11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num = scan.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scan.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = scan.nextInt();

        if (num > num2) {
            System.out.println("The greatest: " + num);
            if (num > num3) {
                System.out.println("The greatest: " + num);
                if (num2 > num) {
                    System.out.println("The greatest: " + num2);
                    if (num2 > num3) {
                        System.out.println("The greatest: " + num2);
                        if (num3 > num) {
                            System.out.println("The greatest: " + num3);
                            if (num3 > num2) {
                                System.out.println("The greatest: " + num3);
                            }
                        }
                    }
                }


            }
        }
    }
}