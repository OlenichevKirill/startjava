package com.startjava.lesson_1.calculator;

public class Calculator {
	public static void main(String[] args) {
		int firstNumber = 10;
		int secondNumber = 3;
		char operation = '^';
		int res = 0;

		if (operation == '+') {
			res = firstNumber + secondNumber;
			System.out.println("Сумма чисел равно " + res);
		} else if (operation == '-') {
			res = firstNumber - secondNumber;
			System.out.println("Разность чисел равно " + res);
		} else if (operation == '*') {
			res = firstNumber * secondNumber;
			System.out.println("Перемножение чисел равно " + res);
		} else if (operation == '/') {
			res = firstNumber / secondNumber;
			System.out.println("Деление чисел равно " + res);
		} else if (operation == '^') {
			res = firstNumber;
			for (int i = 1; i < secondNumber; i++) {
				res *= firstNumber;
			}
			System.out.println("Число " + firstNumber + " возведенное в степь " + secondNumber + " равно " + res);
		} else if (operation == '%') {
			res = firstNumber % secondNumber;
			System.out.println("Остаток от деления чисел равно " + res);
		}
	}
}