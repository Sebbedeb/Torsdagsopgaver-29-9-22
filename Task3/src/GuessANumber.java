import java.util.Random;
import java.util.Scanner;

public class GuessANumber
{

    private static int rnd_number;



    public static void main(String[] args)
    {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
        System.out.println("Can you guess what it is?...");
        makeAGuess();
    }

    private static void makeAGuess() {
        Scanner scan = new Scanner(System.in);
        int guess = scan.nextInt();
        boolean guessed;

        if (guess == rnd_number)
        {
            System.out.println("Nice, that's right!");
            guessed = true;
        }
        else if (guess < rnd_number)
        {
            System.out.println("The number is higher.");
            guessed = false;
        }
        else if (guess > rnd_number)
        {
            System.out.println("The number is lower.");
            guessed = false;
        }
        else
        {
            System.out.println("Please enter a numeric value.");
            guessed = false;
        }
        makeAGuess();
    }
}