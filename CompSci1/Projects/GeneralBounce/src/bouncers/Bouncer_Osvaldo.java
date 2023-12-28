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
 * @author 020034
 */
public class Bouncer_Osvaldo extends Bouncer {
    private int xPos;
    private int yPos;
    direction moving = direction.SE;
    
     /** @return the integer xPos value of the Bouncer object */
   @Override
    public int getX() {
        return xPos;
    }
    public int getY() {
        return yPos;
    }
    public direction getDirection(){
        return moving;
    }
    /** sets the value of the x position of a Bouncer object */
    public void setX(int x) {
        xPos = x;
    } 
    public void setY(int y) {
        yPos = y;
    }
    public void setDirection(direction dir) {
        moving = dir;
    }
    
    @Override
    public void drawBouncer(Graphics g) {
    g.setColor(new Color(0, 128, 128)); 
    g.fillRect(xPos, yPos, 25, 25);
    g.fillArc(xPos, yPos, 70, 80, 80, 70);
    }
    
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