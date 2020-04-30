import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner number = new Scanner(System.in);

		do {
			System.out.print("Введите первое число: ");
			calc.setFirstNumber(number.nextInt());

			System.out.print("Введите знак математической операции: ");
			calc.setOperation(number.next().charAt(0));

			System.out.print("Введите второе число: ");
			calc.setSecondNumber(number.nextInt());

			calc.calculation();

			do {
				System.out.println("Хотите продолжить? [yes/no]:");
				calc.setCheck(number.next());
			} while((calc.getCheck().equals("yes") == false && calc.getCheck().equals("no") == false) == true);	
		} while(calc.getCheck().equals("yes") == true);
		

	}
}