package degree;

import java.util.Scanner;

public class WeatherInLosAngeles extends Weather implements Convert{

    private double kelvin;

    public WeatherInLosAngeles(double summer, double fall, double winter, double spring) {
        super(summer, fall, winter, spring);
    }


    @Override
    public double airTemperatureConversion(Weather weather) {
        Scanner scan = new Scanner(System.in);
        String season = scan.next();
        double form = 0.0;

        if (form == weather.summer){
            System.out.println(weather.summer - 32 * 5 / 9);
        }
        if (form == weather.fall){
            System.out.println(weather.fall - 32 * 5 / 9);
        }
        if (form == weather.spring) {
            System.out.println(weather.spring - 32 * 5 / 9);
        } else if (form == weather.winter){
            System.out.println(weather.winter - 32 *5 / 9);
        }
        return form;
    }
}
