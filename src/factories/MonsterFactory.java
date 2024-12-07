package factories;

import factory.Difficulty;
import factory.Monster;

public class MonsterFactory {
    public static Monster createMonster(Difficulty difficulty) {
        String name = "";
        int hp = 0;
        int defence = 0;
        int power = 0;

        switch (difficulty) {
            case EASY: 
                name = "Goblin";
                hp = 10; 
                defence = 10;
                power = 5;
                break;
            case MEDIUM:
                name = "Orc";
                hp = 15;
                defence = 15;
                power = 10;
                break;
            case HARD:
                name = "Dragon";
                hp = 20;
                defence = 20;
                power = 20;
                break;         
            default:
                throw new IllegalArgumentException("Unknown difficulty level: " + difficulty);
        }
        return new Monster(name, hp, defence, power, difficulty); 
    }

    public Monster generate(Difficulty difficulty) {
    }
}