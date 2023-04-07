package incrementDicrement;

public class Increment {
    public static void main(String[] args) {

        // postfix - сперва думает потом делает
        // increment --> postfix
        int num1 = 1;
        num1++;
        num1++;
        num1++;                         // 5 - держит в уме
        System.out.println("num1 - " + num1++);
        System.out.println(num1); // здесь он показывает то что есть

        // increment --> prefix
        int num2 = 1;
        ++num2;
        ++num2;
        ++num2;
        System.out.println("num2 - " + ++num2); // а здесь как есть так и делает
        // сразу прибываляет и это выдает

        // decrement --> postfix

        int num3 = 5;
        num3--;
        System.out.println("num3 - " + num3--);
        System.out.println(num3);

        // decrement --> prefix
        int num4 = 5;
        --num4;
        --num4;
        System.out.println("num4 - " + --num4);


    }
}
