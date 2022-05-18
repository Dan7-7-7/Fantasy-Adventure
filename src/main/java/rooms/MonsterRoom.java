package rooms;

import creatures.Monster;
import players.Player;

public class MonsterRoom extends Room {
    private Monster monster;

    public MonsterRoom(Integer roomNumber, Monster monster) {
        super(roomNumber);
        this.monster = monster;
    }

    public void stageFightWithMonster(Player player){

    }
}
