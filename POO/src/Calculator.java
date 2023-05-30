
public class Calculator {

	// Add a and b
	public int add(int a, int b) {
		return a + b;
	}

	// Subtract a by b
	public int subtract(int a, int b) {
		return a - b;
	}

	// Multiply a by b
	public int multiply(int a, int b) {
		return a * b;
	}

	// Divide a by b and catch math error
	public int divide(int a, int b) {

		try {
			return a / b;
			
		} catch (ArithmeticException e) {
			throw new ArithmeticException();
		}

	}

}
