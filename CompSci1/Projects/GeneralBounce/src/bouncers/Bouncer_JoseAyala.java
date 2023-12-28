/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncers;

import bouncers.Directions.direction;
import java.awt.Color;
import static java.awt.image.ImageObserver.ABORT;
import java.awt.Graphics;

/**
 *
 * @author 020459
 */
public class Bouncer_JoseAyala extends Bouncer {

    private int xPos;
    private int yPos;

    direction moving = direction.SE;

    /**
     * /**@return the integer x position value of the Bouncer object
     *
     * @return
     */
    @Override
    public int getX() {
        return xPos;
    }

    /**
     * /**@return the integer y position value of the Bouncer objec
     *
     * @return t
     */
    @Override
    public int getY() {
        return yPos;
    }

    @Override
    public direction getDirection() {
        return moving;
    }

    //* sets the value of the x position of a Bouncer object*/
    @Override
    public void setX(int x) {
        xPos = x;
    }

    //* sets the value of the y position of a Bouncer object*/
    @Override
    public void setY(int y) {
        yPos = y;
    }

    @Override
    public void setDirection(direction dir) {
        moving = dir;
    }

    @Override
    public void drawBouncer(Graphics g) {
        g.setColor(Color.RED);
        g.fillArc(xPos, yPos, 50, 50, ABORT, -350);
        g.setColor(Color.BLACK);
        g.fillOval(xPos, yPos, 10, 10);
    }

    @Override
    public void update() {

        switch (moving) {
            case SE:
                xPos += 6;
                yPos += 6;
                break;
            case SW:
                xPos -= 6;
                yPos += 6;
                break;
            case NE:
                xPos += 6;
                yPos -= 6;
                break;
            case NW:
                xPos -= 6;
                yPos -= 6;

        }
    }
}
