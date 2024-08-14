package IfStatements;

import java.util.Scanner;

public class Switch {

    public static void main (String args[]){

        System.out.println("Enter your grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message;

        switch (grade){
            case "A":
                message = "Excellent job";
                break;
            case "B":
                message = "Great job";
                break;
            case "C":
                message = "Good job";
                break;
            case "D":
                message = "Better luck next time";
                break;
            default:
                message = "Error";}


        System.out.println(message);
    }
}
