package Practice;

import java.util.*;

public class Practice10 {
    public static void main(String[] args) {
        // Input arraylist [1,2,2,3,4,55,55]
        // Output: Kolichestvo unique elementov => 5
        TreeSet<Integer> num = new TreeSet<>();
        num.add(1);
        num.add(2);
        num.add(2);
        num.add(3);
        num.add(3);
        num.add(4);
        num.add(55);
        num.add(55);
        System.out.println(num.size());

        // Input arraylist [1,2,2,3,4,55,55]
        // Output: summa unique elementov => 65

        ArrayList<Integer> num2 = new ArrayList<>();
        num2.add(1);
        num2.add(2);
        num2.add(3);
        num2.add(4);
        num2.add(55);
        num2.add(55);

        Set<Integer> num3 = new TreeSet<Integer>(num2);
        int k = 0;
      //  for(int i = 0:num3) {
      //      k += i;
            System.out.println(num3);

        }


    }



