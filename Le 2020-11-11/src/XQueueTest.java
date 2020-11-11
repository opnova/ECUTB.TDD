import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class XQueueTest {
	
	XQueue cut = null;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cut = new XQueue();
	}

	@AfterEach
	void tearDown() throws Exception {
		cut = null;
	}

	@Test
	void testDequeueFromEmpty() {
		assertThrows(EmptyException.class, () -> cut.Dequeue());
	}
	
	@Test
	void testDequeueOneItem() throws EmptyException {
		cut.nextPos = 1;
		cut.data[0] = 7;

		assertEquals(7, cut.Dequeue());
		assertEquals(0, cut.nextPos);
	
	}
	
	@Test
	void testEnqueueWhenEmpty() {
		cut.Enqueue(99);
		assertEquals(1, cut.nextPos);
		assertEquals(99, cut.data[0]);
	}
	
	@Test
	void testEnqueuePassingLimit() {
		cut.nextPos = 3;		
		cut.Enqueue(99);
		
		assertEquals(4, cut.nextPos);
		assertEquals(99, cut.data[3]);
	}	

}
