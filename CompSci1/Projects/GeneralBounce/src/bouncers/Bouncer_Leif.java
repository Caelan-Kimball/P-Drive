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
 * @author 020451
 */
public class Bouncer_Leif extends Bouncer{
    private int yPos;
    private int xPos;
    direction moving = direction.SE;
    
    @Override
    public int getX(){
        return xPos;
    }
    
    /** @return the integer y position value */
    @Override
    public int getY(){
        return yPos;
    }
    
    /** @return  the direction of object */
    @Override
    public direction getDirection() {
         return moving;
    }
    
    /** Sets the x position of Bouncer object*/
    @Override
    public void setX(int x) {
        xPos = x;
    }
    
    /** Sets the y position of Bouncer object*/
    @Override
    public void setY(int y) {
        yPos = y;
    }
    
    /** Set the direction of Bouncer object*/
    @Override
    public void setDirection(direction dir) {
        moving = dir;
    }
    
    @Override
    /** Draw Better Graphics*/   
    public void drawBouncer(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(xPos + 32, yPos -100, 100, 50);
        g.setColor(Color.GRAY);
        g.fillRect(xPos + 32, yPos -100, 5, 125);
        g.setColor(Color.WHITE);
        g.drawString("*", xPos + 40, yPos - 90);
        g.drawString("*", xPos + 45, yPos - 90);
        g.drawString("*", xPos + 50, yPos - 90);
        g.drawString("*", xPos + 55, yPos - 90);
        g.drawString("*", xPos + 60, yPos - 90);
        
        g.drawString("*", xPos + 40, yPos - 85);
        g.drawString("*", xPos + 45, yPos - 85);
        g.drawString("*", xPos + 50, yPos - 85);
        g.drawString("*", xPos + 55, yPos - 85);
        g.drawString("*", xPos + 60, yPos - 85);
        
        g.drawString("*", xPos + 40, yPos - 80);
        g.drawString("*", xPos + 45, yPos - 80);
        g.drawString("*", xPos + 50, yPos - 80);
        g.drawString("*", xPos + 55, yPos - 80);
        g.drawString("*", xPos + 60, yPos - 80);
        
        g.setColor(Color.red);
        g.fillRect(xPos + 72, yPos -100, 60, 10);
        g.fillRect(xPos + 37, yPos -80, 95, 10);
        g.fillRect(xPos + 37, yPos -60, 95, 10);
        g.setColor(Color.WHITE);
        g.fillRect(xPos + 72, yPos -90, 60, 10);
        g.fillRect(xPos + 37, yPos -70, 95, 10);
        g.fillRect(xPos + 37, yPos -50, 95, 10);
        
        g.setColor(Color.BLACK);
        g.fillOval(xPos, yPos, 25, 35);
        g.setColor(Color.WHITE);
        g.fillOval(xPos + 5, yPos + 5, 15, 25);
        g.setColor(Color.ORANGE);
        g.fillOval(xPos - 1, yPos + 30, 8, 15);
        g.fillOval(xPos + 20, yPos + 30, 8, 15);
        g.setColor(Color.BLACK);
        g.fillOval(xPos - 10, yPos + 10, 15, 11);
        g.fillOval(xPos + 19, yPos + 10, 15, 11);
        g.fillOval(xPos, yPos - 10, 25, 25);
        g.setColor(Color.ORANGE);
        g.fillOval(xPos + 7, yPos + 7, 10, 5);
        g.setColor(Color.WHITE);
        g.fillOval(xPos + 5, yPos - 5, 7, 7);
        g.fillOval(xPos + 15, yPos - 5, 7, 7);
        g.setColor(Color.BLACK);
        g.fillOval(xPos + 6, yPos - 3, 3, 3);
        g.fillOval(xPos + 17, yPos - 3, 3, 3);
        g.setColor(Color.BLACK);
    }
    
    @Override 
    /** Update object position*/
    public void update() {
        
        switch(moving) {
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
                break;
             

        }
    }
    
    
    
    
    
}
