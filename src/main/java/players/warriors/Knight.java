package players.warriors;

import enums.WeaponType;
import players.Warrior;

public class Knight extends Warrior {

    public Knight(String name, int strength, int defaultStrength, int healthPoints, WeaponType weaponType) {
        super(name, strength, 10, healthPoints, weaponType);
    }

    public void loseBattleRound(){
        this.setHealthPoints(this.getHealthPoints() - 3);
    }

}
