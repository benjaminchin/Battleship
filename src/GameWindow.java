import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class GameWindow extends JFrame {

    public GameWindow() {
        setTitle("Battleship");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}