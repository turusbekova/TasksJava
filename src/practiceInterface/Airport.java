package practiceInterface;

public class Airport {

    AirPlane plane;
    Helicopter helicopter;

    public Airport(Helicopter helicopter) {
        this.helicopter = helicopter;
    }

    public Airport(AirPlane plane) {
        this.plane = plane;
    }

    int places = 10;

    public Airport() {
        return;
    }

    public void Fly(Landing land){
       System.out.println( land.landing());
   }

   public void TakingOff(TakingOff take){
       System.out.println( take.takingOff());
   }





}
