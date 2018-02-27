package com.tankgame2;/*
 * Class MyGraph to draw Tank
 * @author Yunqi Cui
 * 27/02/2018
 */

import javax.swing.*;
import java.awt.*;

public class MyGraph extends JPanel {

    private PlayerTank pt;

    public MyGraph() {
        pt = new PlayerTank(10, 10);
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
                g.drawLine(x + 10, y + 15, 20, 10);

        }
    }


}
