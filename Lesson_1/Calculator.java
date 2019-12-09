public class Calculator {
	public static void main(String[] args) {
		int a = 9;
		int b = 5; 
		char c = '+';

		if (c == '+') {
			System.out.println(a + b);
		} else if (c == '-') {
			System.out.println(a - b);			
		} else if (c == '*') {
			System.out.println(a * b);			
		} else if (c == '/') {
			System.out.println(a / b);			
		} else if (c == '^') {
			System.out.println(degree(a,b));			
		} else if (c == '%') {
			System.out.println(a % b);			
		}
	}

	private static int degree(int z, int y) {
        	int result = 1;
        	for (int i = 0; i < y; i++) {
        	    result *= z;
        	}
        return result;
   	}
}