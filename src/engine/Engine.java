package engine;

import factory.Monster;
import factory.Player;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Engine {
	private Scanner scanner = new Scanner(System.in);
	private Random random = new Random();
	private List<String> map;

	public void play() {
		int currentRoomIndex = 0;
		while (currentRoomIndex < map.size()) {
			System.out.println(map.get(currentRoomIndex));
			currentRoomIndex++;
		}
	}

	public boolean fight(Player player, Monster monster) {
		while (player.getHp() > 0 && monster.getHp() > 0) {
			System.out.println("Выберите действие (1 - атака, 2 - защита):");
			int action = scanner.nextInt();
			int monsterAction = random.nextInt(2); // 0 - атака, 1 - защита

			switch (action) {
				case 1: // Атака
					if (monsterAction == 0) { // Монстр атакует
						monster.setHp(monster.getHp() - player.getPower());
						player.setHp(player.getHp() - monster.getPower());
						System.out.println("Вы атаковали монстра! HP монстра: " + monster.getHp());
						System.out.println("Монстр атаковал вас! Ваши HP: " + player.getHp());
					} else { // Монстр защищается
						int damage = player.getPower() - monster.getDefence();
						if (damage > 0) {
							monster.setHp(monster.getHp() - damage);
							System.out.println("Вы атаковали монстра! HP монстра: " + monster.getHp());
						} else {
							System.out.println("Атака монстра была полностью заблокирована!");
						}
					}
					break;

				case 2: // Защита
					if (monsterAction == 0) { // Монстр атакует
						int damage = monster.getPower() - player.getDefence();
						if (damage > 0) {
							player.setHp(player.getHp() - damage);
							System.out.println("Вы приняли защитную стойку! Ваши HP: " + player.getHp());
						} else {
							System.out.println("Ваши защиты хватило, чтобы полностью заблокировать атаку!");
						}
					} else { // Монстр защищается
						System.out.println("Монстр принял защитную стойку.");
					}
					break;

				default:
					System.out.println("Неизвестное действие, пожалуйста, выберите другое действие: 1 - атака, 2 - защита.");
			}

			// Проверяем здоровье после каждого действия
			if (monster.getHp() <= 0) {
				System.out.println("Вы победили монстра!");
				return true; // Игрок победил
			}
			if (player.getHp() <= 0) {
				System.out.println("Вы погибли!");
				return false; // Игрок проиграл
			}
		}
		return false; // Этот код не должен быть достигнут
	}
}


