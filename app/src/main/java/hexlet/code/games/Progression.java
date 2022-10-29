package hexlet.code.games;

import static hexlet.code.General.NUMBERS_OF_ROUND;
import static hexlet.code.General.FROM_VALUE_NUMBER;
import static hexlet.code.General.TO_VALUE_NUMBER;
import static hexlet.code.General.pseudorandom;
import static hexlet.code.General.engineStart;

public class Progression {
    public static void startGame() {
        String condition = "What number is missing in the progression?";
        String[][] answersAndQuestions = new String[NUMBERS_OF_ROUND][2];

        for (int i = 0; i < NUMBERS_OF_ROUND; i++) {
            int firstTerm = pseudorandom(FROM_VALUE_NUMBER, TO_VALUE_NUMBER);
            int difference = pseudorandom(FROM_VALUE_NUMBER, TO_VALUE_NUMBER);

            int[] progression = generateProgression(firstTerm, difference);
            int positionNumber = pseudorandom(0, progression.length - 1);

            answersAndQuestions[i][1] = Integer.toString(progression[positionNumber]);
            var question = new StringBuilder();
            for (int j = 0; j < progression.length; j++) {
                if (j == positionNumber) {
                    question.append(".. ");
                } else {
                    question.append(progression[j]);
                    question.append(" ");
                }
            }
            answersAndQuestions[i][0] = question.toString();
        }
        engineStart(condition, answersAndQuestions);
    }

    public static int[] generateProgression(int firstTerm, int difference) {
        int lastNumber = 10;
        int[] progression = new int[lastNumber];
        progression[0] = firstTerm;

        for (int i = 1; i < progression.length; i++) {
            progression[i] = progression[i - 1] + difference;
        }
        return progression;
    }
}
