package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		String answerYesNo;
		String[] text = new String[3];

		do {
			Scanner scan = new Scanner(System.in);

			System.out.println("Введите математическое выражение: ");
			text = scan.nextLine().split(" ");

			calc.setFirstNumber(Integer.parseInt(text[0]));
			calc.setSecondNumber(Integer.parseInt(text[2]));
			calc.setOperation(text[1].charAt(0));

			calc.calculate();

			do {
				System.out.println("Хотите продолжить? [yes/no]:");
				answerYesNo = scan.next();
			} while(!answerYesNo.equals("yes") && !answerYesNo.equals("no"));	
		} while(answerYesNo.equals("yes"));
	}
}