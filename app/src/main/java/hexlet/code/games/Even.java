package hexlet.code.games;


import java.util.Scanner;

public class Even {
    public static void checkEven() {
        String playerName;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        playerName = scanner.next();
        System.out.println("Hello, " + playerName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }
}
