/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncers;

import bouncers.Directions.direction.*;
import java.awt.*;
import java.awt.Graphics;

/**
 *
 * @author 020147
 */
public class Bouncer_TY extends Bouncer {
 private int xPos;
 private int yPos;
 Directions.direction moving = Directions.direction.SE;
 @Override
  public int getX(){
     return xPos;
 }
   @Override
  public int getY(){
     return yPos;
 }
   @Override
  public Directions.direction getDirection(){
     return moving;
  }
   @Override
  public void setX(int x){
      xPos = x;
  }
   @Override
    public void setY(int y){
      xPos = y;
  }
     @Override
    public void setDirection(Directions.direction dir){
        moving = dir;
    }
 
 
 
 
 
  @Override
 public void drawBouncer (Graphics g){
       g.setColor(Color.green);
    g.fillRect(xPos, yPos, 80, 100);
    g.fillOval(xPos, yPos-20, 80, 40);
    g.setColor(Color.black);
    g.fillOval(xPos+10,yPos,20,20);
    g.fillOval(xPos+40,yPos,20,20);
    g.fillArc(xPos+20, yPos+40, 30, 20,180, 180);
    g.setColor(Color.white);
    g.fillOval(xPos+12,yPos+5,10,10);
    g.fillOval(xPos+42,yPos+5,10,10);
}
 
  @Override
  public void update(){
     switch(moving){
    case SE:
    xPos+=10;
    yPos+=10;
    break;
    case SW:
    xPos-=10;
    yPos+=10;
    break;
    case NE:
    xPos+=10;
    yPos-=10;
    break;
    case NW:
    xPos-=10;
    yPos-=10;
    break;
     }
  }
}
