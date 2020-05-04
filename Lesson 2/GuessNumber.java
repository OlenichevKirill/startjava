import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
	Random random = new Random();
	private int compNumber = random.nextInt(100);
	private Player playerOne;
	private Player playerTwo;

	public GuessNumber(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}

	public int getCompNumber() {
		return compNumber;
	}

	public void playerNumber(Player player, String name) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Игрок " + name + " вводит число: ");
		player.setNumber(scan.nextInt());
	}

	public void checkNumber(String player, int number) {
		if(getCompNumber() < number) {
				System.out.println("Число больше загаданного компьютером.");
			} else if(getCompNumber() > number) {
				System.out.println("Число меньше загаданного компьютером.");
			} else {
				System.out.println("Число угадано.");
				System.out.println("Игрок " + player + " победил");
			}
	}


	public void startGame() {
		do {
			playerNumber(playerOne, playerOne.getName());
			checkNumber(playerOne.getName(), playerOne.getNumber());
			if(playerOne.getNumber() == getCompNumber()) {
				break;
			}
			playerNumber(playerTwo, playerTwo.getName());
			checkNumber(playerTwo.getName(), playerTwo.getNumber());
			if(playerTwo.getNumber() == getCompNumber()) {
				break;
			}
		} while(getCompNumber() != playerOne.getNumber() && getCompNumber() != playerTwo.getNumber());	
	}
}