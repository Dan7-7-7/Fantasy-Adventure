package enums;

public enum HealingType {

    HERBS(5),
    POTION(10),
    PRAYER(2);

    private final int value;

    HealingType(int value) {
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
