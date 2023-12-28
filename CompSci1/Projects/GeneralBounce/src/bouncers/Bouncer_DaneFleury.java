/*
 * To change this license header, choose License Headers in Project Properties.
 * @author Dane Fleury
 */
package bouncers;

import bouncers.Directions.direction;
import java.awt.*;
/**
 *
 * 
 */
public class Bouncer_DaneFleury extends Bouncer {
    
    private int xPos;
    private int yPos;
    direction moving = direction.SE;
    
   /**return the integer x value of the position*/
    @Override
    public int getX() {
        return xPos;
    }
    /**return the integer y value of the position*/
    @Override
    public int getY() {
        return yPos;
    }
    /** @return the current direction value of the bouncer object.*/
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

    /** change the current direction value of the bouncer object
     * @param d
     */
   
    @Override
    public void setDirection(direction d) {
        moving = d;
    }
    
    @Override
    public void drawBouncer(Graphics g) {
        
        g.setColor(Color.white);
        g.fillOval(xPos + 1, yPos + 1, 25, 25);
        //ears
        g.setColor(Color.black);
        g.fillOval(xPos, yPos, 7, 7);
        g.fillOval(xPos + 19, yPos, 7, 7);
        //eyes
        g.fillOval(xPos + 3, yPos + 5, 10, 10);
        g.fillOval(xPos + 13, yPos + 5, 10, 10);
        //pupils
        g.setColor(Color.white);
        g.fillOval(xPos + 6, yPos + 9, 3, 3);
        g.fillOval(xPos + 16, yPos + 9, 3, 3);
        //mouth
        g.setColor(Color.black);
        g.fillArc(xPos + 9, yPos + 15, 8, 8, 0, -180);
    }
    
    public void update(){
        switch(moving){
            case SE:
                xPos += 2;
                yPos += 2;
                break;
            case SW:
                xPos -= 2;
                yPos += 2;
                break;
            case NW:
                xPos -= 2;
                yPos -= 2;
                break;
            case NE:
                xPos += 2;
                yPos -= 2;
                break;
        }
    }

}
