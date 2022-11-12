package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBERS_OF_ROUND = 3;
    public static final int FROM_VALUE_NUMBER = 1;
    public static final int TO_VALUE_NUMBER = 99;
    public static final String GREETING = "Welcome to the Brain Games!\nMay I have your name? ";
    public static final String HELLO = "Hello, %s!\n";
    public static final String QUESTION = "Question: %s\n";
    public static final String ANSWER = "Your answer: ";
    public static final String RIGHT = "Correct!";
    public static final String WRONG = "'%s' is wrong answer ;(. Correct answer was '%s'.\n";
    public static final String TRY_AGAIN = "Let's try again, %s!\n";
    public static final String CONGRATULATION = "Congratulations, %s!\n";

    public static void runGame(String task, String[][] answersAndQuestions) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print(GREETING);
        String playerName = keyboardInput.next();
        System.out.printf(HELLO, playerName);
        System.out.println(task);

        for (int j = 0; j < NUMBERS_OF_ROUND; j++) {
            String gameQuestion = answersAndQuestions[j][0];
            String gameAnswer = answersAndQuestions[j][1];

            System.out.printf(QUESTION, gameQuestion);
            System.out.print(ANSWER);

            String playerAnswer = keyboardInput.next();

            if (playerAnswer.equals(gameAnswer)) {
                System.out.println(RIGHT);
            } else {
                System.out.printf(WRONG, playerAnswer, gameAnswer);
                System.out.printf(TRY_AGAIN, playerName);
                return;
            }
        }
        keyboardInput.close();
        System.out.printf(CONGRATULATION, playerName);
    }
}
