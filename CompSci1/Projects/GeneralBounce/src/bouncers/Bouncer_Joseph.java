/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncers;

import bouncers.Directions.*;

import java.awt.Graphics;

/**
 *
 * @author 019196
 */
public class Bouncer_Joseph extends Bouncer {

    private int xPos;
    private int yPos;
    direction moving = direction.SE;

    @Override
    public int getX() {
        return xPos;
    }

    @Override
    public int getY() {
        return yPos;
    }

    @Override
    public direction getDirection() {
        return moving;
    }

    @Override
    public void setX(int x) {
        xPos = x;
    }

    @Override
    public void setY(int y) {
        yPos = y;

    }

    public void setDirection(direction dir) {
        moving = dir;
    }

    @Override
    public void drawBouncer(Graphics g) {

    }

    @Override
    public void update() {

        switch (moving) {
            case SE:
                xPos += 3;
                yPos += 3;
                break;
            case SW:
                xPos -= 3;
                yPos += 3;
                break;
            case NE:
                xPos += 3;
                yPos -= 3;
                break;
            case NW:
                xPos -= 3;
                yPos -= 3;
                break;

        }
    }
}
