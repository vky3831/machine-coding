package SnakeAndLadder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Positions {
    Map<String, Integer> positions = new HashMap<String, Integer>();

    Positions(List<Player> playerList){
        for(Player player : playerList){
            positions.put(player.getName(), 0);
        }
    }

    boolean isPlayerPresent(Player player){
        return positions.containsKey(player.getName());
    }

    Integer getPlayerPosition(Player player){
        if(isPlayerPresent(player))
            return positions.get(player.getName());
        return null;
    }

    public void updatePosition(Player player, Integer newPos) {
        positions.put(player.getName(), newPos);
    }
}
