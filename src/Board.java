import java.util.Random;

public class Board {
    private Ship[][] board;
    private Ship[] shipArr;
    private static final int SIZE = 5; // length and width of board
    private static final int numShips = 5; // number of ships

    public Board() {
        board = new Ship[SIZE][SIZE];
        shipArr = new Ship[numShips];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = null;
            }
        }

        Random rand = new Random();
        int ships = 0;
        while (ships < numShips) {
            int r = rand.nextInt(SIZE);
            int c = rand.nextInt(SIZE);

            if (board[r][c] == null) {
                Ship newShip = new Ship();
                board[r][c] = newShip;
                shipArr[ships] = newShip;
                ships++;
            }
        }
    }

    public Ship[][] getBoard() {
        return board;
    }

    public Ship[] getShips() {
        return shipArr;
    }

    public boolean shoot(int row, int col) {
        if (board[row][col] != null) {
            if (board[row][col].isSunk() == false) {
                board[row][col].sink();
                return true;
            }
        }
        return false;
    }
}
