package practiceInterface;

public class AirPlane extends FlyingObject implements Landing, TakingOff{
    public AirPlane(String name, int wheels, int seats, int windows) {
        super(name, wheels, seats, windows);
    }

    @Override
    public String Fly() {
        return "Взлетает горизонтально";
    }
}
