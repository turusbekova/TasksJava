package practiceInterface;

public class Main {
    public static void main(String[] args) {

        AirPlane air = new AirPlane("Boine", 8, 20, 250);
        System.out.println(air);

        Helicopter heli = new Helicopter("Стрекоза", 3,6,10);
        System.out.println(heli);

        Airport manas = new Airport();
        System.out.println(air.Fly());


    }
}
