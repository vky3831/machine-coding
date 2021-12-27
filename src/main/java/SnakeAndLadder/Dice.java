package SnakeAndLadder;

import lombok.*;

@ToString
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Dice {
    int numberOfDice;

    int rollDice(){
        return (int) ((Math.random()*6)+1)*numberOfDice;
    }
}
