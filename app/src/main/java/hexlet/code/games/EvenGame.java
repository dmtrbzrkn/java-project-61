package hexlet.code.games;

import static hexlet.code.Engine.NUMBERS_OF_ROUND;
import static hexlet.code.Engine.FROM_VALUE_NUMBER;
import static hexlet.code.Engine.TO_VALUE_NUMBER;
import static hexlet.code.utils.RandomUtils.generateNumber;
import static hexlet.code.Engine.runGame;

public class EvenGame {
    public static final String TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void startEvenGame() {
        String[][] answersAndQuestions = new String[NUMBERS_OF_ROUND][2];

        for (int i = 0; i < NUMBERS_OF_ROUND; i++) {
            int currentNumber = generateNumber(FROM_VALUE_NUMBER, TO_VALUE_NUMBER);
            answersAndQuestions[i][0] = String.valueOf(currentNumber);
            answersAndQuestions[i][1] = isEven(currentNumber) ? "yes" : "no";
        }
        runGame(TASK, answersAndQuestions);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
