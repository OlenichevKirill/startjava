package com.startjava.lesson_4.game;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class GuessNumber {
	private int compNumber;
	private Player playerOne;
	private Player playerTwo;
	private int counterOne;
	private int counterTwo;
	public GuessNumber(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}

	public void startGame() {
		Random random = new Random();
		compNumber = random.nextInt(101);
		System.out.println("У вас 10 попыток");
		counterOne = 0;
		counterTwo = 0;
		zeroingArray(playerOne);
		zeroingArray(playerTwo);

		do {
			enterNumber(playerOne);
			counterOne++;
			if(checkNumber(playerOne, playerOne.getName(), playerOne.getNumber(), counterOne)) {
				break;
			}

			enterNumber(playerTwo);
			counterTwo++;
			if(checkNumber(playerTwo, playerTwo.getName(), playerTwo.getNumber(), counterTwo)) {
				break;
			}

			if(counterOne == 10 && counterTwo == 10) {
				break;
			}
		} while(true);
		bringOutArray(playerOne,counterOne);
		bringOutArray(playerTwo,counterTwo);
	}

	private void zeroingArray(Player player) {
		Arrays.copyOf(player.getArray(),10);
		Arrays.fill(player.getArray(),0);
	}

	private void enterNumber(Player player) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Игрок " + player.getName() + " вводит число: ");
		player.setNumber(scan.nextInt());
	}

	private boolean checkNumber(Player player, String name, int number, int counter) {
		if((compNumber < number && counter <= 10) || (compNumber > number && counter <= 10)) {
			if(compNumber < number && counter < 10) {
				System.out.println("Число больше загаданного компьютером.");
				player.setArray(counter-1, number);
			} else if(compNumber > number && counter < 10) {
				System.out.println("Число меньше загаданного компьютером.");
				player.setArray(counter-1, number);
			} else {
				System.out.println("У " + name + " закончились попытки");
				player.setArray(counter-1, number);
			}
			return false;
		} else {
			System.out.println("Число угадано.");
			player.setArray(counter-1, number);
			System.out.println("Игрок " + name + " угадал число " + number + " с " + counter + " попытки");
			return true;
		}
	}

	private void bringOutArray(Player player, int counter) {
		System.out.print("Введенные игроком " + player.getName() +" числа: ");
		for (int res: Arrays.copyOf(player.getArray(), counter)) {
			System.out.print(res + " ");
		}
		System.out.println("");
	}
}