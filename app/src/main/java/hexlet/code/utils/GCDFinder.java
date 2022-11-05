package hexlet.code.utils;

public class GCDFinder {
    public static int findGCD(int firstNumber, int secondNumber) {
        firstNumber = Math.abs(firstNumber);
        secondNumber = Math.abs(secondNumber);
        if (secondNumber > firstNumber) {
            int temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }
        int r = firstNumber % secondNumber;
        while (r != 0) {
            firstNumber = secondNumber;
            secondNumber = r;
            r = firstNumber % secondNumber;
        }
        return secondNumber;
    }
}
