public class Wolf {
	char sex;
	String nickname;
	float weight;
	int age;
	String color;

	void move() {
		System.out.println("Он двигается!");
	}

	void sit() {
		System.out.println("Он присел");
	}

	void run() {
		System.out.println("Он побежал!!!");
	}

	boolean howl() {
		System.out.println("Он завыл");
		return true;
	}

	void hunt() {
		System.out.println("Он начал охоту!!!");
	}
}