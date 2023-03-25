import java.util.Scanner;
import java.util.Random;
@SuppressWarnings("InfiniteRecursion")
public class Dice {

    static int num2;

    static Random rand = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        RollAgain();
    }
    public static void RollAgain()
    {
        System.out.println("How many sides do you want on you die?");
        int num1 =scanner.nextInt();
        num2 = rand.nextInt(num1);
        System.out.println("The die rolled a " + num2);
        System.out.println("Would you like to roll again?");
        RollAgain();
    }
}
