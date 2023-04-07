package SeT;

import java.util.*;

public class hashSet {
    public static void main(String[] args) {


        HashSet<String> set1 = new HashSet<>(); // НЕ ПРЕДСКАЗУЕМЫЙ ПОРЯДОК И НЕ РАБОТАЕТ С ДУБЛИКАТОМ
        set1.add("Kate");
        set1.add("Tim");
        set1.add("Steve");
        set1.add("James");
        set1.add("Alex");
        set1.add("Tim");
        System.out.println(set1);
        set1.add("Will");
        set1.add("John");


        System.out.println(set1);


        LinkedHashSet<String> Linkedhashset1 = new LinkedHashSet<>(); // ТАКОЙ ЖЕ ПОРЯДОК КАК МЫ НАПИСАЛИ 
         Linkedhashset1.add("roza");
         Linkedhashset1.add("turus");
         Linkedhashset1.add("baha");
         Linkedhashset1.add("bima");
        System.out.println(Linkedhashset1);


        TreeSet<String> treeSet1 = new TreeSet<>();  //  СОРТИРУЕТ
        treeSet1.add("Isa");
        treeSet1.add("Zulfiya");
        treeSet1.add("Bolot");
        treeSet1.add("Aman");
        System.out.println(treeSet1);


        Set<String> set2 = new HashSet<>();
        Set<Integer> set3 = new LinkedHashSet<>();
        Set<Double> set4n= new TreeSet<>();
    }
}
