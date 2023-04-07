package arrays;

import java.util.Arrays;

public class Arrays5 {
    public static void main(String[] args) {
        int [] arr = {45,23,67,98,10};
        System.out.println(arr[2]);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr); // не работает в соуте, он выводит по возрастанию
        System.out.println(Arrays.toString(arr));
//                             67 --> так как после сорта и соут смотрит на последние изменения
        System.out.println(arr[2]);
//         0   1   2  3    4
//       [10, 23, 45, 67, 98]
        Arrays.binarySearch(arr, 98); // показывает индексацию
        System.out.println( Arrays.binarySearch(arr, 98));

        // key показывает под каким индексом находится элемент
        // binarySearch работает только вместе sort, а так он непредсказуем



    }
}
