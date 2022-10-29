package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                0 - Exit
                Your choice:\s""");
        String choice = scanner.next();

        switch (choice) {
            case "1" -> Cli.greet();
            case "2" -> Even.startGame();
            case "3" -> Calculator.startCalc();
            case "4" -> GCD.startGame();
            case "5" -> Progression.startGame();
            case "0" -> System.out.println("Come back if you want to play!");
            default -> System.out.println("Incorrect input!");
        }
    }
}
