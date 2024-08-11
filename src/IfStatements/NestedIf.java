package IfStatements;

import java.util.Scanner;

public class NestedIf {

    /* NESTED IFS
    * To Qualify for a loan , a person makes at least $30000
    * and have been working at their current job for atleast 2 years
     */

    public static void main (String arg[]){

        int salaryquota = 30000;
        int yearsquota = 2;

        System.out.println("Enter the current salary of the employee");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the no current years of the job");
        double years = scanner.nextDouble();

        if(salary >= salaryquota){
            if(years >= yearsquota){
                System.out.println("Congratulations ur eligible for the loan");
                            }
            else {
                System.out.println(" Sorry you have not completed the required years " + yearsquota);
            }
        }
        else {
            System.out.println(" Sorry your salary is not in the required range " + salaryquota);
        }
    }
}
