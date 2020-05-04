import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
	Random random = new Random();
	private int compNumber;
	private Player playerOne;
	private Player playerTwo;

	public GuessNumber(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}

	public void setCompNumber() {
		compNumber = random.nextInt(100);
	}

	public int getCompNumber() {
		return compNumber;
	}

	public void startGame() {
		setCompNumber();
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

	public void enterNumber(Player player) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Игрок " + player.getName() + " вводит число: ");
		player.setNumber(scan.nextInt());
	}

	public boolean checkNumber(String name, int number) {
		if(getCompNumber() < number) {
			System.out.println("Число больше загаданного компьютером.");
			return false;
		} else if(getCompNumber() > number) {
			System.out.println("Число меньше загаданного компьютером.");
			return false;
		} else {
			System.out.println("Число угадано.");
			System.out.println("Игрок " + name + " победил");
			return true;
		}
	}
}