package If_Else;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свои баллы: ");
        int grade;
        grade = scanner.nextInt();
        if (grade >= 90){
            System.out.println("A");
        }
        else if (grade >= 70)
        {
            System.out.println("B");
        }
        else if (grade >= 50){
            System.out.println("C");
        }
        else {
            System.err.println("FAIL");
        }
        // if-else statement
        //ключевые слова-statement
        // if-statement
        //int age = 18;
        // if - условие того чего нужно решить, если true-зайдет в body, если false-нет
        // если покажет <18 то покажет cartoons
//  if (age < 18){     // в () условие {}-body
        //System.out.println("cartoons");
        //}
        // else statement-тогда
        //else {
        // System.out.println("horror          аааа");  // внутри statement пробелы не игнорируются
        // если false то прыгает на след statement т.e. на else
        //}
        // if+else =  единое целое

        // if-else-if ladder(лестница)

        int marks = -95;

        if (marks < 0){
            System.out.println("INVALID");
        }
        else if ( marks < 50) {            // тут есть и отрицательные числа
            System.out.println("fail");
        }
        else if (marks >= 50 && marks < 60) {
            System.out.println("D grade");
        }
        else if (marks >= 60 && marks < 70){
            System.out.println("C grade");  // в statement нельзя писать условия
        }
        else if (marks >= 70 && marks < 80){
            System.out.println("B grade");
        }
        else if (marks >= 80 && marks < 90){
            System.out.println("A grade");
        }
        else if (marks >= 90 && marks <100){
            System.out.println("A+ grade");
        }
        else {
            System.out.println("Invalid points!");
            // если все условия не совпадают то выйдет "Invalid points"
        }

        double floor = 3.5;
        if ( floor == 1){
            System.out.println("ресторан");
        }
        else if ( floor == 2){
            System.out.println("фитнес зал");
        }
        else if ( floor == 3 ){
            System.out.println("конфернц зал");
        }
        else  if (floor > 3 && floor <= 10){
            System.out.println("номера");
        }
        else if (floor == 11 ){
            System.out.println("балкон");
        }
        else if ( floor == 12 ){
            System.out.println("крыша");
        }
        else {
            System.out.println("invalid");


            //        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your number: ");
//        int num;
//        num = scan.nextInt();
//        if (num == 100){
//            System.out.println("=100");
//        }
//        else if (num < 100){
//            System.out.println("Menshe 100");
//        }
//        else{
//            System.out.println("Bolshe 100");
//        }
//       Scanner scan = new Scanner(System.in);
//        System.out.println("Введите стоимость товара: ");
//        int price = scan.nextInt();
//        System.out.println("Введите с/стоимость товара: ");
//        int price2 = scan.nextInt();
//        int answer;
//        if (price > price2){
//            answer = price - price2;
//            System.out.println("Прибыль: " + answer);
//        }
//        else if (price < price2){   answer = price2 - price;
//            System.out.println("Убыток: " + answer);
//        }
//        else {
//            System.out.println("Без прибыли и убытка");
//        }
//
        }
    }
}
