import creatures.Monster;
import creatures.MythicalCreature;
import enums.SpellType;
import enums.WeaponType;
import org.junit.Before;
import org.junit.Test;
import players.Wizard;
import players.warriors.Barbarian;
import players.warriors.Dwarf;
import players.warriors.Knight;
import rooms.MonsterRoom;
import rooms.Room;
import rooms.TreasureRoom;

import static org.junit.Assert.*;

public class RoomTest {

    public Room room;
    public Barbarian barbarian;
    public Dwarf dwarf;
    public Knight knight;
    public MythicalCreature mythicalCreature;
    public Wizard wizard;

    @Before
    public void before() {
        room = new TreasureRoom("Diamonds", 2);
        barbarian = new Barbarian("John", 12, 12, 20, WeaponType.CLUB);
        dwarf = new Dwarf("Gimli", 11, 11, 20, WeaponType.AXE, 5);
        knight = new Knight("Brienne", 13, 13, 21, WeaponType.SWORD);
        mythicalCreature = new MythicalCreature("Grif", 22, "Griffin");
        wizard = new Wizard("Gandalf", 12, 12, 18, SpellType.LIGHTNINGSTRIKE, mythicalCreature);
    }

    @Test
    public void canStageBattle(){
        room.addPlayer(barbarian);
        room.addPlayer(dwarf);
        room.addPlayer(knight);
        room.addPlayer(wizard);
        room.stageFight();
        assertEquals(false, room.playersPresent());
        assertEquals(1, room.numberOfPlayers());
        System.out.println(room.getPlayer());
    }

    @Test
    public void canCompleteRoom(){
        room.addPlayer(knight);
        String output = room.completeRoom(knight);
        assertEquals("Congratulations Brienne, you have completed room 2!", output);
    }

    @Test
    public void canFightMonster(){
        Monster monster = new Monster("Bob", 14, "dragon", 23);
        MonsterRoom monsterRoom = new MonsterRoom(3, monster);
        monsterRoom.addPlayer(barbarian);
        monsterRoom.stageFightWithMonster();
        assertTrue(barbarian.isAlive() ^ monster.isAlive());
//        assertTrue(barbarian.isAlive() || monster.isAlive());
//        assertFalse(barbarian.isAlive() && monster.isAlive());

    }
}
