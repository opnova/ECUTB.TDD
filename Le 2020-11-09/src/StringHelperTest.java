import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringHelperTest {
	
	@Test
	void testIsPalindrome_Empty() {
		assertTrue(StringHelper.isPalindrome(""));
	}
	
	@Test
	void testIsPalindrome_Single() {
		assertTrue(StringHelper.isPalindrome("A"));
	}
	
	@Test
	void testIsPalindrome_Null() {
		assertTrue(StringHelper.isPalindrome(null));
	}
	
	@Test
	void testIsPalindrome_Str1() {
		assertTrue(StringHelper.isPalindrome("ABBA"));
	}
	
	@Test
	void testIsPalindrome_Str2() {
		assertFalse(StringHelper.isPalindrome("AxBA"));
	}

	@Test
	void testABC() {
		assertEquals("CBA", StringHelper.reverse("ABC"));
	}
	
	@Test
	void testA() {
		assertEquals("A", StringHelper.reverse("A"));
	}	
	
	@Test
	void testEmpty() {
		assertEquals("", StringHelper.reverse(""));
	}
	
	@Test
	void testNull() {
		assertThrows(
				java.lang.NullPointerException.class, 
				() -> StringHelper.reverse(null));		
	}
}
