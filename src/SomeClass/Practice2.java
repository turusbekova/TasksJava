package SomeClass;

import java.util.Scanner;

public class Practice2 {
    public static void main(Srtingg[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите стоимость товара:");
        int price = scan.nextInt();
        System.out.println("Введите с/стоимость товара:");
        int price2 = scan.nextInt();
        int answer;
        if(price>price2)
        {
            answer = price-price2;
            System.out.println("Прибыль:" + answer);
        }
        else if (price<price2){
            answer = price2-price;
            System.out.println("Убыток:" + answer);
        }
        else{
            System.out.println("Без прибыли и убытка");
        }

    }
}
