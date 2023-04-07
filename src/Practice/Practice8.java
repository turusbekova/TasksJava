package Practice;

import java.util.ArrayList;

public class Practice8 {
    public static void main(String[] args) {
      String name = "Lorem Ipsum is simply dummy text";
        ArrayList<String> name1 = new ArrayList<>();
        int k = 0;
        for (int i = 0; i < name.length(); i++){

            if (name.charAt(i) == ' ' || i == name.length()-1) {
                name1.add(name.substring(k,i+1).trim());
                k = i;

            }
        }
        System.out.println(name1);
    }
}
