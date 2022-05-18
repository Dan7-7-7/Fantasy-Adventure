package players;

import rooms.Room;

import java.util.ArrayList;

public abstract class Player {

    private String name;
    private int strength;
    private int healthPoints;
    private ArrayList<Integer> completedRooms;
    private int defaultStrength;

    public Player(String name, int strength, int defaultStrength, int healthPoints) {
        this.name = name;
        this.strength = strength;
        this.defaultStrength = defaultStrength;
        this.healthPoints = healthPoints;
        this.completedRooms = new ArrayList<>();
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void resetStrength(){
        strength = defaultStrength;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void loseBattleRound() {
        this.healthPoints -= 5;
    }

    public boolean isAlive(){
        return healthPoints > 0;
    }

    public void addCompletedRoom(Integer number){
        completedRooms.add(number);
    }

    public boolean completedFiveRooms(){
        return completedRooms.size() >= 5;
    }

    public String completeGame(){
        return "You won!";
    }

    public String getName() {
        return name;
    }
}
