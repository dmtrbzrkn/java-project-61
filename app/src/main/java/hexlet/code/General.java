package hexlet.code;

import java.util.Scanner;

public class General {
    public static final int NUMBER_OF_ROUNDS = 3;

    public static void gameEngine(String description, String[][] answers) {
        int indexOfQuestion = 0;
        int indexOfAnswer = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String playerName = input.next();
        System.out.println("Hello,  " + playerName + "!");

        System.out.println(description);

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            String question = answers[i][indexOfQuestion];
            System.out.print("Question: ");
            System.out.println(question);

            System.out.print("Your answer: ");
            String playerAnswer = input.next();

            if (playerAnswer.equals(answers[i][indexOfAnswer])) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'\n.",
                        playerAnswer,
                        answers[i][indexOfAnswer]);
                System.out.println("Let's try again, " + playerName);
                return;
            }
        }
        input.close();
        System.out.println("Congratulations, " + playerName + "!");
    }
}
