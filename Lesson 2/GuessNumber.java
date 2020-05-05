import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
	private int compNumber;
	private Player playerOne;
	private Player playerTwo;

	public GuessNumber(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}

	public void startGame() {
		Random random = new Random();
		compNumber = random.nextInt(101);
		do {
			enterNumber(playerOne);
			if(checkNumber(playerOne.getName(), playerOne.getNumber())) {
				break;
			}
			enterNumber(playerTwo);
			if(checkNumber(playerTwo.getName(), playerTwo.getNumber())) {
				break;
			}
		} while(true);
	}

	private void enterNumber(Player player) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Игрок " + player.getName() + " вводит число: ");
		player.setNumber(scan.nextInt());
	}

	private boolean checkNumber(String name, int number) {
		if(compNumber < number || compNumber > number) {
			if(compNumber < number) {
				System.out.println("Число больше загаданного компьютером.");
			} else if(compNumber > number) {
				System.out.println("Число меньше загаданного компьютером.");
			}
			return false;
		} else {
			System.out.println("Число угадано.");
			System.out.println("Игрок " + name + " победил");
			return true;
		}
	}
}