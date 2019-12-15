public class GuessNumber {
	public static void main(String[] args) {
		int playerNumber = 0;
		int computerNumber = 0;

		computerNumber = (int) (Math.random() * 100);
		System.out.println("Компьютер загадывает число от 0 до 99...");

		while (playerNumber != computerNumber) {
			System.out.println("Число, которое нужно угадать - " + computerNumber);

			playerNumber = (int) (Math.random() * 100);
			System.out.println("Игрок думает, что это " + playerNumber);

			if (playerNumber > computerNumber) {
				System.out.println("Число игрока больше, чем загаданное компьютером");
				System.out.println("Игрок должен попробовать еще раз.");
				} else if (playerNumber < computerNumber) {
					System.out.println("Число игрока меньше, чем загаданное компьютером");
					System.out.println("Игрок должен попробовать еще раз.");
					}
			}
	System.out.println("Игрок угадал!");
	}	
}