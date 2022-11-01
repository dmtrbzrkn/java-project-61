package hexlet.code.games;

import static hexlet.code.Engine.NUMBERS_OF_ROUND;
import static hexlet.code.Engine.FROM_VALUE_NUMBER;
import static hexlet.code.Engine.TO_VALUE_NUMBER;
import static hexlet.code.RandomUtils.generatePsrNumber;
import static hexlet.code.RandomUtils.generatePsrChar;
import static hexlet.code.Engine.runGame;


public class Calculator {
    private static final String TASK = "What is the result of the expression?";

    public static void startCalc() {
        String[][] answersAndQuestions = new String[NUMBERS_OF_ROUND][2];
        char[] operation = new char[]{'+', '-', '*'};

        for (int i = 0; i < NUMBERS_OF_ROUND; i++) {
            int firstOperand = generatePsrNumber(FROM_VALUE_NUMBER, TO_VALUE_NUMBER);
            int secondOperand = generatePsrNumber(FROM_VALUE_NUMBER, TO_VALUE_NUMBER);
            char currentOperator = generatePsrChar(operation);

            answersAndQuestions[i][0] = String.format("%d %s %d", firstOperand, currentOperator, secondOperand);
            answersAndQuestions[i][1] = calc(currentOperator, firstOperand, secondOperand);
        }
        runGame(TASK, answersAndQuestions);
    }

    private static String calc(char operator, int number1, int number2) {
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
            default -> {
                return "Incorrect operator";
            }
        }
    }
}
