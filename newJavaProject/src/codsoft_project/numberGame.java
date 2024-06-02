package codsoft_project;

import java.util.Random;
import java.util.Scanner;

public class numberGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        int lowerBound=1;
        int upperBound=100;


        int numberToGauss=random.nextInt(upperBound-lowerBound+1);
        int attempts=0;
        int maxAttempts=10;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between "+ lowerBound+ " and "+ upperBound +". Can you guess it?");


        while (attempts<maxAttempts){
            System.out.println("Enter your guess number: ");
            int userGuess = sc.nextInt();
            attempts++;

            if(userGuess==numberToGauss){
                System.out.println("Congratulations! you've guessed the correct number in "+ attempts + " attempts.");
                break;
            } else if (userGuess<numberToGauss) {
                System.out.println("Try s higher number!");
            }
            else System.out.println("Try a lower number!");
        }
        if(attempts==maxAttempts){
            System.out.println("Sorry! you've reached the maximum number of attempts. The correct number was : "+ numberToGauss);
        }
        System.out.println("Thanks for playing!");
    }
}
