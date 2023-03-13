package SnakeAndLadder;

import lombok.*;

import java.util.Queue;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class GameBoard {

    Integer boardSize;
    Dice dice;
    Snakes snakes;
    Ladders ladders;
    Positions positions;
    Queue<Player> nextTurn;
    static Integer rank = 1;
    void start(){
        while(nextTurn.size() > 1){
            Player player = nextTurn.poll();
            Integer steps = dice.rollDice();
            System.out.println(player.getName() + " will go " + steps + " steps ahead");
            Integer currPos = positions.getPlayerPosition(player);
            Integer newPos = currPos + steps;
            if(newPos.equals(boardSize) ) won(player);
            else if(newPos > boardSize) nextTurn.offer(player);
            else if(ladders.isLadderPresent(newPos)) actionLadder(player, newPos);
            else if(snakes.isSnakePresent(newPos)) actionSnake(player, newPos);
            else {
                System.out.println(player.getName() + " moves to " + newPos);
                positions.updatePosition(player, newPos);
                nextTurn.offer(player);
            }
        }
    }
     void won(Player player){
         System.out.println(player.getName() + " secured " + this.rank + " position");
         positions.updatePosition(player, boardSize);
         this.rank++;
     }

     void actionLadder(Player player, Integer newPos){
        System.out.println(player.getName() + " moves to " + newPos);
        newPos = ladders.getTop(newPos);
        System.out.println(player.getName() + " gets ladder. Climbed to " + newPos);
        if(newPos == boardSize) {
            won(player);
            return;
        }
        positions.updatePosition(player, newPos);
        nextTurn.offer(player);
     }

    void actionSnake(Player player, Integer newPos){
        System.out.println(player.getName() + " moves to " + newPos);
        newPos = snakes.getTail(newPos);
        System.out.println(player.getName() + " bitten by snake. Fallen to " + newPos);

        positions.updatePosition(player, newPos);
        nextTurn.offer(player);
    }
}
