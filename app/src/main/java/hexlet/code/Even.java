package hexlet.code;

import java.util.Scanner;

public class Even {

    public static void startGame() {
        Scanner keyboardInput = new Scanner(System.in);

        int numberOfRounds = 3;
        int fromValueNumber = 1;
        int toValueNumber = 99;

        String[][] answersAndQuestions = new String[numberOfRounds][2];

        for (int i = 0; i < numberOfRounds; i++) {
            int currentNumber = pseudorandom(fromValueNumber, toValueNumber);

            answersAndQuestions[i][0] = String.valueOf(currentNumber);

            if (currentNumber % 2 == 0) {
                answersAndQuestions[i][1] = "yes";
            } else {
                answersAndQuestions[i][1] = "no";
            }
        }
        System.out.print("Welcome to the Brain Games!\n"
                + "May I have your name? ");
        String playerName = keyboardInput.next();
        System.out.printf("Hello, %s!\n", playerName);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int j = 0; j < numberOfRounds; j++) {
            String gameQuestion = answersAndQuestions[j][0];
            String gameAnswer = answersAndQuestions[j][1];

            System.out.printf("Question: %s\n", gameQuestion);
            System.out.print("Your answer: ");

            String playerAnswer = keyboardInput.next();

            if (playerAnswer.equals(gameAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", playerAnswer, gameAnswer);
                System.out.printf("Let's try again, %s\n", playerName);
                return;
            }
        }
        keyboardInput.close();
        System.out.printf("Congratulations, %s!\n", playerName);
    }

    public static int pseudorandom(int number1, int number2) {
        return (int) (number1 + Math.random() * number2);
    }
}
