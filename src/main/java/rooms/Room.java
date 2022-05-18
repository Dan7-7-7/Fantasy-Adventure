package rooms;

import players.Player;

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

    public void stageFight(){
//        first two players
//        check classes
//        get strengths
//        include berserk, treasure etc
//        determine winner
    }

    public void completeRoom(Player player){
        player.addCompletedRoom(roomNumber);
    }
}
