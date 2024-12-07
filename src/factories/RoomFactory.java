package factories;


import factory.Difficulty;
import factory.Monster;
import room.Room;

import java.util.ArrayList;
import java.util.List;

import static factory.Difficulty.EASY;

public class RoomFactory {


    public Room createRoom(Difficulty difficulty) {
        Room room = new Room(difficulty);
        for (int i = 0; i < difficulty.getIntValue(); i++) {
            room.addMonster(MonsterFactory.createMonster(difficulty));
        }
class RoomFactory extends AbstractFactory<Room> {
            @Override
    public Room generate(Difficulty difficulty) {
                Room room = new room();
                List<Monster> monsters = new ArrayList<>();
                MonsterFactory monsterFactory = new MonsterFactory();
                switch (difficulty) {
                    case EASY:
room.setDescription("Комната с легкой сложностью");
monsters.add(monsterFactory.generate(EASY));
break;
                    case MEDIUM:
                        room.setDescription("Комната со средней сложностью");
                        monsters.add(monsterFactory.generate(EASY));
                        monsters.add(monsterFactory.generate(EASY));
                       break;
                    case HARD:
                        room.setDescription("Комната со  сложностью");
                        monsters.add(monsterFactory.generate(EASY));
                        monsters.add(monsterFactory.generate(EASY));
                        monsters.add(monsterFactory.generate(EASY));
                        break;
                }
                return room;
            }
}


        return room;
    }
}