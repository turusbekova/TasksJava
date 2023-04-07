package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        System.out.println(age);

        String name = scan.next();
        System.out.println(name);


    }
}
