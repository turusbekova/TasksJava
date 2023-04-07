package practiceInterface;

public class Helicopter extends FlyingObject{


    public Helicopter(String name, int wheels, int seats, int windows) {
        super(name, wheels, seats, windows);
    }

    @Override
    public String Fly() {
        return "Взлетает вертикально";
    }
}
