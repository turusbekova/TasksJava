package SomeClass;

import java.util.Scanner;

public class Practice3 {
    public static void main(Srtingg[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите свой возраст:");
        int age = scan.nextInt();
        System.out.println("введите свой вес:");
        int weight = scan.nextInt();

        if (age>=18){
            if (weight>=50){
                System.out.println("вы можете сдать кровь");
            }
            else {
                System.out.println("вы не можете сдать кровь");
            }
        }
        else {
            System.out.println("возраст должен быть больше 18+");
        }


    }
}
