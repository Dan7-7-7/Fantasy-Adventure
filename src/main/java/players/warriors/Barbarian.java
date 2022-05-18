package players.warriors;

import enums.WeaponType;
import players.Warrior;

public class Barbarian extends Warrior {

    public Barbarian(String name, int strength, int healthPoints, WeaponType weaponType) {
        super(name, strength, healthPoints, weaponType);
    }

    public void berserk(){
//        temporarily increase strength and lose health points
    }
}
