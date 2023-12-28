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
 * @author 020223
 */
public class Bouncer_kriegen extends Bouncer {

private int xPos;
private int yPos;
direction moving = direction.SE;
@Override
public int getX(){
    return xPos;
}
/**@return the integer y position value of the Bouncer object*/
@Override
public int getY(){
    return yPos;
}
@Override
public direction getDirection(){
    return moving;
}
/** sets the position of the bouncer objec
     * @param xt*/
@Override
public void setX(int x){
    xPos = x;
}
/** sets the position of the bouncer objec
     * @param yt*/
@Override
public void setY(int y){
    yPos = y;
}
@Override
public void setDirection(direction dir){
    moving = dir;
}

@Override
               public void drawBouncer(Graphics g){
    g.fillOval(xPos,yPos,25,25);
    
    g.setColor(Color.black);
        g.fillOval(xPos, yPos, 100, 25);
        g.setColor(Color.white);
        g.fillOval(xPos+20, yPos -10, 60, 25);
        
        g.setColor(Color.cyan);
        g.fillOval(xPos+35, yPos +15, 30, 25);
        g.fillOval(xPos+25, yPos +35, 55, 25);
        g.fillOval(xPos+15, yPos +55, 80, 25);
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
