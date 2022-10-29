package hexlet.code.games;

import static hexlet.code.General.NUMBERS_OF_ROUND;
import static hexlet.code.General.FROM_VALUE_NUMBER; //3
import static hexlet.code.General.TO_VALUE_NUMBER;
import static hexlet.code.General.pseudorandom;
import static hexlet.code.General.engineStart;

public class Prime {
    public static void startGame() {
        String condition = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] answersAndQuestions = new String[NUMBERS_OF_ROUND][2];
        /*
        {{Question, Answer}
        {Question, Answer}
        {Question, Answer}}
        */
        for (int i = 0; i < NUMBERS_OF_ROUND; i++) {
            int randomNumber = pseudorandom(FROM_VALUE_NUMBER, TO_VALUE_NUMBER);
            answersAndQuestions[i][0] = String.valueOf(randomNumber);
            if (isPrime(randomNumber)) {
                answersAndQuestions[i][1] = "yes";
            } else {
                answersAndQuestions[i][1] = "no";
            }
        }
        engineStart(condition, answersAndQuestions);
    }

    public static boolean isPrime(int number) {
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
