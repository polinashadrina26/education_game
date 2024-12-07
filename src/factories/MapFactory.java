package factories;

import room.Room;
import factory.Difficulty;

import java.util.ArrayList;
import java.util.List;

public class RoomFactory extends AbstractFactory<Room> {
	public Room createRoom(Difficulty difficulty) {
		Room room = new Room();
		List<Monster> monsters = new ArrayList<>();
	}

	public List<Room> generateMap(Difficulty mapDifficulty) {
		 List<Room> rooms = new ArrayList<>();
		 RoomFactory roomFactory = new RoomFactory();

	        switch (mapDifficulty) {
	            case EASY:
	                for (int i = 1; i <= 5; i++) {
	                    rooms.add(roomFactory.createRoom(Difficulty.EASY));
	                }
	                break;
	            case MEDIUM:
	                for (int i = 1; i <= 10; i++) rooms.add(roomFactory.createRoom(Difficulty.MEDIUM));
	                break;
	            case HARD:
	                for (int i = 1; i <= 15; i++) {
	                    rooms.add(roomFactory.createRoom(Difficulty.HARD));
	                }
	                break;
	            default:
	                throw new IllegalArgumentException("Неизвестная сложность: " + mapDifficulty);
	        }

	        return rooms;
	    }

	    public static void main(String[] args) {
	        MapFactory mapFactory = new MapFactory();
	        

	        List<Room> easyMap = mapFactory.generateMap(Difficulty.EASY);
	        System.out.println("Легкая карта: " + easyMap);
	        

	        List<Room> mediumMap = mapFactory.generateMap(Difficulty.MEDIUM);
	        System.out.println("Средняя карта: " + mediumMap);
	        

	        List<Room> hardMap = mapFactory.generateMap(Difficulty.HARD);
	        System.out.println("Трудная карта: " + hardMap);
	    }
		
	}


