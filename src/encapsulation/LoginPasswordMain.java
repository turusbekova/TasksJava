package encapsulation;

import encapsulation.LoginPassword;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginPasswordMain {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        LoginPassword account = new LoginPassword("Begimai",
                "Begim", "12345");
        LoginPassword account1 = new LoginPassword("Begim",
                "Begish", "9999");

        Map<String,String> database = new HashMap<>();
        database.put("Begim", "12345");
        database.put("Begish", "9999");


        System.out.println("Enter your login: ");
        String login = scan.nextLine();
        if (login.equals(account.login)){
            System.out.println(account.name + " Enter your password");
            String password = scan.next();
            if (password.equals(account.getPassword())){
                System.out.println("@" + account.login + "Well done");
            }
        }



    }

}
