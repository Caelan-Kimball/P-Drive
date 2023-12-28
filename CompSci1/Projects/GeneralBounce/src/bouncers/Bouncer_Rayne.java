/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncers;

import bouncers.Directions.direction;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

/**
 *
 * @author 019125
 */
public class Bouncer_Rayne extends Bouncer {

    private int xPos;
    private int yPos;
    direction moving = direction.SE;

    /**
     * @return the integer x position value of the Bouncer object
     */
    @Override
    public int getX() {
        return xPos;
    }

    /**
     * @return the integer y position value of the Bouncer object
     */
    @Override
    public int getY() {
        return yPos;
    }

    @Override
    public direction getDirection() {
        return moving;
    }

    /**
     * sets the value of x position of a Bouncer object
     */
    @Override
    public void setX(int x) {
        xPos = x;
    }

    /**
     * sets the value of y position of a Bouncer object
     */
    @Override
    public void setY(int y) {
        yPos = y;
    }

    @Override
    public void setDirection(direction dir) {
        moving = dir;
    }

    public void drawBouncer(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(xPos, yPos, 30, 30);
        g.fillOval(xPos - 10, yPos + 25, 45, 45);
        g.fillOval(xPos - 17, yPos + 60, 60, 60);

        //eyes
        g.setColor(Color.black);
        g.fillOval(xPos + 8, yPos + 5, 5, 5);
        g.fillOval(xPos + 17, yPos + 5, 5, 5);

        //buttons
        g.fillOval(xPos + 9, yPos + 33, 10, 10);
        g.fillOval(xPos + 9, yPos + 50, 10, 10);
        g.fillOval(xPos + 9, yPos + 65, 10, 10);

        //arms
        g.setColor(Color.black);
        g.drawLine(xPos + 33, yPos + 50, xPos + 60, yPos + 30);
        g.drawLine(xPos - 10, yPos + 50, xPos - 37, yPos + 30);

        g.setColor(Color.black);
        g.fillRect(xPos + 1, yPos - 31, 30, 30);
        g.fillRect(xPos - 9, yPos - 10, 50, 10);

        g.setColor(Color.orange);

        Polygon nose = new Polygon();

        nose.addPoint(xPos - 10, yPos + 15);
        nose.addPoint(xPos + 5, yPos + 10);
        nose.addPoint(xPos + 5, yPos + 20);
        g.drawPolygon(nose);
        g.fillPolygon(nose);
    }

    @Override
    /**
     * updates position of a Bouncer_Rayne object
     */
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
