package If_Else;

public class IgnoreCase {
    public static void main(String[] args) {
        String str1 = "Hello Everyone";
        String str2 = "HELLO EVERYONE";
        String str3 = "Hi eVery ONE";
        boolean result;

        result = str1.equalsIgnoreCase(str2);
        System.out.println("result is " + result);

        result = str2.equalsIgnoreCase(str3);
        System.out.println("result is " + result);
    }
}
