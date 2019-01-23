package com.company;
import java.util.Scanner;
public class Main {


    /*Modify your temperature exercise from lecture today so that your dailyAverageTemp array holds
    Temperature objects instead of doubles.
    +A Temperature should have (1) property which holds degrees in Fahrenheit.
    +A Temperature should also have a convertToCelsius() method which will convert
    a temperature from degrees Fahrenheit to degrees Celsius.
    +Your program should allow the user to enter (1) week of daily average temperatures,
    display all the daily average temperatures for a week,
    and display the weekly average temperature. The user should have the option to display
    temperatures in Fahrenheit or Celsius.*/

    public static void main(String[] args) {
//        double sum= 0.0;
//        double avg = 0.0;
//        int count = 0;

        Scanner scan = new Scanner(System.in);

	  Temperature[] dailyAverageTemp = new Temperature[7];

	for(int i  = 0; i < dailyAverageTemp.length; i++){

        System.out.println("Please enter the temperature for day " + (i + 1));

        double dailyTemp = scan.nextDouble();

        dailyAverageTemp[i] =  new Temperature();

        dailyAverageTemp[i].setDegreesInFahrenheit(dailyTemp);



    }


    System.out.println("Would you like to see your results in Fahrenheit or Celsius? \n 1. For Fahrenheit. 2. For Celsius");
	int userChoice = scan.nextInt();

	if (userChoice == 1 ) {

        for (Temperature temp : dailyAverageTemp) {

            double sum = 0.0;
            sum += (temp.getDegreesInFahrenheit());

            System.out.println(temp.tempsInFahrenheit());

        }

    } else {

	    for (Temperature temp : dailyAverageTemp){


	        System.out.println(temp.tempsInCelsius());


        }

    }



    }
}
