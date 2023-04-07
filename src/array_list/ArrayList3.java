package array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList3 {
    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<>();
        name.add("begish");
        name.add("roza");
        name.add("turus");
        name.add("baha");

        System.out.println(name);
        System.out.println(name.size());
        System.out.println(name.set(2,"doha"));
        System.out.println(name);




        String [] names = new String[name.size()];

        for (int i = name.size()-1; i > 0;i-- ){
           names[i] = name.get(i);
            System.out.println(names[i]);


        }
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

    }
}
