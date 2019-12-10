public class Calculator {
	public static void main(String[] args) {
		int a = 9;
		int b = 5; 
		char mathOperation = '+';

		if (mathOperation == '+') {
			System.out.println(a + b);
		} else if (mathOperation == '-') {
			System.out.println(a - b);			
		} else if (mathOperation == '*') {
			System.out.println(a * b);			
		} else if (mathOperation == '/') {
			System.out.println(a / b);			
		} else if (mathOperation == '^') {
			System.out.println(toDoDegree(a, b));			
		} else if (mathOperation == '%') {
			System.out.println(a % b);			
		}
	}

	private static int toDoDegree(int z, int y) {
        	int result = 1;
        	for (int i = 0; i < y; i++) {
        	    result *= z;
        	}
        	return result;
   	}
}