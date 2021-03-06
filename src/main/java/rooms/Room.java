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

    public ArrayList<Player> getPlayers() {
        return players;
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

    public String getPlayer(){
        return players.get(0).getName();
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

    public String completeRoom(Player player){
        player.addCompletedRoom(roomNumber);
        String message = String.format("Congratulations %s, you have completed room %s!", player.getName(), roomNumber);
        System.out.println(message);
        if(player.completedFiveRooms()){
            player.completeGame();
        }
        return message;
    }
}
