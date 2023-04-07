package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class conwert1 {
    public static void main(String[] args) {


            int [] arr = {2,3,5,7,8};
            Integer [] arr2 = new Integer[arr.length];

            for (int i = 0; i < arr.length; i++) {
                arr2[i] = arr[i];
            }

            List<Integer> arrayList = Arrays.asList(arr2);
            ArrayList<Integer> al = new ArrayList<Integer>(arrayList);


            System.out.println(arrayList);



            int [] str = {2,4,5,7,6};
            Integer [] str1 = new Integer[str.length];

            for ( int i = 0; i < str.length; i++) {
                str1[i] = str[i];

            }

            List<Integer> num = Arrays.asList(str1);


        }
}
