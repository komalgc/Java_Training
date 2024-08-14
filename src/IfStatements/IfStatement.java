package IfStatements;

import java.util.Scanner;

public class IfStatement {

    public static void main (String args[]){

        /* IF statement
        All sale people get a payment of $1000 every week
        Salespeople who exceed sales more than 10 get an additional bonus of $250
         */

        //we know the payment value which is $1000

        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //get the no of sales made every week
        System.out.println("enter the no of sales made this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();

        if(sales > quota){

            salary = salary + bonus;
        }

        System.out.println(" How many sales did the employee made this week " + salary);
    }

}
