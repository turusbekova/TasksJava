package Loop;

import org.w3c.dom.ls.LSOutput;

public class loop1 {
    public static void main(String[] args) {
        // for loop
        // while loop
        // do while loop
        // for each (for)

        for (int i = 1; i < 5; i++) {
            System.out.println(i + " Adios Amigo!");
        }
        System.out.println("----------------------");
        for (int i = 5; i > 1; i--) {
            System.out.println(i + " Adios Amigo!");
        }
        System.out.println("----------------------");
        for (int i = 5; i >= -3; i--) {
            System.out.println(i + " Adios Amigo!");
        }


        // i = 1 --> Adios Amigo!
        // i++ : увеличивается на 1 и так будет продолжаться до 5, так как мы указали < 5
        // пока будет тру он открывает тело
        // compile error-когда полностью ошибка/rantain error-указывает на ошибку
        System.out.println("-----------------------");
        String str = "James";
        for (int i = str.length(); i >= 0; i--) {
            System.out.println(i + " Adios Amigo!");
            for (; i >= -3; i--) {
                System.out.println(i + " aloha!");
                // нельзя работать с boolean так как нельзя его увеличивать на себя
            }
        }

        System.out.println("-----------------------");
//        int i = 3;
//        System.out.println("Hello world");
//        System.out.println("James");
//        System.out.println("Hello" + str);
//        for (; ;) { // ;; - бесконечный цикл
//            System.out.println(i + " Adios Amigo!");}
//        int j=0;
//        for (int i = 1; j <= 4;) {
//            System.out.println(j + " Adios Amigo!");
//        j++;}
//        System.out.println(j);
    }

//        j++;
//        System.out.println(j); // = 11 (10+1)
    }


