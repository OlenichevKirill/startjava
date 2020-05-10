package com.startjava.lesson_4.game;

public class Player {
	private String name;
	private int[] enteredNums = new int[10];
	private int attempt;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setEnteredNum(int i, int num) {
		enteredNums[i] = num;
	}

	public int[] getEnteredNums() {
		return enteredNums;
	}

	public int getEnteredNum(int i) {
		return enteredNums[i];
	}

	public void setAttempt() {
		attempt++;
	}

	public int getAttempt() {
		return attempt;
	}

	public void zeroingAttempt() {
		attempt = 0;
	}
}