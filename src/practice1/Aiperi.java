package practice1;

import java.util.Scanner;

public class Aiperi {
    public static void main(String[] args) {
      int [] arr = {6, 7, -5, -6, 3, -3, 8};
      int length = arr.length;
      int counter = 0;

      for (int i = 1; i < length; i++){
          if ((arr[i - 1] < 0 && arr[i] > 0) || (arr[i - 1] > 0 && arr[i] < 0)){
              System.out.printf("Позиция №%d: %d \n", i - 1, i);
              counter++;
          }
          System.out.println("\n Знак меняется: " + counter + "раза");
      }
        }
    }


