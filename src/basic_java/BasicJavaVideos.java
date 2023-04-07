package basic_java;

import java.io.IOException;

public class BasicJavaVideos {
    public static void main(String[] args) throws IOException {
        int num = 21;
        int num1 = 21;
        int num2 = 3;
        int num3 = 4;
        num++;
        --num;
        System.out.println(num);

        if(num == num1 || num2 < num3){
            System.out.println("TRUE");
        }
        else {
            System.err.println("FALSE");
        }

        char ch, answer = 'b';
        System.out.println("Какую букву вы загадали? ");
        System.out.print("Попытайтесь ее угадать: ");

        ch = (char)System.in.read();

        if (ch == answer){
            System.out.println("Поздравляю");
        }
        else if (ch > answer){
            System.out.println(" Перестарался");
        }
        else {
            System.out.println("Недостаточно");
        }


    }
}
