import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TicTacToeTest {
	TicTacToe cut = null; // cut -> Class Under Test
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cut = new TicTacToe();
	}

	@AfterEach
	void tearDown() throws Exception {
		cut = null;
	}

	@Test
	void testFirstPlayerIsX() {		
		assertEquals("X", cut.nextPlayer());
	}

	@Test
	void testSecondPlayerIsO() {		
		cut.nextPlayer();
		assertEquals("O", cut.nextPlayer());
	}
	
	@Test
	void testPutMarkerOutsideRowAbove() {
		assertThrows(GameException.class, () -> cut.putMarker(-1, 0, "X"));
	}
	
	@Test
	void testPutMarkerOutsideRowBelow() {
		assertThrows(GameException.class, () -> cut.putMarker(3, 0, "X"));
	}	
	
	@Test
	void testPutMarkerOutsideColLeft() {
		assertThrows(GameException.class, () -> cut.putMarker(0, -1, "X"));
	}
	
	@Test
	void testPutMarkerOutsideColRight() {
		assertThrows(GameException.class, () -> cut.putMarker(0, 3, "X"));
	}	
	
	@Test
	void testPutMarker() throws GameException {
		cut.putMarker(0, 0, "X");
		assertEquals("X", cut.gameBoard[0][0]);
	}
	@Test
	void testPutMarkerOnOccupiedPosition() throws GameException {
		cut.putMarker(0, 0, "X");
		assertThrows(GameException.class, () -> cut.putMarker(0, 0, "X")); 
	}

	@Test
	void testIsWinnerRow0() {
		cut.gameBoard[0][0] = "X";
		cut.gameBoard[0][1] = "X";
		cut.gameBoard[0][2] = "X";
		
		assertEquals("X", cut.isWinner());		
	}
	
	@Test
	void testIsWinnerRow1() {
		cut.gameBoard[1][0] = "X";
		cut.gameBoard[1][1] = "X";
		cut.gameBoard[1][2] = "X";
		
		assertEquals("X", cut.isWinner());		
	}	

	@Test
	void testIsWinnerRow2() {
		cut.gameBoard[2][0] = "X";
		cut.gameBoard[2][1] = "X";
		cut.gameBoard[2][2] = "X";
		
		assertEquals("X", cut.isWinner());		
	}	
	
	@Test
	void testIsWinnerDiagonal1() {
		cut.gameBoard[0][0] = "X";
		cut.gameBoard[1][1] = "X";
		cut.gameBoard[2][2] = "X";
		
		assertEquals("X", cut.isWinner());		
	}	
	
	@Test
	void testIsWinnerDiagonal2() {
		cut.gameBoard[2][0] = "X";
		cut.gameBoard[1][1] = "X";
		cut.gameBoard[0][2] = "X";
		
		assertEquals("X", cut.isWinner());		
	}		
	// ********************************************
	@Test
	void testIsWinnerCol0() {
		cut.gameBoard[0][0] = "X";
		cut.gameBoard[1][0] = "X";
		cut.gameBoard[2][0] = "X";
		
		assertEquals("X", cut.isWinner());		
	}
	
	@Test
	void testIsWinnerCol1() {
		cut.gameBoard[0][1] = "X";
		cut.gameBoard[1][1] = "X";
		cut.gameBoard[2][1] = "X";
		
		assertEquals("X", cut.isWinner());		
	}
	
	@Test
	void testIsWinnerCol2() {
		cut.gameBoard[0][2] = "X";
		cut.gameBoard[1][2] = "X";
		cut.gameBoard[2][2] = "X";
		
		assertEquals("X", cut.isWinner());		
	}	
	
	//***************************************
	
	@Test
	void testNoWinnerYet() {
		cut.gameBoard[0][2] = "X";
		cut.gameBoard[1][2] = "X";
		
		assertEquals(null, cut.isWinner());				
	}

	@Test
	void testBoardNotFull() {
		cut.gameBoard[0][2] = "X";
		cut.gameBoard[1][2] = "X";
		
		assertFalse(cut.isBoardFull());
	}
	
	@Test
	void testBoardIsFull() {
		cut.gameBoard = new String[/* Rad */][/* Kolumn */] { 
			{"X", "X", "X"}, 
			{"X", "X", "X"}, 
			{"X", "X", "X"}};
			
			assertTrue(cut.isBoardFull());
	}

}
