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
 * @author 020176
 */
public class Bouncer_Luke extends Bouncer{
    private int xPos;
    private int yPos;
    direction moving = direction.SE;
    
     /** @returns the integer x position value of the bouncer object*/
    @Override
    public int getX() {
        return xPos; 
    }
    /** @returns the integer y position value of the bouncer object*/
    @Override
    public int getY() {
        return yPos;
    }
    @Override
    public direction getDirection() {
        return moving;
    }
    /** sets the integer of the x position value of a bouncer object*/
    @Override
    public void setX(int x) {
        xPos = x;
    } 
    /** sets the integer of the x position value of a bouncer object*/
    @Override
    public void setY(int y) {
        yPos = y;
    }
    @Override
    public void setDirection(direction z) {
        moving = z;
        
    }
    
    @Override
        public void drawBouncer(Graphics g) {
        g.setColor(Color.black);
        g.fillOval(xPos, yPos, 25, 33);
        g.fillOval(xPos + 2, yPos - 15, 20, 20);
        g.drawLine(xPos+3, yPos+5, xPos-5, yPos-5);
        g.drawLine(xPos+2, yPos+10, xPos-6, yPos-1);
        g.drawLine(xPos+1, yPos+14, xPos-7, yPos+3);
        g.drawLine(xPos, yPos+18, xPos-8, yPos+6);
        g.drawLine(xPos+20, yPos+6, xPos+28, yPos-6);
        g.drawLine(xPos+22, yPos+12, xPos+31, yPos-3);
        g.setColor(Color.red);
        g.drawOval(xPos+18, yPos+8, 20, 20);
        g.drawString("Battle Scars", xPos+30, yPos-5);
        g.drawLine(xPos+35, yPos-3, xPos+28, yPos+10);
    }
    @Override
    public void update() {
        
        switch(moving) {
            case SE:
                xPos+=11;
                yPos+=9;
                break;
            case SW: 
                xPos-=10;
                yPos+=10;
                break;
            case NE:
                xPos+=9;
                yPos-=11;
                break;
            case NW: 
                xPos-=8;
                yPos-=12;
                break;
        }
    }
}    
    

