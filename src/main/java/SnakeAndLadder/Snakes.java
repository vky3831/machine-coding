package SnakeAndLadder;

import java.util.HashMap;
import java.util.Map;


public class Snakes {
    Map<Integer, Integer> snakes = new HashMap<Integer, Integer>();
    boolean addSnake(int head, int tail){
        if(head > tail){
            snakes.put(head, tail);
            System.out.println("Snake added.");
            return true;
        }
        System.out.println("Snake not added. HEAD should be more than TAIL.");
        return false;
    }

    boolean isSnakePresent(int cell){
        return snakes.containsKey(cell);
    }

    Integer getTail(Integer head){
        if(isSnakePresent(head))
            return snakes.get(head);

        return  null;
    }

}
