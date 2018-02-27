package com.tankgame2;/*
 * Class Tank
 * @author Yunqi Cui
 * 27/02/2018
 */

public class Tank {

    //Tank Position
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    private int y;

    public Tank(int x,int y){
        this.x = x;
        this.y = y;
    }
}
