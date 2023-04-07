package Switch;

public class Switch1 {
    public static void main(String[] args) {
        //        String week = "friday";
//
//        switch (week) {
//            case "monday":
//                System.out.println("first day");
//                break;
//            case "tuesday":
//                System.out.println("second day");
//                break;
//            case "wednesday":
//                System.out.println("third day");
//                break;
//            case "thursday":
//                System.out.println("fourth day");
//                break;
//            case "friday":
//                System.out.println("fifth day");
//                break;
//            case "saturday":
//                System.out.println("sixth day");
//                break;
//            default:
//                System.out.println("invalid");
//
//        }

        String hotel = "11 floor";
        switch (hotel) {
            case "1 floor":
                System.out.println("reseption");
                System.out.println("coffee bar");
                break;
            case "2 floor":
                System.out.println("rooms from 1-10");
                System.out.println("gym");
                break;
            case "3 floor":
                System.out.println("rooms from 11-20");
                System.out.println("billiard room");
                break;
            case "4 floor":
                System.out.println("rooms from 21-30");
                break;
            case "5 floor":
                System.out.println("rooms from 31-40");
                System.out.println("hotel office");
                break;
            case "6 floor":
                System.out.println("rooms from 41-50");
                System.out.println("gym");
                break;
            case "7 floor":
                System.out.println("rooms from 51-60");
                break;
            case "8 floor":
                System.out.println("rooms from 61-70");
                System.out.println("coffee bar");
                break;
            case "9 floor":
                System.out.println("rooms from 71-80");
                break;
            case "10 floor":
                System.out.println("restaurant");
                System.out.println("outdoor swimming pool");
                break;
            default:
                System.err.println("Please select from the list!");
        }

    }
}
