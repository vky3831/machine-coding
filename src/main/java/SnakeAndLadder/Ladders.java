package SnakeAndLadder;

import java.util.HashMap;
import java.util.Map;

public class Ladders {

    Map<Integer, Integer> ladders = new HashMap<Integer, Integer>();
     boolean addLadder(int top, int bottom){
         if(top > bottom){
             ladders.put(bottom, top);
             System.out.println("Ladder added.");
             return true;
         }
         System.out.println("Ladder not added. TOP should be more than BOTTOM.");
         return false;
     }

     boolean isLadderPresent(int cell){
         return ladders.containsKey(cell);
     }

     Integer getTop(int bottom){
         if(isLadderPresent(bottom))
             return ladders.get(bottom);

         return null;
     }
}
