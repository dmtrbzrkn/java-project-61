package hexlet.code.games;

import static hexlet.code.Engine.NUMBERS_OF_ROUND;
import static hexlet.code.Engine.FROM_VALUE_NUMBER;
import static hexlet.code.Engine.TO_VALUE_NUMBER;
import static hexlet.code.RandomUtils.generatePsrNumber;
import static hexlet.code.Engine.runGame;

public class Prime {
    public static final String TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void startGame() {
        String[][] answersAndQuestions = new String[NUMBERS_OF_ROUND][2];

        for (int i = 0; i < NUMBERS_OF_ROUND; i++) {
            int randomNumber = generatePsrNumber(FROM_VALUE_NUMBER, TO_VALUE_NUMBER);
            answersAndQuestions[i][0] = String.valueOf(randomNumber);
            if (isPrime(randomNumber)) {
                answersAndQuestions[i][1] = "yes";
            } else {
                answersAndQuestions[i][1] = "no";
            }
        }
        runGame(TASK, answersAndQuestions);
    }

    private static boolean isPrime(int number) {
        if (number > 1) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
