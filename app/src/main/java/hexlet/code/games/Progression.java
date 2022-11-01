package hexlet.code.games;

import static hexlet.code.Engine.NUMBERS_OF_ROUND;
import static hexlet.code.Engine.FROM_VALUE_NUMBER;
import static hexlet.code.Engine.TO_VALUE_NUMBER;
import static hexlet.code.RandomUtils.generatePsrNumber;
import static hexlet.code.Engine.runGame;

public class Progression {
    public static final int LAST_NUMBER = 10;
    public static final String TASK = "What number is missing in the progression?";

    public static void startGame() {
        String[][] answersAndQuestions = new String[NUMBERS_OF_ROUND][2];

        for (int i = 0; i < NUMBERS_OF_ROUND; i++) {
            int firstTerm = generatePsrNumber(FROM_VALUE_NUMBER, TO_VALUE_NUMBER);
            int difference = generatePsrNumber(FROM_VALUE_NUMBER, TO_VALUE_NUMBER);

            int[] progression = generateProgression(firstTerm, difference);
            int positionNumber = generatePsrNumber(0, progression.length - 1);

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
        runGame(TASK, answersAndQuestions);
    }

    private static int[] generateProgression(int firstTerm, int difference) {
        int[] progression = new int[Progression.LAST_NUMBER];
        progression[0] = firstTerm;

        for (int i = 1; i < progression.length; i++) {
            progression[i] = progression[i - 1] + difference;
        }
        return progression;
    }
}
