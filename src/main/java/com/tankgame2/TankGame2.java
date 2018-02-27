package com.tankgame2;/*
 * TankGame Version1
 * @author Yunqi Cui
 * 27/02/2018
 * @version 1.0
 */


import com.tankgame1.MyGraph;

import javax.swing.*;

public class TankGame2 extends JFrame {

    MyGraph mg = new MyGraph();

    public static void main(String[] args) {

        TankGame2 tg2 = new TankGame2();

    }

    public TankGame2() {

        this.add(mg);
        this.setTitle("Tank Game");
        this.setSize(400, 300);
        this.setLocation(200, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }


}
