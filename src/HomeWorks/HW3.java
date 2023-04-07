package HomeWorks;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {

        int num = 2;
        double num1 = 3.14f;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = scan.nextDouble();

        double perimeter = num * radius * num1;
        System.out.println("Perimeter is = " + perimeter);

        double area = num1 * radius * radius;
        System.out.println("Area is = " + area);


    }
}
