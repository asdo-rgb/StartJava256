public class Wolf {
	private char sex;
	private String nickName;
	private float weight;
	private int age;
	private String color;

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 8) {
			System.out.println("Некорректный возраст");
		} else {
			this.age = age;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void move() {
		System.out.println("Он двигается!");
	}

	public void sit() {
		System.out.println("Он присел");
	}

	public void run() {
		System.out.println("Он побежал!!!");
	}

	public boolean howl() {
		System.out.println("Он завыл");
		return true;
	}

	public void hunt() {
		System.out.println("Он начал охоту!!!");
	}
}