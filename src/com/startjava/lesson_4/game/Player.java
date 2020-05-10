package com.startjava.lesson_4.game;

public class Player {
	private String name;
	private int number;
	private int[] enteredNums = new int[10];
	private int couter;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setEnteredNums(int i, int res) {
		this.enteredNums[i] = res;
	}

	public int[] getEnteredNums() {
		return enteredNums;
	}

	public void setCouter() {
		this.couter++;
	}

	public int getCouter() {
		return couter;
	}

	public void zeroingCouter() {
		this.couter = 0;
	}
}