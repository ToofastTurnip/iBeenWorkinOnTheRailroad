import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Board extends JPanel implements ActionListener {
    Helicopter p;
    Obstacle o,ob;
    public Image img,end;
    Timer time;
    int n = 0;
    Graphics2D g2d;

    public Board() {
        p = new Helicopter();
        o = new Obstacle();
        addKeyListener(new AL());
        setFocusable(true);
        ImageIcon i = new ImageIcon("background.png");
        img = i.getImage();
        ImageIcon e = new ImageIcon("endgame.png");
        end = e.getImage();
        time = new Timer(5, this);
        time.start();
    }

    public void actionPerformed(ActionEvent e) {
        p.move();
        o.move();
        n++;
        if(n == 500){
            makeNewObstacle();
            n = n - 500;
        }
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(img, 0, 0, null);
        g2d.drawImage(p.getImage(), p.getX(), p.getY(), null);
        g2d.drawImage(o.getImage(),o.getX(),o.getY(),null);
        if(p.getY()<=35 || p.getY()>=785){
            g2d.drawImage(end,0,0,null);
            time.stop();
        }
    }

    private void makeNewObstacle(){
        ob = new Obstacle();
        g2d.drawImage(ob.getImage(),ob.getX(),ob.getY(),null);
    }

    private class AL extends KeyAdapter {
        public void keyReleased(KeyEvent e) {
            p.keyReleased(e);
        }

        public void keyPressed(KeyEvent e) {
            p.keyPressed(e);
        }
    }
}
