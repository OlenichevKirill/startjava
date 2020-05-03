import java.util.Scanner;

public class GuessNumber {
	private int compNumber;

	public GuessNumber(int compNumber) {
		this.compNumber = compNumber;
	}

	public int getCompNumber() {
		return compNumber;
	}

	public void checkNumber(int compNumber, String playerOneName, int playerOneNumber, String playerTwoName, int playerTwoNumber) {
		String answerYesNo;
		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Игрок " + playerOneName + " вводит число: ");
			playerOneNumber = scan.nextInt();

			if(compNumber < playerOneNumber) {
				System.out.println("Число больше загаданного компьютером.");
			} else if(compNumber > playerOneNumber) {
				System.out.println("Число меньше загаданного компьютером.");
			} else {
				System.out.println("Число угадано.");
				System.out.println("Игрок " + playerOneName + " победил");
				break;
			}

			System.out.println("Игрок " + playerTwoName + " вводит число: ");
			playerTwoNumber = scan.nextInt();
		
			if(compNumber < playerTwoNumber) {
				System.out.println("Число больше загаданного компьютером.");
			} else if(compNumber > playerTwoNumber) {
				System.out.println("Число меньше загаданного компьютером.");
			} else {
				System.out.println("Число угадано.");
				System.out.println("Игрок " + playerTwoName + " победил");
				break;
			}

			do {
				System.out.println("Хотите продолжить? [yes/no]:");
				answerYesNo = scan.next();
			} while(!answerYesNo.equals("yes") && !answerYesNo.equals("no"));
		} while(answerYesNo.equals("yes"));
	}
}