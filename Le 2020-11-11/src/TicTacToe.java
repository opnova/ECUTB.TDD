
public class TicTacToe {

    String currentPlayer = null;
    String[][] gameBoard = null;

    public TicTacToe() {

        currentPlayer = "O";
        gameBoard = new String[/* Rad */][/* Kolumn */] { { "", "", "" }, { "", "", "" }, { "", "", "" } };

    }

    public String nextPlayer() {

        currentPlayer = (currentPlayer == "O") ? "X" : "O";
        return currentPlayer;

    }

    public void putMarker(int row, int col, String marker) throws GameException {

        if (row < 0 || row > 2) {
            throw new GameException();
        }

        if (col < 0 || col > 2) {
            throw new GameException();
        }

        if (gameBoard[row][col].length() >= 1) {
            throw new GameException();
        }

        gameBoard[row][col] = marker;

    }

    public String isWinner() {

        for (String marker : new String[] { "X", "O" }) {

            if ((gameBoard[0][0] == marker && gameBoard[0][1] == marker && gameBoard[0][2] == marker)
                    || (gameBoard[1][0] == marker && gameBoard[1][1] == marker && gameBoard[1][2] == marker)
                    || (gameBoard[2][0] == marker && gameBoard[2][1] == marker && gameBoard[2][2] == marker)) {
                return marker;
            }

            if ((gameBoard[0][0] == marker && gameBoard[1][0] == marker && gameBoard[2][0] == marker)
                    || (gameBoard[0][1] == marker && gameBoard[1][1] == marker && gameBoard[2][1] == marker)
                    || (gameBoard[0][2] == marker && gameBoard[1][2] == marker && gameBoard[2][2] == marker)) {
                return marker;
            }

            if (gameBoard[0][0] == marker && gameBoard[1][1] == marker && gameBoard[2][2] == marker) {
                return marker;
            }

            if (gameBoard[2][0] == marker && gameBoard[1][1] == marker && gameBoard[0][2] == marker) {
                return marker;
            }
        }

        return null;
    }

    public boolean isBoardFull() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (gameBoard[i][j] == "") {
                    return false;
                }
            }
        }

        return true;
    }

}
