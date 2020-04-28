public class ConditionalStatement {
	public static void main(String[] args) {

		int age = 21;
		boolean man = true;
		float height = 1.81f;
		char name = 'Р';

		if (age > 20) {
			System.out.println("Вы старше 20 лет");
		}

		if (man) {
			System.out.println("Мужчина");
		}

		if (!man) {
			System.out.println("Женщина");
		}

		if (height < 1.80) {
			System.out.println("Ваш рост ниже 1.80");
		} else {
			System.out.println("Ваш рост не ниже 1.80");
		}

		if (name == 'М') {
			System.out.println("Ваше имя начинается с М");
		} else if (name == 'И') {
			System.out.println("Ваше имя начинается с И");
		} else {
			System.out.println("Ваше имя начинается не с М или И");
		}
	}
}