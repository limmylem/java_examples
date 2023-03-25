import java.util.Scanner;
import java.util.Random;

@SuppressWarnings("InfiniteRecursion")
public class GuessingGame {
    static int num;
    static Scanner scanner = new Scanner(System.in);

    static Random rand = new Random();
    public static void main(String[] args) {
        num = rand.nextInt(100);
        System.out.println("Let's play the guessing game!\nI will think of a number between 0 and 100, and you have to guess it.\nI will tell you higher or lower until you have guessed my number.");
        GuessAgain();
    }

    public static void GuessAgain() {
        int numGuess = scanner.nextInt();
        int Difficulty = 100;
        Difficulty *= 10;
        if (numGuess == num) {
            System.out.println("Congrats, you won!");
            num = rand.nextInt(Difficulty);
            System.out.println("Would you like to play again\nif so guess the next number\nthis time it will be even harder");
            GuessAgain();
        } else if (numGuess > num) {
            System.out.println("Lower");
            GuessAgain();
        } else {
            System.out.println("Higher");
            GuessAgain();
        }
    }
}
