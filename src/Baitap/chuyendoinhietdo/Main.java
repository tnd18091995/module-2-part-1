package Baitap.chuyendoinhietdo;

import java.util.Scanner;

import static Baitap.chuyendoinhietdo.ConvertTemperature.celsiusToFahrenheit;
import static Baitap.chuyendoinhietdo.ConvertTemperature.fahrenheitToCelsius;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        int choice;
        do {
            System.out.println(" 1. Convert Celsius To Fahrenheit");
            System.out.println(" 2. Convert Fahrenheit To Celsius");
            System.out.println(" 0. Exit");
            System.out.println(" Enter Your Choice");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Celsius: ");
                    celsius = input.nextDouble();
                    System.out.println("Celsius To Fahrenheit is: " + celsiusToFahrenheit(celsius));
                    break;
                case 2:
                    System.out.println("Enter Fahrenheit is: ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Fahrenheit To Celsius is: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 0:
                    System.exit(0);
            }

        }while (choice != 0);
    }
}
