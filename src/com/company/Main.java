package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


	double[] dailyAverageTemp = new double[7];


	for(int i  = 0; i < dailyAverageTemp.length; i++){

        System.out.println("Please enter the temperature for day " + (i+1));
        double dailyTemp = scan.nextDouble();
        dailyAverageTemp[i] = dailyTemp;

    }


    System.out.println("The temperatures are: " +  Arrays.toString(dailyAverageTemp));


    }
}
