public class Wolf {
	
	private String gender = "man";
	private String nickName = "Bigbi";
	private float weight = 15.5f;
	private int age = 5;
	private String color = "Black";

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getWeight() {
		return weight;
	}

	public void setAge(int age) {
		if(age > 8) {
			System.out.println("Некорректный возраст");
		} else {
			this.age = age;
		}
	}

	public int getAge() {
		return age;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void go() {
		System.out.println("Волк начал движение");
	}

	public void sit() {
		System.out.println("Волк решил присесть");
	}

	public void run() {
		System.out.println("Волк решил пробежаться");
	}

	public String howl() {
		return "У-У-У-У-У";
	}

	public boolean hunt() {
		System.out.println("Волк вышел на охоту");
		return true;
	}
}