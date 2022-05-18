package players.warriors;

import enums.WeaponType;
import players.Warrior;

public class Knight extends Warrior {

    private int armourValue;

    public Knight(String name, int strength, int healthPoints, WeaponType weaponType, int armourValue) {
        super(name, strength + armourValue, healthPoints, weaponType);
        this.armourValue = armourValue;
    }

}
