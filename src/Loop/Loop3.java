package Loop;

public class Loop3 {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++){
            System.out.print(i + " "); // 1,2
            for (int j = 1; j < 4; j++){
               System.out.print('*' + " ");
           }

            System.out.println();

        }

    }
}
