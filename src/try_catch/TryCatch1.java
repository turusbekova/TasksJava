package try_catch;

public class TryCatch1 {

    public static int division(int num1, int num2){
        return num1/num2;
    }

    public static void main(String[] args) {
        System.out.println(division(23, 1));

        int [] nums = {12,45,0,2,78};


      // try_catch - попытаться ошибку кода словить
        // Exception e(название) -
        // try catch -

      try {
          System.out.println(nums[20]);
      }
      catch (ArrayIndexOutOfBoundsException e){
          e.printStackTrace(); // напечать название ошибки
      }

        System.out.println("code code code!");



    }
}
