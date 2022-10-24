package hexlet.code;


public class Even {
    private static final int FROM_VALUE_NUMBER = 1;
    private static final int TO_VALUE_NUMBER = 99;

    public static void startEven() {
        int indexOfQuestion = 0;
        int indexOfAnswer = 1;

        String[][] correctAnswers = new String[General.NUMBER_OF_ROUNDS][indexOfAnswer + 1];

        for (int i = 0; i < General.NUMBER_OF_ROUNDS; i++) {

            int unfundedNumber = numberGenerator(FROM_VALUE_NUMBER, TO_VALUE_NUMBER);

            correctAnswers[i][indexOfQuestion] = Integer.toString(unfundedNumber);

            if (unfundedNumber % 2 == 0) {
                correctAnswers[i][indexOfAnswer] = "yes";
            } else {
                correctAnswers[i][indexOfAnswer] = "no";
            }
        }
        General.gameEngine("Answer 'yes' if the number is even, otherwise answer 'no'.",
                correctAnswers);
    }

    public static int numberGenerator(int fromValue, int toValue) {
        return (int) (fromValue + (Math.random() * toValue));
    }
}
