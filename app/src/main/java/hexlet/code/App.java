package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int yourChoice = scanner.nextInt();

        switch (yourChoice) {
            case 1 -> Cli.greet();
            case 2 -> Even.startEven();
            case 0 -> System.out.println("Come back if you want to play!");
            default -> System.out.println("Incorrect input!");
        }
        scanner.close();
    }
}
