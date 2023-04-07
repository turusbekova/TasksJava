package array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> nameslist = new ArrayList<>();
        nameslist.add("Aidai");
        nameslist.add("Aiperi");

        ArrayList<Integer> sizelist = new ArrayList<>(); // принимает только объекты
        sizelist.add(42);
        sizelist.add(44);
        sizelist.add(46);
        sizelist.add(48);
        sizelist.add(50);
        System.out.println(sizelist.set(2,52));
        System.out.println(sizelist);
        System.out.println(sizelist.get(3));

        int num = sizelist.get(0);
        System.out.println(num);

        sizelist.isEmpty(); // пусто ли
        System.out.println(sizelist.isEmpty());

        sizelist.add(40);
        System.out.println(sizelist);
        sizelist.add(0,40);
//        System.out.println(sizelist.clone());
        System.out.println(sizelist.get(0).equals(sizelist.get(5)));
        System.out.println(sizelist.contains(40));

        Collections.sort(sizelist);
        System.out.println(sizelist);

        for (int i = 0; i < sizelist.size(); i++){
            System.out.print(sizelist.get(i) + " , ");
        }

        System.out.println();
        System.out.println("--------------------------------------");

        for (int i: sizelist){
            System.out.print(i + " ");
        } // цикл for each --> принимает только 2 условия

        // int i -> 40
        // int i -> 40
        // int i -> 42
        // int i -> 44
        // int i -> 48
        // int i -> 52 : произошла итерация, повторяющееся действие (6 раз)


        System.out.println();
        System.out.println("--------------------------------------");

        Iterator itr = sizelist.iterator();
        while (itr.hasNext()){       // hasNext - спрашивает есть ли элементы, а  next() отвечает и печатает
            // int i -> 40
            // int i -> 40
            // int i -> 42
            // int i -> 44
            // int i -> 48
            // int i -> 52 (поднимается и печатает пока не закончится число элементов)
            System.out.print(itr.next() + " ");
        }

    }
}
