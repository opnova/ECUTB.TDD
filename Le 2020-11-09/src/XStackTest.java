import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class XStackTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testPush_first() {
		XStack cut = new XStack();
		cut.push(3);
		assertEquals(3, cut.buffer[0]);
	
	}
	
	@Test
	void testPush_two() {
		XStack cut = new XStack();
		cut.push(3);
		cut.push(77);
		assertEquals(3, cut.buffer[0]);
		assertEquals(77, cut.buffer[1]);
	
	}
	
	@Test
	void testPush_tooMany() {
		XStack cut = new XStack();
		/*
		 * L�gg till 11 tal p� stacken. Det �r en mer �n vad den 
		 * initialt kan inneh�lla, den ska d� automatiskt �ka bufferten 
		 * med 10 platser till s� att det f�r plats med 20 tal p� stacken.
		 */
		cut.push(3);
		cut.push(77);
		cut.push(3);
		cut.push(77);
		cut.push(3);
		cut.push(77);
		cut.push(3);
		cut.push(77);
		cut.push(3);
		cut.push(77);

		cut.push(999);  // Den tvingar fram expansion av buffert.
		
		assertEquals(999, cut.buffer[10]);
	
	}
		
	@Test
	void testCreate() {
		XStack cut = new XStack();
		assertEquals(10, cut.buffer.length);
	}	
	
	@Test
	void testCreate2() {
		XStack cut = new XStack();
		assertEquals(true, cut.isEmpty());
	}	
}
