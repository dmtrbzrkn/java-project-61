package hexlet.code.games;

import static hexlet.code.General.NUMBERS_OF_ROUND;
import static hexlet.code.General.FROM_VALUE_NUMBER;
import static hexlet.code.General.TO_VALUE_NUMBER;
import static hexlet.code.General.pseudorandom;
import static hexlet.code.General.engineStart;


public class Calculator {
    public static void startCalc() {
        String condition = "What is the result of the expression?";

        String[][] answersAndQuestions = new String[NUMBERS_OF_ROUND][2];
        char[] operation = new char[]{'+', '-', '*'};

        for (int i = 0; i < NUMBERS_OF_ROUND; i++) {
            int firstOperand = pseudorandom(FROM_VALUE_NUMBER, TO_VALUE_NUMBER);
            int secondOperand = pseudorandom(FROM_VALUE_NUMBER, TO_VALUE_NUMBER);
            char currentOperator = pseudorandomChar(operation);

            answersAndQuestions[i][0] = String.format("%d %s %d", firstOperand, currentOperator, secondOperand);
            answersAndQuestions[i][1] = calc(currentOperator, firstOperand, secondOperand);
        }
        engineStart(condition, answersAndQuestions);
    }

    public static String calc(char operator, int number1, int number2) {
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

    public static char pseudorandomChar(char[] operations) {
        return operations[pseudorandom(0, operations.length - 1)];
    }
}
