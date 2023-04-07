package oop;

public class CarMain {
    public static void main(String[] args) {

        Car merc = new Car();
        System.out.println(merc.mark +
                "\n" + merc.model + "\n" + merc.color +
                "\n" + merc.capacity + "\n" + merc.year +
                "\n" + merc.countryOfOrigin);

        System.out.println("------------------------");

        merc.model = "GW";
        System.out.println(merc.mark +
                "\n" + merc.model + "\n" + merc.color +
                "\n" + merc.capacity + "\n" + merc.year +
                "\n" + merc.countryOfOrigin);

        System.out.println("------------------------");
        System.out.println(merc.driving());
        System.out.println(merc.beep());
    }
}
