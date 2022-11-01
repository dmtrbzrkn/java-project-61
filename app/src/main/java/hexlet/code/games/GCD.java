package hexlet.code.games;

import hexlet.code.GCDFinder;

import static hexlet.code.Engine.NUMBERS_OF_ROUND;
import static hexlet.code.Engine.FROM_VALUE_NUMBER;
import static hexlet.code.Engine.TO_VALUE_NUMBER;
import static hexlet.code.RandomUtils.generatePsrNumber;
import static hexlet.code.Engine.runGame;

public class GCD {
    public static final String TASK = "Find the greatest common divisor of given numbers.";

    public static void startGame() {
        String[][] answersAndQuestions = new String[NUMBERS_OF_ROUND][2];

        for (int i = 0; i < NUMBERS_OF_ROUND; i++) {
            int firstNumber = generatePsrNumber(FROM_VALUE_NUMBER, TO_VALUE_NUMBER);
            int secondNumber = generatePsrNumber(FROM_VALUE_NUMBER, TO_VALUE_NUMBER);

            answersAndQuestions[i][0] = String.format("%d %d", firstNumber, secondNumber);
            answersAndQuestions[i][1] = String.valueOf(GCDFinder.findGCD(firstNumber, secondNumber));
        }
        runGame(TASK, answersAndQuestions);
    }
}
