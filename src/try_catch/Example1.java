package try_catch;

public class Example1 {
    public static int division(int num, int num2){
        return num/num2;
    }
    public static void main(String[] args) {

        int [] nums = {0,45,12,8,39};
//        int result = 32/0;



        try { // try в одиночку не работает
            System.out.println(nums[100]);
            division(34,0); // java читает снизу и вверх и что первое попадется try ту ошибку и обрабатывает
            System.out.println(nums[100]);
        }
        catch (ArrayIndexOutOfBoundsException e){
          throw new ArrayIndexOutOfBoundsException("Takogo indeksa net"); // выброси в консоль ошибку с нашим указанием/сообщением
        }
        finally {
            System.out.println("Zdes' srabotal try catch"); // optional - для того чтобы заканчивать/закрывать поток,
            // все равно будет работать (если даже словили или нет)
        }



    }
}

