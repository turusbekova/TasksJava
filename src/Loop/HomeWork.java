package Loop;

public class HomeWork {
    public static void main(String[] args) {
        //                 012345678901234567890123456
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String stroka = "djava";
        System.out.println(stroka);

        String sortStroka = "";

        for (int i = 0; i < alphabet.length(); i++){
            for (int j = 0; j < stroka.length(); j++){
                if (stroka.toLowerCase().charAt(j) == alphabet.charAt(i)){
                    sortStroka += stroka.charAt(j);
                }
            }
        }
        System.out.println(sortStroka);

        System.out.println("----------------------------------");

//        String alphabet1 = "abcdefghijklmnopqrstuvwxyz";
//
//        System.out.println("Enter the string: ");
//        String input = "";
//        String user_str = input.next();
//
//        String sortStroka1 = "";
//
//        for (int i = 0; i < alphabet1.length(); i++){
//            for (int j = 0; j < user_str.length(); j++){
//                if (user_str.toLowerCase().charAt(j) == alphabet1.charAt(i)){
//                    sortStroka1 += user_str.charAt(j);
//                }
//            }
//        }
//        System.out.println(sortStroka1);

    }
}
