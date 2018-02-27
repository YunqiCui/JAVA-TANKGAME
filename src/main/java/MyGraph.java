/*
 * Class MyGraph to draw Tank
 * @author Yunqi Cui
 * 27/02/2018
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyGraph extends JPanel implements KeyListener {

    private PlayerTank pt;
    int x=0;
    int y=0;

    public MyGraph() {
        pt = new PlayerTank(10, 10);
        x=pt.getX();
        y=pt.getY();
    }

    public void paint(Graphics g) {

        super.paint(g);
        this.drawGameField(g);
        this.drawTank(pt.getX(), pt.getY(), g, 0, 1);
    }

    public void drawGameField(Graphics g) {
        g.fillRect(0, 0, 400, 300);
    }

    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        //Tpye of Tank
        switch (type) {
            case 0:
                g.setColor(Color.cyan);
                break;

            case 1:
                g.setColor(Color.yellow);
                break;
        }
        switch (direct) {
            case 0:
                //Left Rectangular
                g.fill3DRect(x, y, 5, 30, false);
                //Middle Rectangular
                g.fill3DRect(x + 5, y + 5, 10, 20, false);
                //Right Rectangular
                g.fill3DRect(x + 15, y, 5, 30, false);
                //Circle
                g.fillOval(x + 7, y + 10, 6, 10);
                //Line
                g.drawLine(x + 10, y + 15, x+10, y);

        }
    }


    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {


        if(e.getKeyCode()==KeyEvent.VK_DOWN){
            System.out.println("Down");
            pt.setY(y+=5);
        }else if(e.getKeyCode()==KeyEvent.VK_UP){
            System.out.println("Up");
            pt.setY(y-=5);
        }else if(e.getKeyCode()==KeyEvent.VK_LEFT){
            System.out.println("Left");
            pt.setX(x-=5);
        }else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            System.out.println("Right");
            pt.setX(x+=5);
        }else{
            System.out.println("Not a direction key");
        }
        this.repaint();

    }

    public void keyReleased(KeyEvent e) {

    }
}
