package hexlet.code.utils;

import static hexlet.code.Engine.NUMBERS_OF_ROUND;
import static hexlet.code.Engine.FROM_VALUE_NUMBER;
import static hexlet.code.Engine.TO_VALUE_NUMBER;
import static hexlet.code.utils.RandomUtils.generateNumber;

public class PrimeOrEven {
    public static String[][] runOneOfGame(String nameOfGame) {
        String[][] answersAndQuestions = new String[NUMBERS_OF_ROUND][2];

        for (int i = 0; i < NUMBERS_OF_ROUND; i++) {
            int randomNumber = generateNumber(FROM_VALUE_NUMBER, TO_VALUE_NUMBER);
            answersAndQuestions[i][0] = String.valueOf(randomNumber);
            if (nameOfGame.equals("EvenGame")) {
                answersAndQuestions[i][1] = isEven(randomNumber) ? "yes" : "no";
            } else if (nameOfGame.equals("PrimeGame")) {
                answersAndQuestions[i][1] = isPrime(randomNumber) ? "yes" : "no";
            }
        }
        return answersAndQuestions;
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

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
