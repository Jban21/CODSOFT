import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        int maxAttempts = 10s;
        int roundsWon = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        boolean playAgain = true;
        while (playAgain) {
            int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attempts = 0;
            boolean hasGuessedCorrectly = false;

            System.out.println("I have selected a random number between 1 and 100. Can you guess it?");
            
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == numberToGuess) {
                    hasGuessedCorrectly = true;
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    roundsWon++;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                int remainingAttempts = maxAttempts - attempts;
                if (remainingAttempts > 0) {
                    System.out.println("You have " + remainingAttempts + " attempts left.");
                } else {
                    System.out.println("Sorry, you've run out of attempts. The correct number was: " + numberToGuess);
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.equals("yes");
        }

        System.out.println("Thank you for playing! You won " + roundsWon + " rounds.");
        scanner.close();
    }
}
