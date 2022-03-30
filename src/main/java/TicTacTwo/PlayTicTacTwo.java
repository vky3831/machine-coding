package TicTacTwo;

import java.util.UUID;

public class PlayTicTacTwo {
    public static void main(String[] args) {
        Player p1 = Player.builder().id(UUID.randomUUID()).name("vky").symbol('x').build();
        Player p2 = Player.builder().id(UUID.randomUUID()).name("golu").symbol('o').build();
        Player[] players = new Player[] {p1, p2};

        GameBoard game = new GameBoard(3, players);
        game.start();
    }
}
