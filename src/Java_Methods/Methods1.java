package Java_Methods;

import jdk.swing.interop.SwingInterOpUtils;

public class Methods1 {
    public static void main(String[] args) {

        System.out.println( reverce(new StringBuilder("Nomads")));
//        System.out.println(multipleOfTwoNums("phone",75));
//        System.out.println();
//    }
//     public static int multipleOfTwoNums(String object, double lenghofobject){
//       if (lenghofobject % 1 == 0) { // 0 == 0 --> то есть 75\1=75 без остатка и получается заходит внутрь бади
//           int num = (int) lenghofobject; // casting: завернули в инт (int), чтобы завернуть нужно сохранить
//           return num;
//       }
//       else {
//       return 0;
//       }
////         double num = lenghofobject;
////         System.out.println("This is double " + num);
////         int num1 = (int) lenghofobject;
////         System.out.println("This is int " + num1);
////         return num1;
// // конвертирование происходит какая-то операци
//         // кастинг происходит конкретная опера
//
//
//     }
//     public void greeting(String name){
//        String result = "Hello" + name;
//         System.out.println(result);

     }
     public static StringBuilder reverce(StringBuilder word){

         return word.reverse();


     }
}