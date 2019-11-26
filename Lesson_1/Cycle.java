public class Cycle {
	public static void main(String[] args) {
		for (int i = 0; i < 21; i++) {
			System.out.println(i);
		}

		System.out.println("");
		int j = 6;
		while (j >= -6) {
			System.out.println(j);
			j -= 2;
		}

		System.out.println("");
		int h = 10;
		int sumOdd = 0;
		do {
			if (h % 2 != 0) {
				sumOdd += h;	
				h++;
			}
			h++;
		} while (h < 20);
		System.out.println(sumOdd);
	}
}