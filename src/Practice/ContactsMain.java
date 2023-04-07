package Practice;

import Practice.Contacts;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactsMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Integer nomer = scan.nextInt();



        Contacts esen = new Contacts("Esen", 0500230456);
        Contacts aidar = new Contacts("Aiadr",0777121345 );
        Contacts bolot = new Contacts("Bolot", 0703456245);
        Contacts unknown = new Contacts( 0505234532);

        Map<String,Integer> number = new HashMap<>();
        number.put(esen.name, esen.num);
        number.put(aidar.name, aidar.num);
        number.put(bolot.name, bolot.num);
        number.put(unknown.name, unknown.num);


        for (String num : number.keySet())

        System.out.println(unknown.receiveCall());






    }


}
