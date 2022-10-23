package hexlet.code;

import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit""");
        System.out.print("Your choice: ");
        int yourChoice = scanner.nextInt();

        switch (yourChoice) {
            case 1 -> Cli.greet();
            case 2 -> Even.checkEven();
            case 0 -> System.out.println("Come back if you want to play!");
            default -> System.out.println("Incorrect input!");
        }
        scanner.close();
    }
}
