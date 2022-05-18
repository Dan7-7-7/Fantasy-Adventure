package enums;

public enum SpellType {
    STUN(3),
    FIREBALL(4),
    LIGHTNINGSTRIKE(4),
    DISAPPEARANCE(3),
    FEARSPELL(2);

    private final int value;

    SpellType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
