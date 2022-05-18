package players;

import rooms.Room;

import java.util.ArrayList;

public class Player {

    private String name;
    private int strength;
    private int healthPoints;
    private ArrayList<Integer> completedRooms;

    public Player(String name, int strength, int healthPoints) {
        this.name = name;
        this.strength = strength;
        this.healthPoints = healthPoints;
        this.completedRooms = new ArrayList<>();
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void addCompletedRoom(Integer number){
        completedRooms.add(number);
    }
}
