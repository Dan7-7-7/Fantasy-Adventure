package players;

import enums.HealingType;

public class Cleric extends Player {

    private HealingType healingType;

    public Cleric(String name, int strength, int defaultStrength, int healthPoints, HealingType healingType) {
        super(name, strength, 10, healthPoints);
        this.healingType = healingType;
    }

    public HealingType getHealingType() {
        return healingType;
    }

    public void setHealingType(HealingType healingType) {
        this.healingType = healingType;
    }

    public void heal(Player player){
//        heals with strength + healingtype value
    }
}
