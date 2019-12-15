public class GuessNumber {
	public static void main(String[] args) {
		int numberPlayer = 0;
		int numberComputer = 0;

		numberComputer = (int) (Math.random() * 100);
		System.out.println("Компьютер загадывает число от 0 до 99...");

		while (numberPlayer != numberComputer) {
			System.out.println("Число, которое нужно угадать - " + numberComputer);

			numberPlayer = (int) (Math.random() * 100);
			System.out.println("Игрок думает, что это " + numberPlayer);
		
			if (numberPlayer == numberComputer) {
				System.out.println("У нас есть победитель!");
				System.out.println("Конец игры");
				break; 
			} else {
				System.out.println("Игрок должен попробовать еще раз.");
			}	
		}
	}	
}