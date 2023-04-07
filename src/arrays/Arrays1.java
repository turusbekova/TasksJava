package arrays;

import java.util.Arrays;
import java.util.Locale;

public class Arrays1 {
    public static void main(String[] args) {
        int [] numbers = new int[3]; // обьект массива
        numbers[0] = 392;
        numbers[2] = 1000;
        numbers[1] = 7;    // всегда будет показывать по порядку
        numbers[0] = 250; // тоже переназначается

        System.out.println(Arrays.toString(numbers)); // [I@1b28cdfa -показывает хешкод, toString переводит в строку
        // с помощью array можно вывести определенный индекс
        // arrays - зафиксированный массив, в нем хранятся число указывающее
        // на то, сколько раз нужно ввести индекс
        System.out.println(numbers.length); // длина = 3

        String str = "Hello";
        System.out.println(str.length());
        // в массиве length без скобки а в стринге со скопкой, а так работает одинаково

        String str1 [] = new String[4]; // 4 стринга принимает
        str1[0] = "Doha";
        str1[1] = "Aida";
        str1[2] = "Aliya";
        str1[3] = "Maxat";

        System.out.println(Arrays.toString(str1));
        System.out.println(str1[2]); // String names = "Aliya"
        System.out.println(str1[0] == str1[1]);
        System.out.println(str1[1].replace("Aida", "Aigul"));
        str1[1] = "Aigul";
                str1[1].toUpperCase();
        System.out.println(Arrays.toString(str1));


//        String lastname = "Smith";
//        System.out.println(lastname);

        double [] point = new double[2];
        point[0] = 29.3;
        point[4] = 324.25;
    // compine time - ошибка которую можно исправить
        // literal - например литералом int является числа, boolean является true or false
        }


    }

