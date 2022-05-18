import enums.WeaponType;
import org.junit.Before;
import org.junit.Test;
import players.warriors.Barbarian;
import players.warriors.Dwarf;
import players.warriors.Knight;
import rooms.Room;
import rooms.TreasureRoom;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    public Room room;
    public Barbarian barbarian;
    public Dwarf dwarf;
    public Knight knight;

    @Before
    public void before() {
        room = new TreasureRoom("Diamonds", 2);
        barbarian = new Barbarian("John", 12, 12, 20, WeaponType.CLUB);
        dwarf = new Dwarf("Gimli", 11, 11, 20, WeaponType.AXE, 5);
        knight = new Knight("Brienne", 13, 13, 21, WeaponType.SWORD);
    }

    @Test
    public void canStageBattle(){
        room.addPlayer(barbarian);
        room.addPlayer(dwarf);
        room.addPlayer(knight);
        room.stageFight();
        assertEquals(false, room.playersPresent());
        assertEquals(1, room.numberOfPlayers());
    }
}
