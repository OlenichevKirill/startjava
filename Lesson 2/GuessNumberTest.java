import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {

	public static void main(String[] args) {
		String answerYesNo;
		Scanner scan = new Scanner(System.in);

		System.out.println("Введите имя первого игрока: ");
		Player playerOne = new Player(scan.next());

		System.out.println("Введите имя первого игрока: ");
		Player playerTwo = new Player(scan.next());

		Random random = new Random();
		GuessNumber guessNumber = new GuessNumber(random.nextInt(100));
		
		do {
			System.out.println("Игрок " + playerOne.getName() + " вводит число: ");
			playerOne.setNumber(scan.nextInt());
			guessNumber.checkNumber(guessNumber.getCompNumber(), playerOne.getNumber(), playerOne.getName());
			if(guessNumber.getCompNumber() == playerOne.getNumber()) {
				break;
			}

			System.out.println("Игрок " + playerTwo.getName() + " вводит число: ");
			playerTwo.setNumber(scan.nextInt());
			guessNumber.checkNumber(guessNumber.getCompNumber(), playerTwo.getNumber(), playerTwo.getName());
			if(guessNumber.getCompNumber() == playerTwo.getNumber()) {
				break;
			}

			do {
				System.out.println("Хотите продолжить? [yes/no]:");
				answerYesNo = scan.next();
			} while(!answerYesNo.equals("yes") && !answerYesNo.equals("no"));
		} while(answerYesNo.equals("yes"));
	}
}