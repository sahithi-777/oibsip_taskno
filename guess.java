import java.util.Random;
import java.util.Scanner;

public class guess {
    public static void main(String[] args) {
        // Scanner Class
        Scanner sc = new Scanner(System.in);

        // Generate the numbers
        Random r = new Random();
        
        int K = 7; // Given K trials
        int rounds = 1; // Number of rounds
        int totalScore = 0; // Total score across all rounds

        while (true) {
            int number = r.nextInt(100) + 1;
            int i, guess;
            int score = 0; // Score for current round

            System.out.println("Round " + rounds + ": A number is chosen between 1 to 100. Guess the number within 7 trials.");

            // Iterate over K Trials
            for (i = 0; i < K; i++) {

                System.out.println("Guess the number:");

                // Take input for guessing
                guess = sc.nextInt();

                // If the number is guessed
                if (number == guess) {
                    System.out.println("Congratulations! You guessed the number.");
                    score = 10 - i; // Award points based on the number of attempts
                    totalScore += score;
                    break;
                } else if (number > guess && i != K - 1) {
                    System.out.println("The number is greater than " + guess);
                } else if (number < guess && i != K - 1) {
                    System.out.println("The number is less than " + guess);
                }
            }

            if (i == K) {
                System.out.println("Oops! Your trials are completed. Better luck next time!");
                System.out.println("The number was " + number);
            }

            System.out.println("Your score for this round: " + score);
            System.out.println("Your total score: " + totalScore);

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = sc.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
            rounds++;
        }

        System.out.println("Thanks for playing!");
        sc.close();
    }
}
