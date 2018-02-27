package com.tankgamev1;/*
 * Class Tank
 * @author Yunqi Cui
 * 27/02/2018
 */


public class Tank {

    //Tank Position
    public int x;
    public int y;
    public int type;


    public Tank(int x,int y){
        this.x = x;
        this.y = y;
    }

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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }



}
