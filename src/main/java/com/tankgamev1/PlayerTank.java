package com.tankgamev1;/*
 * Class PlayerTank
 * @author Yunqi Cui
 * 27/02/2018
 */


public class PlayerTank extends Tank{

    //up:0 right:1 down:2 left:3
    private int direct=0;
    private int speed=5;

    public PlayerTank(int x, int y) {
        super(x, y);
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void moveUp(){
        this.y-=speed;
    }

    public void moveRight(){
        this.x+=speed;
    }

    public void moveDown(){
        this.y+=speed;
    }

    public void moveLeft(){
        this.x-=speed;
    }

}
