package degree;

public abstract class Weather {

    protected double summer;
    protected double fall;
    protected double winter;
    protected double spring;

    public Weather(double summer, double fall, double winter, double spring) {
        this.summer = summer;
        this.fall = fall;
        this.winter = winter;
        this.spring = spring;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "summer=" + summer +
                ", fall=" + fall +
                ", winter=" + winter +
                ", spring=" + spring +
                '}';
    }


}
