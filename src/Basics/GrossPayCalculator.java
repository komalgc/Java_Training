package Basics;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main (String arg[]){

        //Get the no of hours worked
        System.out.println("Enter the no of hours worked");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //Get the rate for per
        System.out.println("Enter the rate per hour");
        double rate = scanner.nextDouble();
        scanner.close();

        //multiply the gross pay
        double grosspay = hours * rate;

        //Print the gross pay
        System.out.println("The gross pay is " + grosspay);
    }
}
