package com.company;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double sum= 0.0;
        double avg = 0.0;
        DecimalFormat df = new DecimalFormat("0.00");

        Scanner scan = new Scanner(System.in);


	double[] dailyAverageTemp = new double[7];


	for(int i  = 0; i < dailyAverageTemp.length; i++){

        System.out.println("Please enter the temperature for day " + (i + 1));

        double dailyTemp = scan.nextDouble();

        dailyAverageTemp[i] = dailyTemp;

        sum += dailyAverageTemp[i];

    }

	System.out.println("The daily temperatures are: ");
	for (int i = 0; i <dailyAverageTemp.length; i++){

	    System.out.print("Day " + (i + 1) + ": " + dailyAverageTemp[i] + " ");

    }

	avg = (sum/dailyAverageTemp.length);

    System.out.println("\nThe average of the temperatures is: " + df.format(avg));





    }
}
