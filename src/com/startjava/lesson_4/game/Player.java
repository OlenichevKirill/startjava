package com.startjava.lesson_4.game;

public class Player {
	private String name;
	private int number;
	private int[] array = new int[10];

	public void setArray(int i, int res) {
		this.array[i] = res;
	}

	public int[] getArray() {
		return array;
	}

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
}