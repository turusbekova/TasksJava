package SomeClass;

import java.util.Scanner;

public class Practice4 {
    public static void main(Srtingg[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите свой размер обуви:");
        int size = scan.nextInt();
        String size1;
        switch (size) {
            case 29:
                size1 = "маленький ";
                break;
            case 42:
                size1 = "средний ";
                break;
            case 45:
                size1 = "большой ";
                break;
            case 48:
                size1 = "очень большой ";
                break;
            default:
                size1 = "неизвестно";
                break;
        }
        System.out.println("размер " + size1);
    }
}
