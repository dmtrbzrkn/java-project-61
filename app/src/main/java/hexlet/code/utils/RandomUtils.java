package hexlet.code.utils;


public class RandomUtils {
    public static int generateNumber(int minValue, int maxValue) {
        return (int) (minValue + Math.random() * maxValue);
    }
}
