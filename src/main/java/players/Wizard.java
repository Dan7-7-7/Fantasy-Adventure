package players;

import creatures.MythicalCreature;
import enums.SpellType;

public class Wizard extends Player {

    private SpellType spellType;
    private MythicalCreature mythicalCreature;

    public Wizard(String name, int strength, int defaultStrength, int healthPoints, SpellType spellType, MythicalCreature mythicalCreature) {
        super(name, strength, 9, healthPoints);
        this.spellType = spellType;
        this.mythicalCreature = mythicalCreature;
    }

    public SpellType getSpellType() {
        return spellType;
    }

    public void setSpellType(SpellType spellType) {
        this.spellType = spellType;
    }

    public void castSpell(){
        setStrength(getStrength() + spellType.getValue());
    }

    public void useMythicalCreature(){

    }
}
