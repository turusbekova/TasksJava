package SeT;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class hashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> hash = new LinkedHashSet<>();
        hash.add(34);
        hash.add(54);
        hash.add(65);
        hash.add(25);
        hash.add(15);
        hash.add(66);


        System.out.println(hash);

        Integer [] num = new Integer[hash.size()];
        System.out.println(Arrays.toString(num));


        int k = 0;
        for (int i: hash) {
            System.out.println();
            num[k]=i;
            k++;
        }
    }
}
