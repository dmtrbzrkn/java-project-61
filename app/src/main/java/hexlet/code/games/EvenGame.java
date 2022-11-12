package hexlet.code.games;

import hexlet.code.utils.PrimeOrEven;

import static hexlet.code.Engine.runGame;

public class EvenGame {
    public static final String TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static final String NAME_OF_GAME = "EvenGame";

    public static void startEvenGame() {
        runGame(TASK, PrimeOrEven.runOneOfGame(NAME_OF_GAME));
    }
}
