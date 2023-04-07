package HomeWorks;

import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int number = scan.nextInt();
//        if(number > 0){
//            System.out.println("Number is positive");
//        }
//        else if(number < 0){
//            System.out.println("Number is negative");
//        }

        int num = scan.nextInt();
        int num2 = scan.nextInt();
        if (num > num2){
            System.out.println(num);
        }
        else {
            System.out.println(num2);
        }
    }
}
