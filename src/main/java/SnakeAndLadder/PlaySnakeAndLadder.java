package SnakeAndLadder;

import java.lang.reflect.Array;
import java.util.*;

public class PlaySnakeAndLadder {
    public static void main(String[] args) {
        int boardSize = 100;
        Dice dice = new Dice(1);

        Player p1 = Player.builder().id("1").name("Red").build();
        Player p2 = Player.builder().id("2").name("Blue").build();
        Player p3 = Player.builder().id("3").name("Green").build();
        Player p4 = Player.builder().id("4").name("Yellow").build();

        Queue<Player> nextTurn = new LinkedList<Player>();
        nextTurn.offer(p1);
        nextTurn.offer(p2);
        nextTurn.offer(p3);
        nextTurn.offer(p4);

        List<Player> players = new ArrayList<Player>(Arrays.asList(p1, p2, p3, p4));
//        List<Player> players = new ArrayList<Player>(Arrays.asList(p1, p2));
        Positions positions = new Positions(players);

        Snakes snakes = new Snakes();
        snakes.addSnake(17, 7);
        snakes.addSnake(62, 19);
        snakes.addSnake(87, 36);
        snakes.addSnake(54, 34);
        snakes.addSnake(64, 60);
        snakes.addSnake(93, 73);
        snakes.addSnake(95, 75);
        snakes.addSnake(98, 79);

        Ladders ladders = new Ladders();
        ladders.addLadder(38, 1);
        ladders.addLadder(14, 4);
        ladders.addLadder(31, 9);
        ladders.addLadder(84, 28);
        ladders.addLadder(42, 21);
        ladders.addLadder(67, 51);
        ladders.addLadder(91, 72);
        ladders.addLadder(99, 80);

        GameBoard gameBoard = GameBoard.builder()
                .boardSize(boardSize)
                .dice(dice)
                .ladders(ladders)
                .nextTurn(nextTurn)
                .positions(positions)
                .snakes(snakes)
                .build();

        gameBoard.start();

    }
}
