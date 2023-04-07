package SomeClass;

import java.util.Scanner;

public class Practice {
    public static void main(Srtingg[] args) {

    Scanner scan = new Scanner(System.in);
        System.out.println("введите число");
        int nam = scan.nextInt();
        if (nam<100){
            System.out.println("это число меньше 100");
            if (nam<50){
                System.out.println("это число меньше 50");
            }
            else
                System.out.println("это число больше 100");
        }
        else
            System.out.println("это число больше 130");

}}
