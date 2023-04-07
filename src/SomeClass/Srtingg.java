package SomeClass;

import java.util.Scanner;

public class Srtingg {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String firstname;
        firstname = scan.nextLine();
        String lastname;
        String password;


        if (firstname.equalsIgnoreCase("Aidar")) {
            System.out.println("Enter your last name: ");
            lastname = scan.nextLine();
            if (lastname.equalsIgnoreCase("Askeev")) {
                System.out.println("Enter your password: ");
                password = scan.nextLine();
                if (password.trim().equalsIgnoreCase("city312")) {
                    System.out.println("Welcome ");
                } else {
                    System.err.println("Invalid password");
                }
            } else {
                System.err.println("Invalid second name");
            }

        } else if (firstname.endsWith(" ")) {
            System.out.println("SPACE");
        } else if (firstname.startsWith(" ")) {
            System.out.println("SPACE");
        } else {
            System.err.println("Invalid first name");
        }
    }}
