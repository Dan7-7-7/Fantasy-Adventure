package rooms;

import creatures.Monster;
import players.Player;
import players.Wizard;
import players.warriors.Barbarian;
import players.warriors.Dwarf;
import players.warriors.Knight;

public class MonsterRoom extends Room {
    private Monster monster;

    public MonsterRoom(Integer roomNumber, Monster monster) {
        super(roomNumber);
        this.monster = monster;
    }

    public void stageFightWithMonster(){
        Player player = getPlayers().get(0);
        int monsterStrength = monster.getStrength();
        int playerStrength = player.getStrength();
        double randomiser = Math.random();
        if(randomiser >= 0.5) {
            if (player instanceof Barbarian) {
                ((Barbarian) player).berserk();
            } else if(player instanceof Wizard){
                ((Wizard) player).castSpell();
            } else if(player instanceof Dwarf){
                ((Dwarf) player).exchangeTreasure();
            } else if(player instanceof Knight){
                ((Knight) player).attack();
            }
        }
        if(playerStrength >= monsterStrength){
            monster.loseBattleRound();
        } else player.loseBattleRound();

        if(!player.isAlive()){
            removePlayer(player);
        } else if(!monster.isAlive()){
            player.resetStrength();
            completeRoom(player);
        } else {
            player.resetStrength();
            stageFightWithMonster();
        }
    }
}
