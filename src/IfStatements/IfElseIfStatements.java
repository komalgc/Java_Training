package IfStatements;

import java.util.Scanner;

public class IfElseIfStatements {

    public static void main (String args[]){

        System.out.println("Enter the Score to know the grade");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();

        char grade;

        if(score < 60){
            System.out.println("You got F");
        } else if (score < 70) {
            System.out.println("You got D");

        } else if (score < 80) {
            System.out.println("You got C");

        } else if (score < 90) {
            System.out.println("You got B");

        }
        else {
            System.out.println("You got A");
        }
    }
}
