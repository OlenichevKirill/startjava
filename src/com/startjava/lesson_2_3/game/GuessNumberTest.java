package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		String answerYesNo;
		Scanner scan = new Scanner(System.in);

		System.out.println("Введите имя первого игрока: ");
		Player playerOne = new Player(scan.next());

		System.out.println("Введите имя второго игрока: ");
		Player playerTwo = new Player(scan.next());

		GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);
		
		do {
			guessNumber.startGame();

			do {
				System.out.println("Хотите продолжить? [yes/no]:");
				answerYesNo = scan.next();
			} while(!answerYesNo.equals("yes") && !answerYesNo.equals("no"));
		} while(answerYesNo.equals("yes"));
	}
}