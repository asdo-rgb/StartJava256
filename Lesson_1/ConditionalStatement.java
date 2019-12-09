public class ConditionalStatement {
	public static void main(String[] args) {
		int personAge = 25;
		if (personAge > 20) {
			System.out.println("Человек старше 20 лет");
		}

		boolean isMan = true;
		if (isMan) {
			System.out.println("Человек - мужчина");
		}
		if (!isMan) {
			System.out.println("Человек - не мужчина");
		}

		float personHeight = 1.78f;
		if (personHeight < 1.80) {
			System.out.println("Рост человека меньше 180 сантиметров");
		} else {
			System.out.println("Рост человека больше 180 сантиметров");
		}

		char personFirstLetterName = 'М';
		if (personFirstLetterName == 'A') {
			System.out.println("Первая буква имени человека не 'А'");
		} else if (personFirstLetterName == 'I') {
			System.out.println("Первая буква имени человека не 'I'");
		} else {
			System.out.println("Скорее всего первая буква имени человека 'M'");
		}
	}
}