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
        int roll = 0;
        for(int i=0; i<numberOfDice; i++){
            roll += (int) ((Math.random()*6)+1);
        }
        return roll;
    }
}
