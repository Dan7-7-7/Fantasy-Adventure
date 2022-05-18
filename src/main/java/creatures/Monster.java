package creatures;

public class Monster extends Creature {
    private int healthPoints;

    public Monster(String name, int strength, String species, int healthPoints) {
        super(name, strength, species);
        this.healthPoints = healthPoints;
    }
}
