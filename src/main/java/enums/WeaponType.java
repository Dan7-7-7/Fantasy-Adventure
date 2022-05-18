package enums;

public enum WeaponType {
    SWORD(3),
    AXE(2),
    CLUB(1),
    KNIFE(1),
    CROSSBOW(3);

    private final int value;

    WeaponType(int value) {
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
