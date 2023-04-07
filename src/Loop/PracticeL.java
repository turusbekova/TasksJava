package Loop;

import java.util.Scanner;

public class PracticeL {
    public static void main(String[] args) {
//        Scanner src = new Scanner(System.in);
//        System.out.println("Input number 1: ");
//        int input = src.nextInt();
//        System.out.println("Input number 2: ");
//        int input2 = src.nextInt();
//
//        for (int i = input; i < input2; i++){
//           if(i % 2 == 0){
//               System.out.println("chetnye chisla: " + i);
//           }
//           else{
//               System.out.println("nechetnye chisla: " + i);
//           }
//        }
//
//
//            Scanner x = new Scanner(System.in);
//            int beg = x.nextInt();
//            int kon = x.nextInt();
//            int f=5;
//            for (int i=beg; i<=kon; i++){
//                if (i%2==0) {
//                    System.out.println(i);
//                    f=f+i;}
//            }
//            System.out.println("Сумма нечетных "+f);

            String word = "ololoo hooouse";
            int score = 0; // score-счет
            for (int i = 0; i < word.length(); i++){
                if (word.charAt(i)=='o'){
                   score ++;
                }

            }
            System.out.println(score);
            // любой набор букв и сделать так чтобы он вышел по порядку д/з
    }     // метод-параметр, внутри боди прописывается который работает с параметрами, каждый раз мы его запускаем
    // цикл-условие, повторяет указанное условие и автоматом запускает, может выполнять какое-то действие и одновременно условие

}
