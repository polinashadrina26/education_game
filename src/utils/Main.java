package utils;


import factories.MapFactory;
import factories.PlayerFactory;
import factory.Difficulty;
import factory.Player;
import room.Room;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static Player player;

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        greeting();
        setPlayer(createPlayer(scanner));
        List<Room> map = createMap(scanner);

        System.out.println(map);
        // Engine engine = new Engine(player, map);
        // engine.play();
        
        scanner.close(); 
    }

    private static void greeting() {
        System.out.println("""
            Хеллоу, новый игрок!""");
    }

    private static Player createPlayer(Scanner scanner) {
        System.out.println("Введите имя игрока:");
        String playerName = scanner.nextLine();
        return new PlayerFactory(playerName).getPlayer(playerName);
    }

    private static List<Room> createMap(Scanner scanner) {
        System.out.println("Выберите уровень сложности (1 - Легко, 2 - Средне, 3 - Сложно):"); 
        int difficultyInt = scanner.nextInt();
        Difficulty mapDifficulty = Difficulty.fromInt(difficultyInt);
        return new MapFactory().generateMap(mapDifficulty);
    }

	public static Player getPlayer() {
		return player;
	}

	public static void setPlayer(Player player) {
		Main.player = player;
	}
}