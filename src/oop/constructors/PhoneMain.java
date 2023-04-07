package oop.constructors;

public class PhoneMain {
    public static void main(String[] args) {
        Phone iphone = new Phone("Apple", "iPhone 13 Pro", 64.00, "blue", "ios", 75000.0f); // ()-поля
        System.out.println(iphone);


        Phone samsung = new Phone("Samsung", "Galaxy S22", 256.00, "white", "Android" );

        Phone blackBarry = new Phone("BlacBarry", "BBmodel", 64.00, "black", "BBOS");
        System.out.println(blackBarry);

        // 24.05.2022 -> 79.80
        // 25.05.2022 -> 80.76
        // 26.05 -> 82.20

        float dollar1 = 79.80f;
        float dollar2 = 80.76f;
        float dollar3 = 82.20f;

        float budget = 900.00f;

        if (budget * dollar1 >= iphone.price){
            System.out.println("24.05.2022 - " + iphone.buyPhoneForKairat());
        }
        else if(budget * dollar2 >= iphone.price){
            System.out.println("25.05.2022 - " + iphone.buyPhoneForKairat());
        }
        else if (budget * dollar3 <= iphone.price){
            System.out.println("26.05.2022 - " + iphone.buyPhoneForKairat());
        }
        else{
            System.out.println(samsung.buySamsungForKairat());
        }



    }
}
