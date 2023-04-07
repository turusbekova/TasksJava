package map;

import java.util.*;

public class Map1 {

    public static void main(String[] args) {

        HashMap<Integer, String> numName = new HashMap<>();
        numName.put(1, "Mairam");
        numName.put(2, "Esen");
        numName.put(4, "Baha");
        numName.put(3, "Nargiza");
        numName.put(0, "Samat");
        numName.put(10, "Samat");// это не дубликат так как ключи разные
        numName.put(-10, "Isa");
        System.out.println(numName);
        // по порядку выводит(где бы числа не находились)
        // 1-параметр=ключ, 2=значение, главное ключи должны быть разными а значения-без разницы
        // также работает непредсказуемо (с отрицательными числами)
        // ключи - могут быть разными типами данных, а индекс только целые числа
        TreeMap<String, Integer> code = new TreeMap<>();
        code.put("Bishkek", 312);
        code.put("Tajikistan", 992);
        code.put("Russia", 7);
        code.put("Karakol", 3922);
        code.put("BiCity", 996);
        System.out.println(code);
        //  HashMap - непредсказуем
        //  LinkedHashMap - как мы написали
        //  TreeMap-отсортированный
        System.out.println(code.get("Karakol"));

        LinkedHashMap<String,String> name = new LinkedHashMap<>();
        name.put("Zamirbekova", "Bermet");
        name.put("Musakunov", "Nursultan");
        System.out.println(name);
        System.out.println(name.get("Musakunov"));
        System.out.println(name.keySet()); // показывает только ключи
        System.out.println(name.values()); // показывает только значения
        System.out.println(name.containsValue("Bermet")); // true/false возвращает

//        System.out.println(name.remove("Zamirbekova"));
//        System.out.println(name);
//        System.out.println(name.remove("Musakunov", "Nursultan"));
//        System.out.println(name);
//        name.clear();
//        System.out.println(name);
//        System.out.println("--------------------------------------");
//
//        String names [] = new String[name.size()];
////       for (int i = 0; i < name.size(); i++){
////           names[i] = name.get(i);
////       }
//        int j = 0;
//        Iterator itr = name.values().iterator();
//        while (itr.hasNext()){
//            names[j] = (String) itr.next();
//            j++;
//        }
//        System.out.println(Arrays.toString(names));
////        System.out.println(Arrays.toString(names));
//
//        System.out.println("---------------------");
//
//        List<String> nam = new ArrayList<>();
//        nam.add(name.get("Zamirbekova"));
//        System.out.println(nam);
//
//        System.out.println("-------------------------");
//
//
        List<String> nam2 = new ArrayList<>();

        Iterator itr1 = name.keySet().iterator();
        while (itr1.hasNext()){
            nam2.add((String) itr1.next());
        }
        System.out.println(nam2);
//
//


    }
}
