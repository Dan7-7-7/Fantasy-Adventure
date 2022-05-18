package creatures;

public class Creature {
    private String name;
    private int Strength;
    private String species;

    public Creature(String name, int strength, String species) {
        this.name = name;
        Strength = strength;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return Strength;
    }

    public String getSpecies() {
        return species;
    }
}
