import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Введите имя первого игрока: ");
		Player playerOne = new Player(scan.next());

		System.out.println("Введите имя второго игрока: ");
		Player playerTwo = new Player(scan.next());

		Random random = new Random();
		GuessNumber guessNumber = new GuessNumber(random.nextInt(100));

		guessNumber.checkNumber(guessNumber.getCompNumber(), playerOne.getName(), playerOne.getNumber(), playerTwo.getName(), playerTwo.getNumber());
	}
}