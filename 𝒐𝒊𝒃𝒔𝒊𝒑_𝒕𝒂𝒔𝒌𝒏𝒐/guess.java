import java.util.Random;
import java.util.Scanner;
 
public class guess{
 
    public static void main (String[] args)
    {
        // Scanner Class
        Scanner sc = new Scanner(System.in);
 
        // Generate the numbers
        Random r = new Random();
        int number = r.nextInt(100)+1;
     
 
        // Given K trials
        int K = 7;
 
        int i, guess;
 
        System.out.println("A number is chosen"+ " between 1 to 100."
            + "\nGuess the number"
            + " within 5 trials.");
 
        // Iterate over K Trials
        for (i = 0; i < K; i++) {
 
            System.out.println("Guess the number:");
 
            // Take input for guessing
            guess = sc.nextInt();
 
            // If the number is guessed
            if (number == guess) {
                System.out.println( "Congratulations!" + " You guessed the number.");
                break;
            }
            else if (number > guess && i != K - 1) {
                System.out.println(
                    "The number is "
                    + "greater than " + guess);
            }
            else if (number < guess
                     && i != K - 1) {
                System.out.println(
                    "The number is"
                    + " less than " + guess);
            }
        }
 
        if (i == K) {
            System.out.println( "oops! your trails are completed."
            +"Better luck next time!");
 
            System.out.println(
                "The number was " + number);
        }
    }
 
}