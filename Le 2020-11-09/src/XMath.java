
public class XMath {
	
	public static int add(int i, int j) {
		
		return i + j;
	}
	
	public static int div(int i, int j) {
		
		if (j == 0) {
			throw new ArithmeticException();
		}
		
		return i / j;
	}
	
	public static int multiply(int i, int j) {
		
		return i * j;
	}
	
	public static int subtract(int i, int j) {
		
		return i - j;
	}	
}
