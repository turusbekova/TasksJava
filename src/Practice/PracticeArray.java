package Practice;

public class PracticeArray {
    public static void main(String[] args) {
//        Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.
//
//
//        maxTriple([1, 2, 3]) → 3
//        maxTriple([1, 5, 3]) → 5
//        maxTriple([5, 2, 3]) → 5
      int [] mass = {1, 5, 3};
        System.out.println(maxTriple(mass));
    }
    public static int maxTriple(int[] nums){
        int first = nums [0];
        int last =nums[nums.length-1];
        int middle = nums[nums.length/2];
        int max1 = Math.max(first, last);
        int max2 = Math.max(max1,middle);
        return max2;

    }
}
