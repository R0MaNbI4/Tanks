import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

public class Game extends JPanel implements KeyListener, ActionListener {
    private Timer timer;
    private boolean runGame;
    private Tank tank;
    private int frame;
    private int xTank = 200;
    private int yTank = 200;
    private int xTemp = 200;

    static {

    }

    Game() {
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

        //tank = new Tank();

        runGame = true;

        timer=new Timer(16,this);
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.black);
        g.drawRect(xTemp, 100, 100, 100);
        g.drawImage(tank.getSprite(frame), xTank, yTank, null);
        System.out.println("repaint");
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        xTemp++;
        xTank++;
        frame++;
        if (frame > 4) {
            frame = 1;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
