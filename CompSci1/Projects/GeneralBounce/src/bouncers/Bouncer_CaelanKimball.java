/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncers;

import java.awt.Color;
import java.awt.Graphics;
import bouncers.Directions.direction;

/**
 *
 * @author 020022
 */
public class Bouncer_CaelanKimball extends Bouncer {

    private int xPos;
    private int yPos;

    //accessor methods
    @Override
    public int getX() {
        return xPos;
    }

    @Override
    public int getY() {
        return yPos;
    }

    /**
     * @return the current direction value of the Bouncer Object
     */
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

    /**
     * change the current direction value of the bouncer object
     *
     * @param d
     */
    @Override
    public void setDirection(direction d) {
        moving = d;
    }

    public void drawBouncer(Graphics g) {
        g.setColor(new Color(210, 180, 140));
        g.fillOval(xPos, yPos, 25, 25);
        g.setColor(Color.WHITE);
        g.fillOval(xPos + 5, yPos + 10, 5, 5);
        g.setColor(Color.WHITE);
        g.fillOval(xPos + 15, yPos + 10, 5, 5);
        g.setColor(Color.WHITE);
        g.fillOval(xPos + 10, yPos + 5, 5, 5);
        g.setColor(Color.BLACK);
        g.fillOval(xPos + 9, yPos + 15, 7, 7);
        g.setColor(Color.BLACK);
        g.fillOval(xPos + 11, yPos + 6, 3, 3);
    }

    @Override
    /**
     * updates position of a Bouncer object
     */
    public void update() {
        switch (moving) {
            case SE:

                xPos += 15;
                yPos += 15;
                break;
            case SW:

                xPos -= 15;
                yPos += 15;
                break;
            case NW:

                xPos -= 15;
                yPos -= 15;
                break;
            case NE:

                xPos += 15;
                yPos -= 15;
                break;

        }
    }
}
