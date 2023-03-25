import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what do you need to calculate?");
        System.out.println("1. addition");
        System.out.println("2. subtraction");
        System.out.println("3. multiplication");
        System.out.println("4. division");
        System.out.println("5. factorial");
        float choice =scanner.nextInt();
        System.out.println("what is your first number?");
        float num1 = scanner.nextInt();
        System.out.println("what is your second number");
        float num2 = scanner.nextInt();

        switch ((int) choice) {
            case 1 -> {
                float sum = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + sum);
            }
            case 2 -> {
                float sum2 = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + sum2);
            }
            case 3 -> {
                float sum3 = num1 * num2;
                System.out.println(num1 + " X " + num2 + " = " + sum3);
            }
            case 4 -> {
                float sum4 = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + sum4);
            }
            case 5 -> {
                int sum5 = 1;
                int sum6 = 1;
                for (int i = 2; i < num1; i++) {
                    sum5 *= i;
                }
                for (int i = 2; i < num2; i++) {
                    sum6 *= i;
                }
                System.out.println("you first factorial is: " + sum5 + "\nyour second factorial is: " + sum6);
            }
            default -> System.out.println("you need to enter a number!");
        }
    }
}
