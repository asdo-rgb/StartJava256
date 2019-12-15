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
				System.out.println("Игрок угадал!");
				break; 
			} else {
				if (numberPlayer > numberComputer) {
					System.out.println("Число игрока больше, чем загаданное компьютером");
					System.out.println("Игрок должен попробовать еще раз.");
				}
				if (numberPlayer < numberComputer) {
					System.out.println("Число игрока меньше, чем загаданное компьютером");
					System.out.println("Игрок должен попробовать еще раз.");
				}
				
			}	
		}
	}	
}