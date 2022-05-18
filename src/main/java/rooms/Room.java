package rooms;

import players.Player;
import players.Warrior;
import players.Wizard;

import java.util.ArrayList;

public abstract class Room {

    private ArrayList<Player> players;
    private Integer roomNumber;

    public Room(Integer roomNumber) {
        this.players = new ArrayList<>();
        this.roomNumber = roomNumber;
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public void removePlayer(Player player){
        players.remove(player);
    }

    public boolean playersPresent(){
        return players.size() > 1;
    }

    public int numberOfPlayers(){
        return players.size();
    }

    public void stageFight(){
        Player playerOne = players.get(0);
        Player playerTwo = players.get(1);
        double randomTurnDecider = Math.random();
        Player activePlayer = randomTurnDecider >= 0.5 ? playerOne : playerTwo;
        if(activePlayer instanceof Warrior){
            ((Warrior) activePlayer).attack();
        } else {
            ((Wizard) activePlayer).castSpell();
        }
        int playerOneStrength = playerOne.getStrength();
        int playerTwoStrength = playerTwo.getStrength();
        if (playerOneStrength > playerTwoStrength) {
            playerTwo.loseBattleRound();
        }
        else {
            playerOne.loseBattleRound();
        }
        playerOne.resetStrength();
        playerTwo.resetStrength();
        players.removeIf(player -> !player.isAlive());
        if(players.size() > 1){
            stageFight();
        }
//        include berserk, treasure etc
    }

    public void completeRoom(Player player){
        player.addCompletedRoom(roomNumber);
        if(player.completedFiveRooms()){
            player.completeGame();
        }
    }
}
