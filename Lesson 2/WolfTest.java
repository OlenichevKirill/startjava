public class WolfTest {
	
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();

		wolfOne.setGender("woman");
		wolfOne.setNickName("Пушинка");
		wolfOne.setWeight(16);
		wolfOne.setAge(9);
		wolfOne.setColor("Серый");

		System.out.println("Пол: " + wolfOne.getGender());
		System.out.println("Кличка: " + wolfOne.getNickName());
		System.out.println("Вес: " + wolfOne.getWeight());
		System.out.println("Возраст: " + wolfOne.getAge());
		System.out.println("Окрас: " + wolfOne.getColor());

		wolfOne.go();
		wolfOne.sit();
		wolfOne.run();
		System.out.println(wolfOne.howl());
		System.out.println(wolfOne.hunt());
	}
}