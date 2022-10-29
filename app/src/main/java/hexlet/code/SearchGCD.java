package hexlet.code;

public class SearchGCD {
    public static int binaryGCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        int factor = 1;
        for (;;) {
            if (a == b) {
                return factor * a;
            }
            if (a == 0) {
                return b * factor;
            }
            if (b == 0) {
                return a * factor;
            }
            if (a == 1 || b == 1) {
                return factor;
            }
            if (a % 2 == 0 && b % 2 == 0) {
                a = a / 2;
                b = b / 2;
                factor = factor * 2;
            } else if (a % 2 == 0 && b % 2 != 0) {
                a = a / 2;
            } else if (a % 2 != 0 && b % 2 == 0) {
                b = b / 2;
            } else if (a > b) {
                a = (a - b) / 2;
            } else {
                int temp = a;
                a = (b - a) / 2;
                b = temp;
            }

        }
    }
}
