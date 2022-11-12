package hexlet.code;

import hexlet.code.games.CalculatorGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;

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
                6 - Prime
                0 - Exit
                Your choice:\s""");
        String choice = scanner.next();

        switch (choice) {
            case "1" -> Cli.greet();
            case "2" -> EvenGame.startEvenGame();
            case "3" -> CalculatorGame.startCalculatorGame();
            case "4" -> GCDGame.startGCDGame();
            case "5" -> ProgressionGame.startProgressionGame();
            case "6" -> PrimeGame.startPrimeGame();
            case "0" -> System.out.println("Come back if you want to play!");
            default -> throw new RuntimeException("No such item");
        }
    }
}
