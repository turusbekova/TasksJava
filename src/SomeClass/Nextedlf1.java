package SomeClass;

import java.util.Scanner;

public class Nextedlf1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String login = "baha@mail.ru";
        String password = "1233";
        String telnamber = "321";
        System.out.println("Ведите логин");

        String name = scan.next();
        String password1;
        String telnamber2;

        if (login.equals(name)){
            System.out.println("Ведите пароль");
             password1 = scan.next();
             if (password.equals(password1)){
                 System.out.println("ведите номер телефона");
                 telnamber2 = scan.next();
                 if (telnamber.equals(telnamber2));
                 System.out.println("добро пожаловать");

             }
             else {
                 System.out.println("не верный пароль");
             }

            } else {
            System.out.println("не верный логин");
        }


        }



    }

