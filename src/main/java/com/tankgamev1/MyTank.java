package com.tankgamev1;/*
 * Class MyGraph to draw Tank
 * @author Yunqi Cui
 * 27/02/2018
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyTank extends JPanel implements KeyListener {

    private PlayerTank pt;
    public int x=0;
    public int y=0;

    public MyTank() {
        pt = new PlayerTank(100, 100);
        x=pt.getX();
        y=pt.getY();
        this.pt.setType(1);
    }

    public void paint(Graphics g) {

        super.paint(g);
        this.drawGameField(g);
        this.drawTank(pt.getX(), pt.getY(), g, pt.getDirect(), pt.getType());
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
                g.fillOval(x + 5, y + 10, 10, 10);
                //UpLine
                g.drawLine(x + 10, y + 15, x+10, y);
                break;

            case 1:
                //Up Rectangular
                g.fill3DRect(x, y, 30, 5, false);
                //Middle Rectangular
                g.fill3DRect(x + 5, y + 5, 20, 10, false);
                //Down Rectangular
                g.fill3DRect(x, y+15, 30, 5, false);
                //Circle
                g.fillOval(x + 10, y + 5, 10, 10);
                //RightLine
                g.drawLine(x + 15, y + 10, x+30, y+10);
                break;

            case 2:
                //Left Rectangular
                g.fill3DRect(x, y, 5, 30, false);
                //Middle Rectangular
                g.fill3DRect(x + 5, y + 5, 10, 20, false);
                //Right Rectangular
                g.fill3DRect(x + 15, y, 5, 30, false);
                //Circle
                g.fillOval(x + 5, y + 10, 10, 10);
                //DownLine
                g.drawLine(x + 10, y + 15, x+10, y+30);
                break;

            case 3:
                //Up Rectangular
                g.fill3DRect(x, y, 30, 5, false);
                //Middle Rectangular
                g.fill3DRect(x + 5, y + 5, 20, 10, false);
                //Down Rectangular
                g.fill3DRect(x, y+15, 30, 5, false);
                //Circle
                g.fillOval(x + 10, y + 5, 10, 10);
                //LeftLine
                g.drawLine(x + 15, y + 10, x, y+10);
                break;
                }
    }


    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {


        if(e.getKeyCode()==KeyEvent.VK_UP || e.getKeyCode()==KeyEvent.VK_W){

            pt.setDirect(0);
            pt.moveUp();

            }else if(e.getKeyCode()==KeyEvent.VK_RIGHT || e.getKeyCode()==KeyEvent.VK_D ){

            pt.setDirect(1);
            pt.moveRight();

        }else if(e.getKeyCode()==KeyEvent.VK_DOWN || e.getKeyCode()==KeyEvent.VK_S){

            pt.setDirect(2);
            pt.moveDown();

        }else if(e.getKeyCode()==KeyEvent.VK_LEFT || e.getKeyCode()==KeyEvent.VK_A){

            pt.setDirect(3);
            pt.moveLeft();

        }else{
            System.out.println("Not a direction key");
        }
        this.repaint();
        }

    public void keyReleased(KeyEvent e) {

    }
}