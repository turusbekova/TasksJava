package Java_Methods;

public class Overloading {
    public static void main(String[] args) {
        System.out.println(result(4));
        System.out.println(result(6,3));
    }

    public static String result(int sum){
        String str = "";
        if (sum%2 == 0){
            str = "Even number";
        }
        return str;
    }
    public static int result(int num, int num2){
        num2 = 2;
        if (num % num2 == 0){
            return num;
        }
        else {
            return 0;
        }
    }
}
