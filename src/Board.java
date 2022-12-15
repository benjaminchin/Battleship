import java.util.Random;

public class Board {
    private Ship[][] board;
    private static final int SIZE = 5; // length and width of board
    private static final int numShips = 5; // number of ships

    public Board() {
        board = new Ship[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = null;
            }
        }

        Random rand = new Random();
        for (int k = 0; k < numShips; k++) {
            int r = rand.nextInt(SIZE);
            int c = rand.nextInt(SIZE);

            board[r][c] = new Ship();
        }
    }

    public Ship[][] getBoard() {
        return board;
    }
}
