public class Cycle {
	public static void main(String[] args) {
		for (int i = 0; i < 21; i++) {
			System.out.println (i);
		}

		System.out.println ("");

		int j = 6;
		while (j >= -6) {
			System.out.println (j);
			j = j-2;
		}

		System.out.println ("");

		int h = 9;
		int g = 0;
		do {
			h = h + 2;
			g = g + h;
		} while (h < 19);
		System.out.println (g);
	}
}