package players;

import enums.WeaponType;

public class Warrior extends Player {

    private WeaponType weaponType;

    public Warrior(String name, int strength, int defaultStrength, int healthPoints, WeaponType weaponType) {
        super(name, strength, defaultStrength, healthPoints);
        this.weaponType = weaponType;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public void attack(){
        setStrength(getStrength() + weaponType.getValue());
    }
}
