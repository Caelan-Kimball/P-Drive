/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncers;

import bouncers.Directions.direction;
import java.awt.Graphics;

/**
 *
 * @author Caelan Kimball
 */
public class Bouncer {

    //class variables
    private int xPos;
    private int yPos;
    direction moving = direction.SE;

    public int getX() {
        return xPos;
    }

    public int getY() {
        return yPos;
    }

    /**
     * @return the current direction value of the Bouncer Object
     */
    public direction getDirection() {
        return moving;
    }

    public void setX(int x) {
        xPos = x;
    }

    public void setY(int y) {
        yPos = y;
    }

    /**
     * change the current direction value of the bouncer object
     *
     * @param d
     */
    public void setDirection(direction d) {
        moving = d;
    }

    public void drawBouncer(Graphics g) {
        g.fillOval(xPos, yPos, 25, 25);
    }

    /**
     * updates position of a Bouncer object
     */
    public void update() {
        switch (moving) {
            case SE:

                xPos += 5;
                yPos += 5;
                break;
            case SW:

                xPos -= 5;
                yPos += 5;
                break;
            case NW:

                xPos -= 5;
                yPos -= 5;
                break;
            case NE:

                xPos += 5;
                yPos -= 5;
                break;

        }
    }
}
