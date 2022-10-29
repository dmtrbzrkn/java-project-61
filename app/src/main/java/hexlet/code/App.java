package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit
                Your choice:\s""");
        String choice = scanner.next();

        switch (choice) {
            case "1" -> Cli.greet();
            case "2" -> Even.startGame();
            case "0" -> System.out.println("Come back if you want to play!");
            default -> System.out.println("Incorrect input!");
        }
    }
}
