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
		clearEnteredNums(playerOne);
		clearEnteredNums(playerTwo);
		playerOne.zeroingAttempt();
		playerTwo.zeroingAttempt();

		do {
			enterNumber(playerOne);
			if(checkNumber(playerOne)) {
				break;
			}
			checkAttempt(playerOne);

			enterNumber(playerTwo);
			if(checkNumber(playerTwo)) {
				break;
			}
			checkAttempt(playerTwo);
		} while(playerOne.getAttempt() < 10 && playerTwo.getAttempt() < 10);
		showEnteredNums(playerOne);
		showEnteredNums(playerTwo);
	}

	private void clearEnteredNums(Player player) {
		if(player.getAttempt() > 0) {
			Arrays.fill(player.getEnteredNums(), 0, player.getAttempt() ,0);
		}
	}

	private void enterNumber(Player player) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Игрок " + player.getName() + " вводит число: ");
		player.setEnteredNum(player.getAttempt() , scan.nextInt());
		player.setAttempt();
	}

	private boolean checkNumber(Player player) {
		if (compNumber < player.getEnteredNum(player.getAttempt() - 1) || compNumber > player.getEnteredNum(player.getAttempt() - 1)) {
			if (compNumber < player.getEnteredNum(player.getAttempt() - 1)) {
				System.out.println("Число больше загаданного компьютером.");
			} else if (compNumber > player.getEnteredNum(player.getAttempt() - 1)) {
				System.out.println("Число меньше загаданного компьютером.");
			}
			return false;
		} else {
			System.out.println("Число угадано.");
			System.out.println("Игрок " + player.getName() + " угадал число " + player.getEnteredNum(player.getAttempt() - 1) + " с " + player.getAttempt() + " попытки");
			return true;
		}
	}

	private void checkAttempt(Player player) {
		if(player.getAttempt() == 10) {
			System.out.println("У " + player.getName() + " закончились попытки");
		}
	}

	private void showEnteredNums(Player player) {
		System.out.print("Введенные игроком " + player.getName() +" числа: ");
		for (int num: Arrays.copyOf(player.getEnteredNums(), player.getAttempt())) {
			System.out.print(num + " ");
		}
		System.out.println("");
	}
}