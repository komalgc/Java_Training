package Basics;

import java.util.Scanner;

public class Madlibs {

    public static void main (String arg[]){

        //Ask the user for season of the year
        System.out.println("Hey you please enter your favourite season of the year");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //Enter the whole number
        System.out.println("Enter the whole number");
        int number = scanner.nextInt();

        //Enter the Adjective
        System.out.println("Enter the adjective");
        String adjective = scanner.next();
        scanner.close();


        //On a [Adjective] [Season of the year] day , I drink a minimum of [Whole number] cups of coffee
        System.out.println("On a " + adjective + season + " day , I drink a minimum of " + number + " cups of coffee");
    }
}
