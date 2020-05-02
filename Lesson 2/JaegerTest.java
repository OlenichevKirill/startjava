public class JaegerTest {
	
	public static void main(String[] args) {
		Jaeger jaegerOne = new Jaeger("Striker Eureka", "Mark-5", "Australia", 76.2f, 1.850f, 10, 10, 9);

		System.out.println("ModelName = " + jaegerOne.getModelName());
		System.out.println("Mark = " + jaegerOne.getMark());
		System.out.println("Origin = " + jaegerOne.getOrigin());
		System.out.println("Height = " + jaegerOne.getHeight());
		System.out.println("Weight = " + jaegerOne.getWeight());
		System.out.println("Speed = " + jaegerOne.getSpeed());
		System.out.println("Strength = " + jaegerOne.getStrength());
		System.out.println("Armor = " + jaegerOne.getArmor());

		jaegerOne.drift();
		jaegerOne.move(jaegerOne.getModelName());
		jaegerOne.useWeapon();

		Jaeger jaegerTwo = new Jaeger("Cherno Alpha", "Mark-1", "Russia", 85.34f, 2.412f, 3, 10, 10);

		System.out.println("ModelName = " + jaegerTwo.getModelName());
		System.out.println("Mark = " + jaegerTwo.getMark());
		System.out.println("Origin = " + jaegerTwo.getOrigin());
		System.out.println("Height = " + jaegerTwo.getHeight());
		System.out.println("Weight = " + jaegerTwo.getWeight());
		System.out.println("Speed = " + jaegerTwo.getSpeed());
		System.out.println("Strength = " + jaegerTwo.getStrength());
		System.out.println("Armor = " + jaegerTwo.getArmor());

		jaegerTwo.drift();
		jaegerTwo.move(jaegerTwo.getModelName());
		jaegerTwo.useWeapon();
	}
}