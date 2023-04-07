package SomeClass;

import java.util.Scanner;

public class Nextedlf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String china = " Китай";
        String dungan = " Дунган";
        String kyrgyz = " Кыргыз";

        String chinafood ="pampushki";
        String dunganfood = "lyanfu ";
        String kyrgyzfood = " beshbarmak ";


        System.out.println(" vyberite odin iz treh vidov kuhni ");
        System.out.println("1." + china + "\n"+"2." + dungan + "\n" + "3." +  kyrgyz);

        String input = scan.next();
        String inputfood = scan.next();

        if (input.equals(china)) {
            System.out.println(" dobro pojalovat pecin kuhnya");
            if (inputfood.equals("pampushki")){
                System.out.println(chinafood+"orderred");
            }
        }

            else if (input.equals(dungan)) {
            System.out.println(" dobro pojalovat jazy dji kuhnya");

        }
            else if (input.equals(kyrgyz)) {
            System.out.println("dobro pojalovat besh barmak kuhnya ");
        }

    }
}
