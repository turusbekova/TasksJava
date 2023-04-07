package Switch;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Введите свой размер обуви: ");
//        int size = scan.nextInt();
//        String size1;
//        switch (size) {
//            case 29:
//                System.out.println("Маленький");
//                break;
//            case 42:
//                System.out.println("Средний");
//                break;
//            case 44:
//                System.out.println("Большой");
//                break;
//            case 48:
//                System.out.println("Очень Большой");
//                break;
//            default:
//                System.err.println("Такого размера нет");
//                break;
//
//        }
//        System.out.println("размер " + size);
// -----------------------------------------------------
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Введите свою оценку: ");
//        int grade = scan.nextInt();
//        switch (grade){
//            case 5:
//                System.out.println("Отлично!");
//                break;
//            case 4:
//                System.out.println("Хорошо");
//                break;
//            case 3:
//                System.out.println("Ты можешь лучше");
//                break;
//            case 2:
//                System.out.println("Надо постараться");
//                break;
//            default:
//                System.out.println("Такой оценки нет");
//        }
//   ------------------------------------------------------
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите время года: ");
        String nameofseason = scan.next();
        int month = 4;
        switch (nameofseason) {
            case "summer":
                month = 3;
                break;
            case "autumn":
                month = 4;
                break;
            case "winter":
                month = 1;
                break;
            case "spring":
                month = 2;
                break;
            default:
                System.out.println("Такого сезона нет");
        }
        System.out.println(month);

        // операторы + - * и другие
// statement каки-то условия которые выполняют
// исп-ся все кроме float double boolean
        String season = "Fall";
// switch - условие/ 1 условие, ищет условие которое совпадает с его условием
        switch (season) {
            case "winter": // case - хранение, что-то можно хранить
                System.out.println("снег идет");
                break;
            // ЕСЛИ BREAK НЕТУ ТО ПОЛКИ СКЛЕИВАЮТСЯ И ИДУТ КАК ОДНО УСЛОВИЕ
            case "spring":
                System.out.println("цветы");
                break; // разбивает полки между собой
            case "Summer":
                System.out.println("hot");
                break;
            case "Fall":
                System.out.println("rain");
                break;
            default: // если нужное не находит то выходит
                System.out.println("No season");


        }
        System.out.println("---------------------");

        int num = 2;

        switch (num) {
            case 1:
                System.out.println("Erkin");

            case 2:
                System.out.println("Baha");

            case 3:
                System.out.println("Begimai");
                break;
            case 5:
                System.out.println("Ayana");
            case 6:
                System.out.println("Madina");
                break;
            default:
                System.out.println("Aidar");
        }
    }}