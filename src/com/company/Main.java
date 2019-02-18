package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome to our gym! Please enter your first name: ");
        String firstName = scanner.next();

        System.out.print("\nThanks, " + firstName + "! Please enter your last name: ");
        String lastName = scanner.next();

        System.out.print("\nThank you! Please enter your age: ");
        int userAge = scanner.nextInt();

        System.out.println("\nPlease check the following information: \nName: " + firstName + " " + lastName + "\nAge: " + userAge);

        System.out.print("\nIs the above information correct? (enter y/n): ");
        String infoCheck = scanner.next();

        if (infoCheck.equals("y") && userAge >= 35) {
            System.out.println("\nGreat! Are you interested in joining our Exercise Club? (enter y/n): ");
            String clubInterest = scanner.next();
            if (clubInterest.equals("y")) {
                System.out.println("\nPlease see the receptionist for more information on the Exercise Club.");
            }
            else {
                System.out.println("\nOK, enjoy the gym!");
            }
        } 
        else if (infoCheck.equals("y") && userAge < 26) {
            System.out.println("\nGreat! Are you interested in joining our Young Adult Exercise Club? (enter y/n): ");
            String youngClubInterest = scanner.next();
            if (youngClubInterest.equals("y")) {
                System.out.println("\nPlease see the receptionist for more information on the Young Adult Exercise Club.");
            }
            else {
                System.out.println("\nOK, enjoy the gym!");
            }
        } 
        else {
            System.out.println("\nI'm sorry, please see the receptionist!");
        }
    }
}
