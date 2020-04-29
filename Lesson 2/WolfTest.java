public class WolfTest {
	
	public static void main(String[] args) {

		Wolf wolfOne = new Wolf();

		System.out.println("Пол: " + wolfOne.gender);
		System.out.println("Кличка: " + wolfOne.nickName);
		System.out.println("Вес: " + wolfOne.weight);
		System.out.println("Возраст: " + wolfOne.age);
		System.out.println("Окрас: " + wolfOne.color);

		wolfOne.go();
		wolfOne.sit();
		wolfOne.run();
		System.out.println(wolfOne.howl());
		System.out.println(wolfOne.hunt());
	}
}