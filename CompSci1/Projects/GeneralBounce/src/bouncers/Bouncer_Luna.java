/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncers;
import bouncers.Directions.direction;
import java.awt.*;
import java.awt.Color;
/**
 *
 * @author 019250
 */
public class Bouncer_Luna extends Bouncer{
    
    private int xPos;
    private int yPos;
    direction moving = direction.SE;
    
    /** @return the integer xPos(x position) value of the Bouncer object */
    @Override
    public int getX(){
        return xPos;
    }
    /** @return the integer xPos(y position) value of the Bouncer object */
    @Override
    public int getY(){
        return yPos;
    }
    @Override
    public direction getDirection(){
        return moving;
    }
    /** sets the value of the x position of a Bouncer object
     * @param x */
    @Override
    public void setX(int x){
        xPos = x;
    }
    /** sets the value of the y position of a Bouncer object
     * @param y */
    @Override
    public void setY(int y){
        yPos = y;
    }
    
    @Override
     public void setDirection(direction dir){
        moving = dir;
    }
    
    @Override
     public void drawBouncer(Graphics g) {
         
         g.setColor(Color.green);
         g.fillRect(xPos+10, yPos+5, 5, 150);
         g.setColor(Color.yellow);
         g.fillOval(xPos, yPos, 25, 50);
         g.fillOval(xPos, yPos, 50, 25);
         g.fillOval(xPos, yPos-25, 25, 50);
         g.fillOval(xPos-25, yPos, 50, 25);
         
         g.setColor(Color.white);
         g.fillOval(xPos, yPos, 25, 25);
     }
      
    /** updates position of a Bouncer_Luna object*/
     @Override
    public void update(){
        switch(moving){
            case SE: 
                xPos++;
                yPos++;
                break;
            case SW:
                xPos--;
                yPos++;
                break;
            case NE:
                xPos++;
                yPos--;
                break;
            case NW:
                xPos--;
                yPos--;
                break;
        }
    }
}
