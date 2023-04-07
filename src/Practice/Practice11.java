package Practice;

import java.util.*;

public class Practice11 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        ArrayList<String> name = new ArrayList<>();
        name.add("leopard");
        name.add("lion");
        name.add("lion");
        name.add("leopard");
        name.add("zebra");
        name.add("zebra");
        name.add("zebra");

        Set <String> str = new HashSet<>(Arrays.asList());
        List<String> str1= new ArrayList<>(new HashSet<>());


   //     for (int i = 0;i <name.size();i++)
                ;
  //      for (int j = 0;j < name.size();j++);
 //        if(name == i )
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("1");
        numbers.add("5");
        numbers.add("5");
        numbers.add("5");
        numbers.add("12");
        numbers.add("12");
        numbers.add("0");
        numbers.add("0");
        numbers.add("0");
        numbers.add("0");
        numbers.add("0");
        numbers.add("0");
        Set<String> set1 = new HashSet<>(numbers);
        List<String> list2 = new ArrayList<>(set1);
        for (int i = 0; i < set1.size(); i++) {
            int count1 = 0;
            for (int j = 0; j < numbers.size(); j++) {
                if (numbers.get(j) == list2.get(i)){
                    count1++;

                }

            }list2.set(i,(list2.get(i) + "=" + count1));


        }
        System.out.println(list2);

    }
}
