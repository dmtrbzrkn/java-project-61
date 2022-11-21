package hexlet.code.games;

import static hexlet.code.Engine.NUMBERS_OF_ROUND;
import static hexlet.code.Engine.FROM_VALUE_NUMBER;
import static hexlet.code.Engine.TO_VALUE_NUMBER;
import static hexlet.code.utils.RandomUtils.generateNumber;
import static hexlet.code.Engine.runGame;

public class GCDGame {
    public static final String TASK = "Find the greatest common divisor of given numbers.";

    public static void startGCDGame() {
        String[][] answersAndQuestions = new String[NUMBERS_OF_ROUND][2];

        for (int i = 0; i < NUMBERS_OF_ROUND; i++) {
            int firstNumber = generateNumber(FROM_VALUE_NUMBER, TO_VALUE_NUMBER);
            int secondNumber = generateNumber(FROM_VALUE_NUMBER, TO_VALUE_NUMBER);

            answersAndQuestions[i][0] = String.format("%d %d", firstNumber, secondNumber);
            answersAndQuestions[i][1] = String.valueOf(findGCD(firstNumber, secondNumber));
        }
        runGame(TASK, answersAndQuestions);
    }

    private static int findGCD(int firstNumber, int secondNumber) {
        firstNumber = Math.abs(firstNumber);
        secondNumber = Math.abs(secondNumber);
        if (secondNumber > firstNumber) {
            int temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }
        int r = firstNumber % secondNumber;
        while (r != 0) {
            firstNumber = secondNumber;
            secondNumber = r;
            r = firstNumber % secondNumber;
        }
        return secondNumber;
    }
}
