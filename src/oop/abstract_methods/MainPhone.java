package oop.abstract_methods;

import java.util.Scanner;

public class MainPhone {
    public static void main(String[] args) {

      Android samsung = new Android("Samsung", "S22", 256.01f);
//        System.out.println(samsung.answer());
//        System.out.println(samsung.decline());
//        System.out.println(samsung.send());

       IOS Iphone = new IOS("Apple","12 Pro Max", 256.01f);
//        System.out.println(Iphone.answer());
//        System.out.println(Iphone.decline());
//        System.out.println(Iphone.send());

        System.out.println(samsung.call("+99670456742"));

        Scanner scan = new Scanner(System.in);
        String button = scan.next();

        if (button.equals("a")){
            System.out.println(samsung.answer());
        }
        else if (button.equals("b")){
            System.out.println(samsung.decline());
        }
        else if (button.equals("c")){
            System.out.println("Choose answer");
            String button2 = scan.next();
            if (button2.equals("1")){
                System.out.println(samsung.bla[0] + samsung.sendMessage());
            } else if (button2.equals("2")){
                System.out.println(samsung.bla[1] + samsung.sendMessage());
            }
        }



    }
    }



