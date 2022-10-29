package hexlet.code;

public class SearchGCD {
    public static int binaryGCD(int firstNumber, int secondNumber) {
        firstNumber = Math.abs(firstNumber);
        secondNumber = Math.abs(secondNumber);
        int factor = 1;
        for (;;) {
            if (firstNumber == secondNumber) {
                return factor * firstNumber;
            }
            if (firstNumber == 0) {
                return secondNumber * factor;
            }
            if (secondNumber == 0) {
                return firstNumber * factor;
            }
            if (firstNumber == 1 || secondNumber == 1) {
                return factor;
            }
            if (firstNumber % 2 == 0 && secondNumber % 2 == 0) {
                firstNumber = firstNumber / 2;
                secondNumber = secondNumber / 2;
                factor = factor * 2;
            } else if (firstNumber % 2 == 0 && secondNumber % 2 != 0) {
                firstNumber = firstNumber / 2;
            } else if (firstNumber % 2 != 0 && secondNumber % 2 == 0) {
                secondNumber = secondNumber / 2;
            } else if (firstNumber > secondNumber) {
                firstNumber = (firstNumber - secondNumber) / 2;
            } else {
                int temp = firstNumber;
                firstNumber = (secondNumber - firstNumber) / 2;
                secondNumber = temp;
            }

        }
    }
}
