import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args)
    {
         Scanner scanner = new Scanner(System.in);
         System.out.println("What number do you want me to?");
         int Num = scanner.nextInt();
         int Factorial = 1;
         for (int i = 2; i < Num; i++) {
             Factorial *= i;
         }
         System.out.println(Num + " ! = " + Factorial);
    }

}
