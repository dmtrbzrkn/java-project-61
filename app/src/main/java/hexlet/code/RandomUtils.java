package hexlet.code;


public class RandomUtils {
    public static int generatePsrNumber(int fromValue, int toValue) {
        return (int) (fromValue + Math.random() * toValue);
    }

    public static char generatePsrChar(char[] operations) {
        return operations[generatePsrNumber(0, operations.length - 1)];
    }
}
