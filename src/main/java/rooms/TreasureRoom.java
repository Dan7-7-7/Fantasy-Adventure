package rooms;

public class TreasureRoom extends Room {
    public String treasure;

    public TreasureRoom(String treasure, int roomNumber) {
        super(roomNumber);
        this.treasure = treasure;
    }
}
