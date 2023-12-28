/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncers;
import java.awt.Color;
import java.awt.Graphics;
import bouncers.Directions.direction;

/**
 *
 * @author 020031
 */
public class Bouncer_Sean extends Bouncer {
    private int xPos;
    private int yPos;
    /* 
    accessor
    */
    
    
    @Override
    public int getX()
    {
        return xPos;
    }
    @Override
    public int getY()
    {
        return yPos;
    }
    
    @Override
    public direction getDirection() {
        return moving;
    }
    
    public void setX(int x) {
        xPos = x;
    }
    public void setY(int y) {
        yPos = y;
    }
    /** change the current direction value of the bouncer object
     * @param g 
     */
    
    @Override
    public void drawBouncer(Graphics g){
        g.setColor(Color.red);
        g.fillOval(xPos, yPos, 25, 25);
        g.setColor(Color.BLACK);
        g.fillOval(xPos, yPos, 5, 5);
    }
    @Override
    public void update(){
        switch(moving)
        {
            case SE:
          
                xPos += 5;
                yPos += 5;
                break;
            
            case SW: 
                            
                xPos -= 5;
                yPos += 5;
                break;
             
            case NW:
                
                xPos -= 5;
                yPos -= 5;
                break;
                
            case NE:
                
                xPos += 5;
                yPos -= 5;
                break;
        

        }
    }
}

