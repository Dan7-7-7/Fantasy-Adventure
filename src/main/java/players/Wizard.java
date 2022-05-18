package players;

import creatures.MythicalCreature;
import enums.SpellType;

public class Wizard extends Player {

    private SpellType spellType;
    private MythicalCreature mythicalCreature;

    public Wizard(String name, int strength, int healthPoints, SpellType spellType, MythicalCreature mythicalCreature) {
        super(name, strength, healthPoints);
        this.spellType = spellType;
        this.mythicalCreature = mythicalCreature;
    }

    public SpellType getSpellType() {
        return spellType;
    }

    public void setSpellType(SpellType spellType) {
        this.spellType = spellType;
    }

    public void castSpellOnPlayer(Player player){

    }

    public void useMythicalCreature(){

    }
}
