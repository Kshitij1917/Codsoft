import java.util.Random;
import java.util.Scanner;
public class GuessingGame 
{
    public static void main(String[] args) 
    {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int maxAttempts = 10; 
        int score = 0; 
        boolean playAgain = true;
        System.out.println("Welcome to the Guessing Game!");
        while (playAgain) {
            int correctNumber = random.nextInt(100) + 1; 
            int attempts = 0;
            boolean guessedCorrectly = false;
            System.out.println("I have chosen a number between 1 and 100. Can you guess it?");
            while (attempts < maxAttempts && !guessedCorrectly) 
            {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == correctNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    score += (maxAttempts - attempts + 1); 
                    guessedCorrectly = true;
                }
                else if (userGuess < correctNumber) 
                {
                    System.out.println("Your guess is too low. Try again.");
                } 
                else 
                {
                    System.out.println("Your guess is too high. Try again.");
                }
            }
            if (!guessedCorrectly)
            {
                System.out.println("Sorry, you've used all your attempts. The correct number was " + correctNumber + ".");
            }
            System.out.println("Your current score is: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = scanner.next().toLowerCase();
            if (!playAgainResponse.equals("yes")) 
            {
                playAgain = false;
            }
        }
        System.out.println("Thank you for playing! Your final score is: " + score);
        scanner.close();
    }
}
