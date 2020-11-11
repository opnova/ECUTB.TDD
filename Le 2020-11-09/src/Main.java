
public class Main {

	public static boolean isEven(int i) {
		// 1101
		// 1010101010101010101101001010
		// 11111111111 & 0x01 => 1
		return (i & 0x01) == 0;
		//return i % 2 == 0;
	}
	
	public static void main(String[] args) {	

		int result = XMath.add(1, 2);
		
		System.out.print("XMath.add(1, 2) == 3 ");
		if (XMath.add(1, 2) == 3)
			System.out.println("is ok.");
		else
			System.out.println("is not ok.");	
		
		
		System.out.print("XMath.div(1, 2) == 0 ");
		if (XMath.div(1, 2) == 0)
			System.out.println("is ok.");
		else
			System.out.println("is not ok.");		
		
	}
	
}
