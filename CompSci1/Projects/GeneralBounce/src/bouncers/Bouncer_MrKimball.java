/*
 * 
 * @author ronald.kimball
 * May 7, 2018
 */
package bouncers;

import bouncers.Directions.direction;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * 
 */
public class Bouncer_MrKimball extends Bouncer {
    
    // class variables
    private int xPos;
    private int yPos;    
    direction moving = direction.SE;
    
    // accessor methods
    /** returns the integer x position value of the Bouncer object
     * @return  */
    @Override
    public int getX() {
        return xPos;
    }
    /** returns the integer y position value of the Bouncer object  */
    @Override
    public int getY() {
        return yPos;
    }
    /** returns the direction that a Bouncer object is currently moving 
     * SE = South East,
     * SW = South West,
     * NE = North East,
     * NW = North West
     * @return
     */
    @Override
    public direction getDirection() {
        return moving;
    }
    /** sets the x position value of the Bouncer object
     * @param x */
    @Override
    public void setX(int x) {
        xPos = x;
    }
    /** sets the y position value of the Bouncer object
     * @param y */
    @Override
    public void setY(int y) {
        yPos = y;
    }
    /** change the current Direction value of the Bouncer object
     * @param dir
     */
    @Override
    public void setDirection(direction dir) {
        moving = dir;
    }
    
    @Override
    /** draws better complex graphics */
    public void drawBouncer(Graphics g) {
        
        // make a better graphic
        g.setColor(Color.red);
        g.fillArc(xPos, yPos, 30, 60, 0, 180);
        g.setColor(Color.white);
        g.fillOval(xPos+5, yPos+5, 10, 15);
        g.fillOval(xPos+15, yPos+5, 10, 15);
        g.setColor(Color.black);
        g.fillOval(xPos+7, yPos+8, 5, 5);
        g.fillOval(xPos+17, yPos+8, 5, 5);
    }
    
    @Override
    /** updates position of a Bouncer_MrKimball object */
    public void update() {
    
        switch(moving) {
            case SE:
                xPos++;
                yPos++;
                break;
            case SW:
                xPos--;
                yPos++;
                break;
            case NW:
                xPos--;
                yPos--;
                break;
            case NE:
                xPos++;
                yPos--;
                break;
        }
    } // end of update()
    
}
