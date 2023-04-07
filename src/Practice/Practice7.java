package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Practice7 {
    public static void main(String[] args) {
        String names [] = {"фазан ", "сидит ", "где ", "знать ", "желает ", "охотник ", "Каждый "};
      getRevers(names);
        System.out.println();
        System.out.println(Arrays.toString(read(names)));
        System.out.println(reversed(names));
    }
    public static void getRevers(String[] word){
        String [] a = new String[word.length];
        for (int i = word.length - 1; i >= 0; i--){
            System.out.print(word[i]);          // метод который выводит с конца
        }
    }
    public static String [] read (String [] str){
        int k = str.length;
        for(int i = 0; i < str.length/2; i++){
            String a = str[k-1];
            str[k-1] = str[i];
            str[i] = a;
            k--;
        }
        return str;
    }
    public static ArrayList <String> reversed (String arr[]){
        ArrayList<String> array = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            array.add(arr[i]);
        }
        Collections.reverse(array);

        return array;
    }
}
