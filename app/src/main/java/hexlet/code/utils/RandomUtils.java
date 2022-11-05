package hexlet.code;


public class RandomUtils {
    public static int generateNumber(int minValue, int maxValue) {
        return (int) (minValue + Math.random() * maxValue);
    }
}
