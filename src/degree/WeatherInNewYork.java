package degree;

import java.util.Scanner;

public class WeatherInNewYork extends Weather implements Convert{

    public double fahrenheit;

    public WeatherInNewYork(double summer, double fall, double winter, double spring) {
        super(summer, fall, winter, spring);
    }

    @Override
    public double airTemperatureConversion(Weather weather) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();
        double formula = 0.0;

        switch (season){
            case "summer" : formula = (weather.summer - 32) * 5 / 9;
            break;
            case "fall" : formula = (weather.fall - 32) * 5 / 9;
            break;
            case "winter" : formula = (weather.winter - 32) * 5 / 9;
            break;
            case "spring" : formula = (weather.spring - 32) * 5 / 9;
            break;
        }
        return formula;
    }

//    public String cloudy(){
//        return "Weather: cloudy";
//    }
}
