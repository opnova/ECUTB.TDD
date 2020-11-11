
public class StringHelper {
	
	public static boolean isPalindrome(String str) {
		
		if (str == null) {
			return true;
		}
		
		int strLen = str.length();
		for (int i = 0; i <  strLen / 2; i++) {			
			if (str.charAt(i) != str.charAt(strLen - i - 1)) {
				return false;
			}
		}		
		
		return true;
	}
	
	public static String reverse(String str) {
		
		if ( str == null) {
			throw new java.lang.NullPointerException();			
		}
		
		int len = str.length();
		char[] charArr = str.toCharArray();		
		char[] rev = new char[len];
		
		for (int i = 0; i < len; i++) {
			rev[i] = charArr[len - i - 1];
		}
		
		return new String(rev);
	}
	
	

}
