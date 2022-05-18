package players.warriors;

import enums.WeaponType;
import players.Warrior;

public class Barbarian extends Warrior {

    public Barbarian(String name, int strength, int defaultStrength, int healthPoints, WeaponType weaponType) {
        super(name, strength, 12, healthPoints, weaponType);
    }

    public void berserk(){
        setStrength(getStrength() * 2);
        setHealthPoints(getHealthPoints() / 2);
    }
}
