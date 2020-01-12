public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfFirst = new Wolf();

		wolfFirst.sex = 'м';
		wolfFirst.nickname = "Бобик";
		wolfFirst.weight = 22.5f;
		wolfFirst.age = 5;
		wolfFirst.color = "Белый";	

		System.out.println("Его пол - " + wolfFirst.sex);
		System.out.println("Его кличка - " + wolfFirst.nickname);
		System.out.println("Он весит - " + wolfFirst.weight + " кг");
		System.out.println("Ему " + wolfFirst.age + " лет");
		System.out.println("Его цвет - " + wolfFirst.color);

		wolfFirst.move();
		wolfFirst.sit();
		wolfFirst.run();
		System.out.println(wolfFirst.howl());
		wolfFirst.hunt();
	}
}