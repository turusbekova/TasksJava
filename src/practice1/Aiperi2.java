package practice1;

public class Aiperi2 {
    public static void bubbleSort(int array[]) {
        int temp = 0;
        for (int i = 0; i < array.length; i++)
            for (int j = i; j< array.length; i++){
                if (array[i] < array[j]){
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        System.out.print("Наибольшая сумма строки " + array[0] + "\n"
                + "Наименьшая сумма строки " + array[array.length-1]);
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 4;
        int [][] mas = new int [n][m];
        for (int i = 0; i < mas[i].length; i++){
            for (int j = 0; j < mas[i].length; i++){
                mas[i][j] = (int)(Math.random()*9);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }

        int array [] = new int[mas.length];

        for (int i = 0; i < mas.length; i++){
            for (int j = 0; j < mas[i].length; j++){
                array[i] += mas[i][j];
            }

            System.out.print("Вывод суммы " + i + " строки" + array[i] + "\n");
        }
        bubbleSort(array);
    }
}
