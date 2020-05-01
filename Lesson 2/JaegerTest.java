public class JaegerTest {
	
	public static void main(String[] args) {
		Jaeger jaegerOne = new Jaeger();

		jaegerOne.setModelName("Striker Eureka");
		jaegerOne.setMark("Mark-5");
		jaegerOne.setOrigin("Australia");
		jaegerOne.setHeight(76.2f);
		jaegerOne.setWeight(1.850f);
		jaegerOne.setSpeed(10);
		jaegerOne.setStrength(10);
		jaegerOne.setArmor(9);

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

		Jaeger jaegerTwo = new Jaeger();

		jaegerTwo.setModelName("Cherno Alpha");
		jaegerTwo.setMark("Mark-1");
		jaegerTwo.setOrigin("Russia");
		jaegerTwo.setHeight(85.34f);
		jaegerTwo.setWeight(2.412f);
		jaegerTwo.setSpeed(3);
		jaegerTwo.setStrength(10);
		jaegerTwo.setArmor(10);

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