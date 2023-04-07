package practiceInterface;

public abstract class FlyingObject {

   public String name;
   public String wings;
   public int wheels;
   private int seats;
   public int windows;

   public FlyingObject(String name, int wheels, int seats, int windows) {
      this.name = name;
      this.wheels = wheels;
      this.seats = seats;
      this.windows = windows;
   }

   @Override
   public String toString() {
      return "FlyingObject{" +
              "name='" + name + '\'' +
              ", wheels=" + wheels +
              ", seats=" + seats +
              ", windows=" + windows +
              '}';
   }

   public abstract String Fly();

}
