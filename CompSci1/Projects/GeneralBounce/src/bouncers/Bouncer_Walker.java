/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncers;

import bouncers.Directions.direction;
import java.awt.*;
import java.awt.Graphics;

/**
 *
 * @author 020203
 */
public class Bouncer_Walker extends Bouncer {
    //class variables
    private int xPos;
    private int yPos;
    Directions.direction moving = Directions.direction.SE;
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
    /** sets the value of the x Position of a Bouncer object */
    @Override
    public void setX(int x) {
        xPos = x;
    }
    /** sets the value of the y Position of a Bouncer object */
    @Override
    public void setY(int y) {
        yPos = y;
    }
    @Override
    public void setDirection(direction dir) {
        moving = dir;
    }
    /** draws better complex graphics */
    public void drawBouncer(Graphics g) {
        
        // make a better graphic
        g.setColor(Color.yellow);
        g.fillArc(xPos, yPos, 50, 50, 45, 270);
        g.setColor(Color.black);
        g.fillOval(xPos + 15, yPos + 10, 10, 10);
        g.fillOval(xPos + 55, yPos + 22, 10, 10);
        g.fillOval(xPos + 70, yPos + 22, 10, 10);
        g.fillOval(xPos + 85, yPos + 22, 10, 10);
    }
    
    @Override
    /** updates position of a Bouncer object */
    public void update() {
        
        switch(moving) {
            case SE:
            xPos+=5;
            yPos+=5;
            break;
            case SW:
            xPos-=5;
            yPos+=5;
            break;
            case NE:
            xPos+=5;
            yPos-=5;
            break;
            case NW:
            xPos-=5;
            yPos-=5;
            break;
        }
    }// end of update()
}
