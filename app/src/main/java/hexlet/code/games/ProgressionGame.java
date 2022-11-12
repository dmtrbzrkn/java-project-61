package hexlet.code.games;

import static hexlet.code.Engine.NUMBERS_OF_ROUND;
import static hexlet.code.Engine.FROM_VALUE_NUMBER;
import static hexlet.code.Engine.TO_VALUE_NUMBER;
import static hexlet.code.utils.RandomUtils.generateNumber;
import static hexlet.code.Engine.runGame;

public class ProgressionGame {
    private static final int MIN_PROGRESSION_LENGTH = 5;
    private static final int MAX_PROGRESSION_LENGTH = 10;
    private static final String TASK = "What number is missing in the progression?";

    public static void startProgressionGame() {
        String[][] answersAndQuestions = new String[NUMBERS_OF_ROUND][2];
        for (int i = 0; i < NUMBERS_OF_ROUND; i++) {
            int length = generateNumber(MIN_PROGRESSION_LENGTH, MAX_PROGRESSION_LENGTH);
            int firstTerm = generateNumber(FROM_VALUE_NUMBER, TO_VALUE_NUMBER);
            int difference = generateNumber(FROM_VALUE_NUMBER, TO_VALUE_NUMBER);
            int[] progression = generateProgression(firstTerm, difference, length);
            int positionNumber = generateNumber(0, progression.length - 1);
            answersAndQuestions[i][1] = Integer.toString(progression[positionNumber]);
            StringBuilder question = new StringBuilder();
            for (int j = 0; j < progression.length; j++) {
                if (j == positionNumber) {
                    question.append(".. ");
                } else {
                    question.append(progression[j]).append(" ");
                }
            }
            answersAndQuestions[i][0] = question.toString();
        }
        runGame(TASK, answersAndQuestions);
    }

    public static int[] generateProgression(int firstTerm, int difference, int length) {
        int[] progression = new int[length];
        for (int i = 0; i < progression.length; i++) {
            progression[i] = firstTerm + difference * i;
        }
        return progression;
    }
}
