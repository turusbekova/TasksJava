package CodingBat;

public class Class1 {
    public static void main(String[] args) {

        Class1 class1 = new Class1();
        System.out.println(class1.withoutEnd("hello"));

    }
   // Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.


   // withoutEnd("Hello") → "ell"
 //   withoutEnd("java") → "av"
  //  withoutEnd("coding") → "odin"



    public String withoutEnd(String str) {
        if(str.length()>2){
            return str.substring(1,str.length()-1);
        }
        return str;

    }
}
