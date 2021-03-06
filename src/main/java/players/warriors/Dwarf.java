package players.warriors;

import enums.WeaponType;
import players.Warrior;

public class Dwarf extends Warrior {
    private int treasureValue;

    public Dwarf(String name, int strength, int defaultStrength, int healthPoints, WeaponType weaponType, int treasureValue) {
        super(name, strength, 8, healthPoints, weaponType);
        this.treasureValue = treasureValue;
    }

    public void exchangeTreasure(){
        this.setStrength(this.getStrength() + treasureValue / 2);
        treasureValue = treasureValue / 2;
    }
}
