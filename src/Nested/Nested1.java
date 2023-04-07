package Nested;

import java.util.Scanner;

public class Nested1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Какую кухню предпочитаете?");
        System.out.println("1. " + "кыргызскую " + '\n' +"2. "  + "китайскую " + '\n' +"3. " + "дунганскую ");
        String order = scan.nextLine();
        String china = "китайскую";
        String dungan = "дунганскую";
        String kyrgyz = "кыргызскую";
        String chinaFood = "пампушки";
        String dunganFood = "Лянфу";
        String kyrgyzFood = "беш бармак";
        String order1 = scan.next();


        if (order.equals(china)) {
            System.out.println("список блюд китайской национальности");
            if (order1.equals("пампушки")){
                System.out.println(chinaFood);
            }
            else {
                System.err.println("такого блюда  нет");
            }
        }
        else if (order.equals(dungan)) {
            System.out.println("список блюд дунганской национальности");
        }
        else if (order.equals(kyrgyz)) {
            System.out.println("список блюд кыргызской национальности");
        }
        else {      // например else является необязательным кодом
            System.err.println("Пожалуйста выберите из меню");
        } // else нужен для того чтобы дать хоть какой-то ответ пользователю
// optional --> необязательный код
        // redundant --> ненужный код (имеет светло-серый цвет)
        int n1 = 3;
        int n2 = 5;
        n1 += 5;
        n1 =+ 5; // + неактивная

        // в начале всегда if в конце else либо никак

        // nested - вложенный
    }
}
