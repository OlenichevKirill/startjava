package com.startjava.lesson_4.calculator;

public class Calculator {
	private int firstNumber;
	private int secondNumber;
	private char operation;
	private double res;

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getFirstNumber(int i) {
		return firstNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setOperation(char operation) {
		this.operation = operation;
	}

	public char getOperation() {
		return operation;
	}

	public void calculate() {
		switch (operation) {
			case '+':
				res = firstNumber + secondNumber;
				System.out.println("Сумма чисел равно " + res);
				break;
			case '-':
				res = firstNumber - secondNumber;
				System.out.println("Разность чисел равно " + res);
				break;
			case '*':
				res = firstNumber * secondNumber;
				System.out.println("Перемножение чисел равно " + res);
				break;
			case '/':
				res = firstNumber / secondNumber;
				System.out.println("Деление чисел равно " + res);
				break;
			case '^':
				res = Math.pow((double) firstNumber,(double) secondNumber);
				System.out.println("Число " + firstNumber + " возведенное в степь " + secondNumber + " равно " + res);
				break;
			case '%':
				res = firstNumber % secondNumber;
				System.out.println("Остаток от деления чисел равно " + res);
				break;
			default:
				System.out.println("Введена не корректная операция");
				break;
		}
	}
}