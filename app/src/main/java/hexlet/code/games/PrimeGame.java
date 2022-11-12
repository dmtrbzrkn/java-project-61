package hexlet.code.games;

import hexlet.code.utils.PrimeOrEven;

import static hexlet.code.Engine.runGame;

public class PrimeGame {
    public static final String TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final String NAME_OF_GAME = "PrimeGame";

    public static void startPrimeGame() {
        runGame(TASK, PrimeOrEven.runOneOfGame(NAME_OF_GAME));
    }
}
