/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncers;

import bouncers.Directions.direction;
import java.awt.Color;
import java.awt.Graphics;
/**
 *
 * @author 020125
 */
public class Bouncer_Wesley extends Bouncer{
     private int xPos;
    private int yPos;
    
     @Override
    public int getX(){
        return xPos;
    }
    
     @Override
    public int getY(){
       return yPos; 
    }
    
     @Override
    public direction getDirection(){
        return moving;
    }
    
     @Override
        public void setX(int x){
        xPos = x;
    }
    
     @Override
    public void setY(int y){
        yPos = y;
    }
    
     @Override
    public void setDirection(Directions.direction d){
    moving = d;
    }
    @Override
    public void drawBouncer(Graphics g){
         g.setColor(Color.red);
    g.fillOval(xPos, yPos, 35, 35);
    g.setColor(Color.black);
    g.fillOval(xPos + 6 , yPos + 10, 7, 7);
    g.fillOval(xPos + 21, yPos + 10, 7, 7);
    g.fillOval(xPos + 13, yPos + 20, 10, 10);
    }
    
    public void update(){
        switch(moving)
     {
         case NW:
             xPos -= 15;
             yPos -= 15;
             
             break;
             
         case NE:
             xPos += 15;
             yPos -= 15;
             
             break;
        
         case SW:
             xPos -= 15;
             yPos += 15;
             
             break;
             
         case SE:
             xPos += 15;
             yPos += 15;
             
             break;
             
     } 
    }
}
