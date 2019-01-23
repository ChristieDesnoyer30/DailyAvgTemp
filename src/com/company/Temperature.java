package com.company;

import java.text.DecimalFormat;

public class Temperature {

    DecimalFormat df = new DecimalFormat("0.00");

    private double degreesInFahrenheit;

    public Temperature() {
    }

    public Temperature(double degreesInFahrenheit) {
        this.degreesInFahrenheit = degreesInFahrenheit;
    }

    public double getDegreesInFahrenheit() {
        return degreesInFahrenheit;
    }

    public void setDegreesInFahrenheit(double degreesInFahrenheit) {
        this.degreesInFahrenheit = degreesInFahrenheit;
    }



    public double calculateFahrenheitToCelsius(double degreesInFahrenheit){

        return ((degreesInFahrenheit - 32) / 1.8);

    }


    public String tempsInFahrenheit() {
        return "Temperature in fahrenheit : " + degreesInFahrenheit;
    }

    public String tempsInCelsius(){

       return "In celsius : " + df.format(calculateFahrenheitToCelsius(degreesInFahrenheit));
    }
}
