package String;

public class StringMethods {
    public static void main(String[] args) {
        String word = "Hi"; // новая версия создания
        String word2 = new String(word); // старая версия


//            0123 --> индекс(начинается с 0)
        String STR = "Rose";
//            1234 --> количество букв (длина)

        System.out.println(STR.indexOf('s'));
        System.out.println(STR.indexOf('o'));
        System.out.println(STR.indexOf("ose")); // смотрит только с какой буквы начинается, о --> 1

        String LAPTOP = "Mac Book Pro";
        System.out.println(LAPTOP.indexOf("Book")); // пробелы тоже считываются
        System.out.println(LAPTOP.indexOf('o', 7)); // ch, fromindex это подсказка сам появляется
        // если не находит выводит отрицательные числа

// метод length длина

        //             012345678
        String name = "Jef Bezos";
        //             123456789 - длина ()

        // length()
        System.out.println(name.length()); // пустые параметры

        // charAt()
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf('e', 3));
        System.out.println(name.indexOf("Bez", 3));

        // concat() - склеивает как "+" соединяет только строки
        String company = " Amazon";
        System.out.println(name.concat(company));
        System.out.println(name.concat("I'm Boss"));

        // substring()   0123456789012345
        String author = "Chingiz Aitmatov";

        // substring() он не вырезает, целое слово-стринг и с 13 числа уже сабстринг
        System.out.println(author.substring(13));


        String FIRSTNAME = author.substring(8, 14); // Aitmat
        System.out.println(FIRSTNAME);
//        System.out.println(author.substring(8,13)); // начиная с 8 до 13

        // trim() срезает боковые пробелы
        //             0123456789123
        String space = "oWindowso    ";
        System.out.println(space);
        System.out.println(space.trim());

        // lastIndexOf() справа на лево читает

        String winda = "oWindowso";
        System.out.println(winda.lastIndexOf('o'));

        // equals() - сравнивает true or false пробелы тоже смотрит
        String flower = "RoSE";
        String flower1 = "ROsE";
        String flower2 = "Roses";
        System.out.println(flower.equals(flower1));

        //equalsIgnoreCase()       игнорирует буквы главное чтобы  похожи
        System.out.println(flower.equalsIgnoreCase(flower1));

        // tolowerCase()-все буквы превращает в маленькие
        String state = "CaLiFoRnIa";
        System.out.println(state.toLowerCase());

        // toUpperCase()-в большие
        System.out.println(state.toUpperCase());

        // replace()-ЗАМЕНЯЕТ, 1 char (чувствителен к размерам букв)

        String country = "USA";
        System.out.println(country.replace('S', 'C'));

        // celoe slovo  в принципе все заменяет
        String coun = "United of States of America";
        System.out.println(coun);
        System.out.println(coun.replace("of", "OFF"));

        // заменил     заменяет только строки
        System.out.println(country.replaceAll("USA", "america"));

        // char sequance - последовательность

        // Method chaining: сразу используем несколько методов
        String str = "HpHpLoHp";
        String str2 = "sslos";
        // тут он сравнивает уже измененное слово   sslos
        boolean wor = str.toLowerCase().replace("hp", "s").equalsIgnoreCase(str2);
        System.out.println(word);
        // тут он заменил буквы потом сделал их с маленькой буквы
        String wo = str.toLowerCase().replace("hp", "s");
        System.out.println(word2);

        // переменная final означает что нельзя больше изменить(const)
        final int year = 2022;

        // изменяемый  и неизменяемый
        // переназначаем --> сохраняем, не означает изменить, пока мы его не  сохраним он не изменится
        String phone = "Motorola";
        phone = "Fonex";
//        phone = "Black Berry";
//        phone = "Nokia";
        System.out.println(phone);

        String version = "  6300";
        phone.concat(version); // не изменился потому что не сохранился
        String phoneVersion = phone.concat(version);
        System.out.println(phoneVersion);



        StringBuilder str8 = new StringBuilder("hello");
        StringBuilder str1 = new StringBuilder("hello");
        System.out.println(str8==str1);


        // цитата и применить методы
    }}