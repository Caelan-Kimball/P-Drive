/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncers;

import bouncers.Directions.direction;
import java.awt.*;

/**
 *
 * @author 020281
 */
public class Bouncer_Maldonado extends Bouncer {

    
    private int xPos;
    private int yPos;
    direction moving = direction.SE;
    
    @Override
    public int getX() {
        return xPos;
    }
    /**
     * Returns the y position value of the Bouncer object
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
     * sets position of x
     */
    @Override
    public void setX(int x) {
        xPos = x;
    }
    /**
     * Sets position of y
     */
    @Override
    public void setY(int y) {
        yPos = y;
    }
    /**
     * Sets direction
     */
    @Override
    public void setDirection(direction dir) {
        moving = dir;
    }
    @Override
    /* draws better complex graphics*/
    public void drawBouncer(Graphics g) {
        //head and ears
        g.setColor(Color.orange);
        g.fillOval(xPos, yPos, 25, 25);
        g.setColor(Color.orange);
        g.fillOval(xPos + 18, yPos - 5, 15, 15);
        g.setColor(Color.orange);
        g.fillOval(xPos - 8, yPos - 5, 15, 15);
        //mouth
        g.setColor(Color.black);
        g.drawRect(xPos + 8, yPos + 15, 10, 2);
        g.fillRect(xPos + 8, yPos + 15, 10, 2);
        //ears
        g.setColor(Color.black);
        g.fillOval(xPos + 20, yPos - 3, 10, 10);
        g.setColor(Color.black);
        g.fillOval(xPos - 6, yPos - 3, 10, 10);
        //eyes
        g.setColor(Color.black);
        g.fillOval(xPos + 16, yPos + 5, 4, 4);
        g.setColor(Color.black);
        g.fillOval(xPos + 4, yPos + 5, 4, 4);

        //body
        g.setColor(Color.orange);
        g.drawRect(xPos + 20, yPos + 15, 50, 20);
        g.fillRect(xPos + 20, yPos + 15, 50, 20);

        //legs
        g.setColor(Color.orange);
        g.drawRect(xPos + 19, yPos + 25, 2, 30);

        g.setColor(Color.orange);
        g.drawRect(xPos + 26, yPos + 25, 2, 30);

        g.setColor(Color.orange);
        g.drawRect(xPos + 59, yPos + 25, 2, 30);

        g.setColor(Color.orange);
        g.drawRect(xPos + 66, yPos + 25, 2, 30);

        // words
        g.setColor(Color.black);
        g.drawString("*Excited Screeching*", xPos, yPos - 8);

    }
//updates bounce position

    @Override
    public void update() {
        switch (moving) {
            case SE:
                xPos += 200;
                yPos += 100;
                break;
            case SW:
                xPos -= 200;
                yPos += 100;
                break;
            case NW:
                xPos -= 200;
                yPos -= 100;
                break;
            case NE:
                xPos += 200;
                yPos -= 100;
                break;
        }
    }
}
