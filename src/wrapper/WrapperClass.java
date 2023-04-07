package wrapper;

public class WrapperClass {
    public static void main(String[] args) {

        // Wrapper classes --> те классы которые переведены с примитивами
        // int, boolean

        // Byte, Short, Boolean, Float, Double, Character, Long, Integer
        // заглавные буквы - обьекты, с маленькой буквы - примитивы
        // можно создавать и с new и без
        int n1 = 12;
        Integer n2 = 34;

//        String str = n2.toString();
//        double n3 = n2.doubleValue();
//        System.out.println(n3);
//        System.out.println(n2.doubleValue());

        int maximum = Integer.max(n1,n2);
        System.out.println(maximum);


        System.out.println(findMaximum(78,9));


        String five = "5";
        int numberFive = Integer.parseInt(five); // принимает строку возвращает число
        System.out.println(numberFive);

        Double num1 = 78.12;
        System.out.println(num1.compareTo(32.5));
        // -1 0 1 - сравнивает, если num1 > числа то 1, меньше -1, равно 0;

        // autoboxing
        int dig1 = 12; // = 12
        Integer dig2 = dig1; // = 12; что-то маленькое превратили в большое
        Integer dig3 = Integer.valueOf(dig1); // = 12
        System.out.println(dig3);

        // unboxing
        Integer n6 = 34; // что-то большое превратили в маленькое
        int n7 = n6;
        int n8 = n6.intValue(); // value - значение
        System.out.println(n8);



           }

           public static int findMaximum(int num1, int num2){
        if(num1 > num2){
            return num1;
        }
        else {
            return num2;
        }
           }
           // строготипизированный - когда все идет по порядку, тип название = значение;

}
