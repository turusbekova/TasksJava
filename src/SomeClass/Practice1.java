package SomeClass;

import java.util.Scanner;

public class Practice1 {
    public static void main(Srtingg[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ведите свой бал");
        int nam = scan.nextInt();
        int nam2;
        if (nam>=90) {
            System.out.println("отлично");

        }
        else if (nam>=70) {
            System.out.println("хорошо");
        }
        else if (nam>50) {
            System.out.println("удовлетв");
        }
        else
            System.out.println("двойка");
    }
}
