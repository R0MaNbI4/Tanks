import javax.swing.*;

public class Frame extends JFrame {
    Frame() {
        setBounds(200, 200, 800, 800);
        setTitle("Tanks");
        setVisible(true);
        add(new Game());
    }
}
