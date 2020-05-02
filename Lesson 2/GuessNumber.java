public class GuessNumber {
	private int compNumber;

	public GuessNumber(int compNumber) {
		this.compNumber = compNumber;
	}

	public int getCompNumber() {
		return compNumber;
	}

	public void checkNumber(int compNumber, int playerNumber) {
		if(compNumber < playerNumber) {
			System.out.println("Число больше загаданного компьютером.");
		} else if(compNumber > playerNumber) {
			System.out.println("Число меньше загаданного компьютером.");
		} else {
			System.out.println("Число угадано.");
		}
	}
}