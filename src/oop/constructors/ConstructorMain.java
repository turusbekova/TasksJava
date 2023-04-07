package oop.constructors;

public class ConstructorMain {
    public static void main(String[] args) {

        Constructor1 bugatti = new Constructor1();

        bugatti.mark = "Bugatti";
        bugatti.model = "Chiron";
        bugatti.color = "Black";
        bugatti.wheel = 4;
        bugatti.volume = 8.0;
        bugatti.years = 2015;

        bugatti.getInfo();

        Constructor2 ferrari = new Constructor2("Ferrari", "LaFerrari 812",
                "Red", 8.0, 4, 2018);

        System.out.println(ferrari.color);

        System.out.println(ferrari.mark + " " + ferrari.years);

        System.out.println(ferrari.driving());
    }

}
