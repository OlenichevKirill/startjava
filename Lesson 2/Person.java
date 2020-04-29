public class Person {

	String gender = "man";
	String name = "Kirill";
	float height = 1.8f;
	float weight = 85.5f;
	int age = 26;

	void go() {
		System.out.println("Вы начали движение");
	}

	void sit() {
		System.out.println("Вы сели");
	}

	void run() {
		System.out.println("Вы перешли в режим бега");
	}

	String speak() {
		return "speak";
	}

	boolean teachJava() {
		System.out.println("Я учу язык Java");
		return true;
	}
}