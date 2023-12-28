/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncers;
import bouncers.Directions.direction;


/**
 *
 * @author 019118
 */
public class Bouncer_SethWilliams extends Bouncer{
    private int xPos;
    private int yPos;
    direction moving = direction.SE;
 /** @return the integer x position value of the Bouncer object */
    public int getX(){
        return xPos;
    }
    /** @return the integer y position value of the Bouncer object */
        public int getY(){
            return yPos;
        }
        public direction getDirection(){
            return moving;
    }
   
    @Override
    public void setX(int x){
        xPos = x;
    }
    public void setY(int y){
        yPos = y;
    }
    public void setDirection(direction dir){
        moving = dir;
    }
    
    /** draws better complex graphics */
    public void update(){
    switch (moving){
case SE:
    xPos+=3;
    yPos+=3;
    break;
case SW:
    xPos-=3;
    yPos+=3;
case NE:
    xPos+=3;
    yPos-=3;
case NW:
    xPos-=3;
    yPos-=3;
    break;

}
    }
}
