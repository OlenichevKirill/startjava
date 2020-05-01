import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		String answerYesNo;
		do {
			System.out.print("Введите первое число: ");
			calc.setFirstNumber(scan.nextInt());

			System.out.print("Введите знак математической операции: ");
			calc.setOperation(scan.next().charAt(0));

			System.out.print("Введите второе число: ");
			calc.setSecondNumber(scan.nextInt());

			calc.calculate();

			do {
				System.out.println("Хотите продолжить? [yes/no]:");
				answerYesNo = scan.next();
			} while(!answerYesNo.equals("yes") && !answerYesNo.equals("no"));	
		} while(answerYesNo.equals("yes"));
	}
}