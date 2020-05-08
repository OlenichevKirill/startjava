package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		String answerYesNo;
		String[] mathExpression = new String[3];
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Введите математическое выражение: ");
			mathExpression = new Scanner(System.in).nextLine().split(" ");

			calc.setFirstNumber(Integer.parseInt(mathExpression[0]));
			calc.setSecondNumber(Integer.parseInt(mathExpression[2]));
			calc.setOperation(mathExpression[1].charAt(0));

			calc.calculate();

			do {
				System.out.println("Хотите продолжить? [yes/no]:");
				answerYesNo = scan.next();
			} while(!answerYesNo.equals("yes") && !answerYesNo.equals("no"));	
		} while(answerYesNo.equals("yes"));
	}
}