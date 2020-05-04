import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
	Random random = new Random();
	private int compNumber = random.nextInt(100);
	private String playerOne;
	private int playerOneNumber;
	private String playerTwo;
	private int playerTwoNumber;

	public GuessNumber(String playerOne, int playerOneNumber, String playerTwo, int playerTwoNumber) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}

	public int getCompNumber() {
		return compNumber;
	}

	public void setPlayerOneNumber(int playerOneNumber) {
		this.playerOneNumber = playerOneNumber;
	}

	public int getPlayerOneNumber() {
		return playerOneNumber;
	}

	public void setPlayerTwoNumber(int playerTwoNumber) {
		this.playerTwoNumber = playerTwoNumber;
	}

	public int getPlayerTwoNumber() {
		return playerTwoNumber;
	}

	public String getPlayerOne() {
		return playerOne;
	}

	public String getPlayerTwo() {
		return playerTwo;
	}

	public void checkPlayerOneNumber() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Игрок " + getPlayerOne() + " вводит число: ");
		setPlayerOneNumber(scan.nextInt());

		if(getCompNumber() < getPlayerOneNumber()) {
			System.out.println("Число больше загаданного компьютером.");
		} else if(getCompNumber() > getPlayerOneNumber()) {
			System.out.println("Число меньше загаданного компьютером.");
		} else {
			System.out.println("Число угадано.");
			System.out.println("Игрок " + getPlayerOne() + " победил");
			//break;
		}
	}
	public void checkPlayerTwoNumber() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Игрок " + getPlayerTwo() + " вводит число: ");
		setPlayerTwoNumber(scan.nextInt());

		if(getCompNumber() < getPlayerTwoNumber()) {
			System.out.println("Число больше загаданного компьютером.");
		} else if(getCompNumber() > getPlayerTwoNumber()) {
			System.out.println("Число меньше загаданного компьютером.");
		} else {
			System.out.println("Число угадано.");
			System.out.println("Игрок " + getPlayerTwo() + " победил");
			//break;
		}
	}
}