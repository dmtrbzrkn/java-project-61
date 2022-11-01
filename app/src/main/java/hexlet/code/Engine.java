package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBERS_OF_ROUND = 3;
    public static final int FROM_VALUE_NUMBER = 1;
    public static final int TO_VALUE_NUMBER = 99;


    public static void runGame(String task, String[][] answersAndQuestions) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\n"
                + "May I have your name? ");
        String playerName = keyboardInput.next();
        System.out.printf("Hello, %s!\n", playerName);
        System.out.println(task);

        for (int j = 0; j < NUMBERS_OF_ROUND; j++) {
            String gameQuestion = answersAndQuestions[j][0];
            String gameAnswer = answersAndQuestions[j][1];

            System.out.printf("Question: %s\n", gameQuestion);
            System.out.print("Your answer: ");

            String playerAnswer = keyboardInput.next();

            if (playerAnswer.equals(gameAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", playerAnswer, gameAnswer);
                System.out.printf("Let's try again, %s!\n", playerName);
                return;
            }
        }
        keyboardInput.close();
        System.out.printf("Congratulations, %s!\n", playerName);
    }
}
