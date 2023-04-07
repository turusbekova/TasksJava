package array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("Almaz");
        al.add("Meerim");
        al.add("Samat");
        al.add("Kairat");

        System.out.println(al.get(2)); // определенный элемент показывает
        System.out.println(al); // все вызвали
        System.out.println(al.size()); // 4
        System.out.println(al.set(3,"Meerim")); // set-заменяет. Алмаз заменили на Мээрим/ sout нужен для того чтобы показать какое слово он заменил
        System.out.println(al); // [Meerim, Meerim, Samat, Kairat] --> после замены
//        System.out.println(Arrays.toString(al.toArray()));
        // alist - не нужно определенное количество элементов
        // array - нужно

        String [] names = new String[al.size()]; // size - чтобы узнать длину

        for ( int i = 0; i < al.size(); i++){
            names[i] = al.get(i);
            System.out.println(names[i]);
        }
       Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Maxat");
        al2.add("Mirbek");
        al2.add("Ayana");
        al2.add(2,"Kyial"); // добавляет но не удаляет
        al2.addAll(al);
        System.out.println(al2);
 //   [Maxat, Mirbek, Kyial, Ayana, Almaz, Meerim, Samat, Meerim]
       al2.remove(2);
       al2.remove("Kyial");
        System.out.println(al2);
        System.out.println("------------------------");
//       al2.clear();


    }
}
