package IfStatements;

import java.util.Scanner;

public class IfElseStatement {

    /* IF Else Statement
    *All Sales people are expected to make 10 sales per week
    * For those who do , they receive a congratulatory message
    * For those who dont, they are informed how many sales they were short of
     */

    public static void main (String arg[]){

        int quota = 10;

        //Get the no of sales made
        System.out.println("Enter the no of sales made this week");
        Scanner scanner = new Scanner(System.in);
        int sales =scanner.nextInt();
        scanner.close();

        if (sales >= quota){
            System.out.println(" Congratulations u have exceeded ur sales quota");

        }
        else {
            int salesshort = quota - sales;
            System.out.println("You did not make your quota, you were " +salesshort + " sales short" );

        }
    }
}
