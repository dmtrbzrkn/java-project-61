package hexlet.code.games;

import static hexlet.code.General.NUMBERS_OF_ROUND;
import static hexlet.code.General.FROM_VALUE_NUMBER;
import static hexlet.code.General.TO_VALUE_NUMBER;
import static hexlet.code.General.pseudorandom;
import static hexlet.code.General.engineStart;

public class Even {

    public static void startGame() {
        String condition = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[][] answersAndQuestions = new String[NUMBERS_OF_ROUND][2];

        for (int i = 0; i < NUMBERS_OF_ROUND; i++) {
            int currentNumber = pseudorandom(FROM_VALUE_NUMBER, TO_VALUE_NUMBER);

            answersAndQuestions[i][0] = String.valueOf(currentNumber);

            if (currentNumber % 2 == 0) {
                answersAndQuestions[i][1] = "yes";
            } else {
                answersAndQuestions[i][1] = "no";
            }
        }
        engineStart(condition, answersAndQuestions);
    }
}
