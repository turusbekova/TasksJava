package interface1;

public class PhoneMain2 {
    public static void main(String[] args) {

        Phone phone = new Phone("Samsung", "S22", 64.01, "white", "Android");
        System.out.println(phone.model);
        System.out.println(phone.calling());
        System.out.println(phone.sendMessage());
        System.out.println(phone.takeAPhoto());
        System.out.println(phone.COUNT);

        int num = phone.COUNT;
        System.out.println(num);

        System.out.println(phone.str);

        int YEAR = 2022;
        int year2 = YEAR + 1;
        System.out.println(year2);

        Call object1 = new Phone("Apple", "Iphone 10", 61.01, "black", "IOS");
        System.out.println(object1.calling());

        SendAMessage object2 = new Phone("Apple", "Iphone 12", 61.01, "black", "IOS");
        System.out.println(object2.sendMessage());

        TakeAPhoto object3 = new Phone("Apple", "Iphone 13", 61.01, "black", "IOS");
        System.out.println(object3.takeAPhoto());
    }
}
