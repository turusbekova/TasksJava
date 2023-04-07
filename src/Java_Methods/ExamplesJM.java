package Java_Methods;

import java.util.Scanner;

public class ExamplesJM {
    public static void main(String[] args) {
        System.out.println("Введите количество сторон?");
        Scanner scan = new Scanner(System.in);
        int perim = scan.nextInt();
        System.out.println(perim1(perim));
        System.out.println("Введите длину?");
        int length = scan.nextInt();
        int sides = scan.nextInt();
        System.out.println(perim1(perim));
        System.out.println(perim1(length,sides));

    }
    public static int perim1(int perim){
        int s = perim * 5;
        return s;

    }
    public static int perim1(int length, int sides){
        int l = length * sides;
        return l;
    }
}
