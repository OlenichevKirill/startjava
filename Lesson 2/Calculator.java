public class Calculator {
	private int firstNumber = 10;
	private int secondNumber = 3;
	private char operation = '^';
	private int res = 0;
	private String check;

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setOperation(char operation) {
		switch (operation) {
			case '+': 
				this.operation = operation;
				break;
			case '-': 
				this.operation = operation;
				break;
			case '*': 
				this.operation = operation;
				break;
			case '/': 
				this.operation = operation;
				break;
			case '^': 
				this.operation = operation;
				break;
			case '%': 
				this.operation = operation;
				break;
			default:
				System.out.println("Введена не корректная операция");
				this.operation = operation;
				break;
		}
	}

	public char getOperation() {
		return operation;
	}

	public void setCheck(String check) {
		this.check = check;
	}

	public String getCheck() {
		return check;
	}


	public void calculation() {
		if (operation == '+') {
			res = firstNumber + secondNumber;
			System.out.println("Сумма чисел равно " + res);
		} else if (operation == '-') {
			res = firstNumber - secondNumber;
			System.out.println("Разность чисел равно " + res);
		} else if (operation == '*') {
			res = firstNumber * secondNumber;
			System.out.println("Перемножение чисел равно " + res);
		} else if (operation == '/') {
			res = firstNumber / secondNumber;
			System.out.println("Деление чисел равно " + res);
		} else if (operation == '^') {
			res = firstNumber;
			for (int i = 1; i < secondNumber; i++) {
				res *= firstNumber;
			}
			System.out.println("Число " + firstNumber + " возведенное в степь " + secondNumber + " равно " + res);
		} else if (operation == '%') {
			res = firstNumber % secondNumber;
			System.out.println("Остаток от деления чисел равно " + res);
		} else {
			System.out.println("Введенная операция не корректна. Не возможно получить результат.");
		}
	}
}