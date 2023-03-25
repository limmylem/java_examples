import java.util.Scanner;

public class TalkExample {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + " What is your favourite number?");
        int FavNum = scanner.nextInt();
        System.out.println(FavNum + " is my favourite number too!");
    }
}
