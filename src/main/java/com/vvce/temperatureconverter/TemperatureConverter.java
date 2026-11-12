package com.vvce.temperatureconverter;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToKelvin(double celsius) {
        double kelvin = celsius + 273.15;

        if (kelvin < 0) {
            throw new IllegalArgumentException(
                "Temperature cannot be below absolute zero"
            );
        }

        return kelvin;
    }

    public static void main(String[] args) {

        double celsius = 25;

        System.out.println("Celsius to Fahrenheit: "
                + celsiusToFahrenheit(celsius));

        System.out.println("Fahrenheit to Celsius: "
                + fahrenheitToCelsius(77));

        System.out.println("Celsius to Kelvin: "
                + celsiusToKelvin(celsius));
    }
}