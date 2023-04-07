package degree;

public class WeatherMain {
    public static void main(String[] args) {

//        WeatherInNewYork newYork = new WeatherInNewYork(65.10, 50.45, 30.21, 49.34);
//
//        double newYorkWeatherInCelsius = newYork.airTemperatureConversion(newYork);
//        System.out.println(newYorkWeatherInCelsius);
//
//        Convert newYork2 = new WeatherInNewYork(69.09,45.21,38.32,45.65);
//
       WeatherInLosAngeles losAngeles = new WeatherInLosAngeles(56.34,25.45, 38.34,32.98);

        double losAngelesWeather = losAngeles.airTemperatureConversion(losAngeles);
        System.out.println(losAngelesWeather);



    }
}
