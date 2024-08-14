package Loops;

import java.util.Scanner;

public class While {

    public static void main (String args[]){

        int rate = 15;
        double grosspay;
        double maxworkhours = 40;

        System.out.println("Enter the hours worked");
        Scanner scanner = new Scanner(System.in);
        double hoursworked = scanner.nextDouble();

        while(hoursworked > maxworkhours ){
            System.out.println("you have crossed your max hours");
            hoursworked = scanner.nextDouble();
        }

      grosspay = rate * hoursworked;
        System.out.println("Your gross pay is " + grosspay);
    }
}
