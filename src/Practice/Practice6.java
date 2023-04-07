package Practice;

import java.util.Arrays;

public class Practice6 {
    public static void main(String[] args) {
        int num[] = {4, 8, 1, 7, 9};
        System.out.println(Secondnum(num));
//        System.out.println(secondnumber1(num));
    }
//    public static int secondnumber1 (int array[]){
//        Arrays.sort(array);
//        return array[array.length - 2];
//    }

    public static int Secondnum(int array[]) {
        for (int j = 0; j < array.length - 1; j++) {
            int k = array.length;
            for (int i = 0; i < k; i++) {

                int a = 0;
                if (array[i] > array[i + 1]) {
                    a = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = a;        // метод пузырька
                }
                k--;
            }
        }
        return array[array.length - 2];
    }
}



