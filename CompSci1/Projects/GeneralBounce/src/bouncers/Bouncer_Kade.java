/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncers;

import java.awt.Color;
import java.awt.Graphics;
import bouncers.Directions.*;

/**
 *
 * @author 019446
 */
public class Bouncer_Kade extends Bouncer {

    private int xPos;
    private int yPos;
    direction moving = direction.SE; 
    
   public int getX(){
        return xPos;
    }
    public int getY(){
        return yPos;
    }
      public void setX(int x){
        xPos = x;
    }
    
    public void setY(int y){
        yPos = y;
    }
    public direction getDirection() {
        return moving;
    }
    /** draw the generic bouncer shape */
    public void setDirection(direction d){
        moving = d;
    }
    

    
    
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
    
    @Override
    public void drawBouncer(Graphics g){
         g.setColor(Color.yellow);
    g.fillOval(xPos, yPos, 25, 25);
    g.setColor(Color.red);
    g.fillOval(xPos + 25, yPos, 10, 10);
    g.setColor(Color.green);
    g.fillOval(xPos, yPos + 30, 10, 10);
    g.setColor(Color.orange);
    g.fillOval(xPos, yPos + 50, 15, 15);
    g.setColor(Color.blue);
    g.fillOval(xPos-35, yPos + 20, 10, 10);
    //repaint();
    }
    
    
}
