public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfFirst = new Wolf();

		wolfFirst.setSex('м');
		wolfFirst.setNickName("Бобик");
		wolfFirst.setWeight(22.5f);
		wolfFirst.setAge(5);
		wolfFirst.setColor("Белый");	

		System.out.println("Его пол - " + wolfFirst.getSex());
		System.out.println("Его кличка - " + wolfFirst.getNickName());
		System.out.println("Он весит - " + wolfFirst.getWeight());
		System.out.println("Ему " + wolfFirst.getAge() + " лет");
		System.out.println("Его цвет - " + wolfFirst.getColor());
	}
}