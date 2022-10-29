package hexlet.code.games;

import hexlet.code.SearchGCD;

import static hexlet.code.General.NUMBERS_OF_ROUND;
import static hexlet.code.General.FROM_VALUE_NUMBER;
import static hexlet.code.General.TO_VALUE_NUMBER;
import static hexlet.code.General.pseudorandom;
import static hexlet.code.General.engineStart;

public class GCD {
    public static void startGame() {
        String condition = "Find the greatest common divisor of given numbers.";

        String[][] answersAndQuestions = new String[NUMBERS_OF_ROUND][2];

        for (int i = 0; i < NUMBERS_OF_ROUND; i++) {
            int firstNumber = pseudorandom(FROM_VALUE_NUMBER, TO_VALUE_NUMBER);
            int secondNumber = pseudorandom(FROM_VALUE_NUMBER, TO_VALUE_NUMBER);

            answersAndQuestions[i][0] = String.format("%d %d", firstNumber, secondNumber);
            answersAndQuestions[i][1] = String.valueOf(SearchGCD.binaryGCD(firstNumber, secondNumber));
        }
        engineStart(condition, answersAndQuestions);
    }
}
