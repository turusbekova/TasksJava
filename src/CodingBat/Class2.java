package CodingBat;

import javax.swing.*;

public class Class2 {
    public static void main(String[] args) {
        Class2 class2 = new Class2();         // 01234
        System.out.println(class2.lastChars("hello"));

    }


    public static String lastChars(String str) {
        str.substring(0, 3);
        return str;
    }
    public static String makeOutWord(String out, String word) {
        return out.substring(0,2)+ word + out.substring(2,4);
    }


}


