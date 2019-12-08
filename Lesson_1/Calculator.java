public class Calculator {
	public static void main(String[] args) {
		int arifm_result = 0;
		int a = 9;
		int b = 5; 
		char c = '+';

		if (c == '+') {
			arifm_result = a + b;
			System.out.println (arifm_result);
		} else if (c == '-') {
			arifm_result = a - b;
			System.out.println (arifm_result);			
		} else if (c == '*') {
			arifm_result = a * b;
			System.out.println (arifm_result);			
		} else if (c == '/') {
			arifm_result = a / b;
			System.out.println (arifm_result);			
		} else if (c == '^') {
			System.out.println (Stepen(a,b));			
		} else if (c == '%') {
			arifm_result = a % b;
			System.out.println (arifm_result);			
		}
	}

	private static int Stepen(int z, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= z;
        }
        return result;
    }
}