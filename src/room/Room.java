package room;

import factory.Difficulty;
import factory.Monster;

import java.util.ArrayList;
import java.util.List;

public class Room {
    List<Monster> monsters; //
	private String description;
	private Difficulty difficulty;

    public Room(Difficulty difficulty) {
        this.difficulty = difficulty;
        this.monsters = new ArrayList<>(); //
    }



public Room(String string) {
		// TODO Auto-generated constructor stub
	}



public void setDifficulty(int roomDifficulty) {
  
 }

 public void setMonsters(List<Monster> monsters2) {
  
 }

 public void addMonster(Monster monster) {
  Monster.add(monster);
 }
 
 @Override
 public String toString() {
     StringBuilder monstersStringBuilder = new StringBuilder();
     for (Monster monster : monsters) {
         monstersStringBuilder
             .append(monster.toString())
             .append("\n");
     }

     return "Комната {" +
            "Описание: " + description + "n" +
            "Сложность: " + difficulty + "n" +
            "Монстры: " + monstersStringBuilder +
            '}';
 }

    public void setDescription(String комнатаСЛегкойСложностью) {
    }
}