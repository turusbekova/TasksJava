package If_Else;

import java.util.Scanner;

public class FloorPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your floor: ");
        int floor = scan.nextInt();
        System.out.println("Your floor is " + floor);

        if (floor <= 1){
            System.out.println("these are rooms for our employers");
        }
        else if (floor == 1){
            System.out.println("This is a reception");
        }
        else if (floor >= 2 && floor <= 10){
            System.out.println("Rooms for our guests");
        }
        else if (floor == 11 && floor == 12){
            System.out.println("These are rooms for our VIP guests");
        }
        else if (floor == 13){
            System.out.println("This is a swimming pool");
        }
        else if (floor == 14){
            System.out.println("This is a balcony");
        }
        else{
            System.err.println("We haven't this floor");
        }
    }
}
