package HomeWorks;

import practiceInterface.Main;

import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fahrenheit = scan.nextInt();
        int num = 32;
        int num1 = 5;
        int num2 = 9;
        int celsius = (fahrenheit - num) * num1/num2;

        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");

        double meter = 0.0254;
        double inch = scan.nextDouble();
        double res = meter * inch;

        System.out.println(inch + " inch is " + res + " meters");




    }
}
