import java.util.Scanner;

public class Game {
    private Board board;
    private boolean gameOver;

    public Game() {
        board = new Board();
        gameOver = false;
        Scanner sc = new Scanner(System.in);

        while (gameOver == false) {
            System.out.println("Enter row: ");
            int row = sc.nextInt();
            System.out.println("Enter col: ");
            int col = sc.nextInt();

            if (board.shoot(row, col)) {
                System.out.println("HIT!");
            } else {
                System.out.println("MISS.");
            }

            isGameOver();
        }
        System.out.println("Game Over!");
        sc.close();
    }

    private void isGameOver() {
        gameOver = isGameOverHelper();
    }

    private boolean isGameOverHelper() {
        for (int i = 0; i < board.getShips().length; i++) {
            if (!board.getShips()[i].isSunk()) {
                return false;
            }
        }
        return true;
    }
}
