package hexlet.code.games;

import static hexlet.code.Engine.NUMBERS_OF_ROUND;
import static hexlet.code.Engine.FROM_VALUE_NUMBER;
import static hexlet.code.Engine.TO_VALUE_NUMBER;
import static hexlet.code.utils.RandomUtils.generateNumber;
import static hexlet.code.Engine.runGame;


public class CalculatorGame {
    private static final char[] OPERATIONS = {'+', '-', '*'};
    private static final String TASK = "What is the result of the expression?";

    public static void startCalculatorGame() {
        String[][] answersAndQuestions = new String[NUMBERS_OF_ROUND][2];

        for (int i = 0; i < NUMBERS_OF_ROUND; i++) {
            int firstOperand = generateNumber(FROM_VALUE_NUMBER, TO_VALUE_NUMBER);
            int secondOperand = generateNumber(FROM_VALUE_NUMBER, TO_VALUE_NUMBER);
            char currentOperator = generateOperation();

            answersAndQuestions[i][0] = String.format("%d %s %d", firstOperand, currentOperator, secondOperand);
            answersAndQuestions[i][1] = calculateAnswer(currentOperator, firstOperand, secondOperand);
        }
        runGame(TASK, answersAndQuestions);
    }

    private static char generateOperation() {
        return OPERATIONS[generateNumber(0, OPERATIONS.length - 1)];
    }

    private static String calculateAnswer(char operator, int number1, int number2) {
        switch (operator) {
            case '+' -> {
                return String.valueOf(number1 + number2);
            }
            case '-' -> {
                return String.valueOf(number1 - number2);
            }
            case '*' -> {
                return String.valueOf(number1 * number2);
            }
            default -> throw new RuntimeException("No such operator");
        }
    }
}
