package Baitap.chuyendoinhietdo;

public class ConvertTemperature {
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0/5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5/9.0) * (fahrenheit - 32);
        return celsius;
    }
}
