package com.startjava.lesson_4.game;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class GuessNumber {
	private int compNumber;
	private Player playerOne;
	private Player playerTwo;

	public GuessNumber(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}

	public void startGame() {
		Random random = new Random();
		compNumber = random.nextInt(101);
		System.out.println("У вас 10 попыток");
		playerOne.zeroingCouter();
		playerTwo.zeroingCouter();
		zeroingArray(playerOne);
		zeroingArray(playerTwo);

		do {
			enterNumber(playerOne);
			if(checkNumber(playerOne)) {
				break;
			}

			enterNumber(playerTwo);
			if(checkNumber(playerTwo)) {
				break;
			}
		} while(playerOne.getCouter() < 10 && playerTwo.getCouter() < 10);
		showEnteredNums(playerOne);
		showEnteredNums(playerTwo);
	}

	private void zeroingArray(Player player) {
		Arrays.copyOf(player.getEnteredNums(),10);
		Arrays.fill(player.getEnteredNums(),0);
	}

	private void enterNumber(Player player) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Игрок " + player.getName() + " вводит число: ");
		player.setNumber(scan.nextInt());
		player.setCouter();
		player.setEnteredNums(player.getCouter() - 1, player.getNumber());
	}

	private boolean checkNumber(Player player) {
		if((compNumber < player.getNumber() && player.getCouter() <= 10) || (compNumber > player.getNumber() && player.getCouter() <= 10)) {
			if(compNumber < player.getNumber() && player.getCouter() < 10) {
				System.out.println("Число больше загаданного компьютером.");
			} else if(compNumber > player.getNumber() && player.getCouter() < 10) {
				System.out.println("Число меньше загаданного компьютером.");
			} else {
				System.out.println("У " + player.getName() + " закончились попытки");
			}
			return false;
		} else {
			System.out.println("Число угадано.");
			System.out.println("Игрок " + player.getName() + " угадал число " + player.getNumber() + " с " + player.getCouter() + " попытки");
			return true;
		}
	}

	private void showEnteredNums(Player player) {
		System.out.print("Введенные игроком " + player.getName() +" числа: ");
		for (int res: Arrays.copyOf(player.getEnteredNums(), player.getCouter())) {
			System.out.print(res + " ");
		}
		System.out.println("");
	}
}