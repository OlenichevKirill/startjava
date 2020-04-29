public class Wolf {
	
	String gender = "man";
	String nickName = "Bigbi";
	float weight = 15.5f;
	int age = 5;
	String color = "Black";

	void go() {
		System.out.println("Волк начал движение");
	}

	void sit() {
		System.out.println("Волк решил присесть");
	}

	void run() {
		System.out.println("Волк решил пробежаться");
	}

	String howl() {
		return "У-У-У-У-У";
	}

	boolean hunt() {
		System.out.println("Волк вышел на охоту");
		return true;
	}
}