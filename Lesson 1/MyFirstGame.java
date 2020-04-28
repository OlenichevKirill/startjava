public class MyFirstGame {
	public static void main(String[] args) {
		int number = 10;
		int userNumber = 14;

		if(userNumber < number) {
			while(userNumber!=number){
				System.out.println("Число " + userNumber +" меньше искомого числа");
				userNumber++;
			}
		} else if(userNumber > number) {
			while(userNumber!=number){
				System.out.println("Число " + userNumber +" больше искомого числа");
				userNumber--;
			}
		} 
		System.out.println("Вы угадали " + userNumber);
	}
}