/*
 * To change this license header, choose License Headers in Project Properties.
 * 
 */
package bouncers;

import java.awt.Color;
import java.awt.Polygon;
import java.awt.Graphics;

/**
 *
 * @author 020136
 */
public class Bouncer_Eden extends Bouncer {
    
    private int xPos;
    private int yPos;
    
    Directions.direction moving = Directions.direction.SE;
    
    /** @return the integer x value of the position */
    @Override
    public int getX() {
        return xPos;
    }
    /** @return the integer y value of the position */
    @Override
    public int getY() {
        return yPos;
    }
    /** change the current Direction value of the Bouncer object
     * @return  */
    @Override
    public Directions.direction getDirection() {
        return moving;
    }
    @Override
    public void setX(int x) {
        xPos = x;
    }  
    @Override
    public void setY(int y) {
        yPos = y;
    }
     /**
     * @param d */
    @Override
    public void setDirection(Directions.direction d) {
        moving = d;
    }
    
    @Override
    public void drawBouncer(Graphics g) {
        
         g.setColor(new Color(53, 27, 0));
        g.fillOval(xPos+50, yPos+120, 30, 35);
        g.fillOval(xPos+52, yPos+125, 70, 35);
        g.fillOval(xPos+96, yPos+118, 30, 35);
        g.setColor(new Color(74, 37, 0));
        g.fillOval(xPos, yPos,125, 125);
        g.fillOval(xPos+10, yPos-10, 30, 30);
        g.fillOval(xPos+80, yPos-10, 30, 30);
        g.setColor(Color.BLACK);
        g.fillOval(xPos+20, yPos+20, 20, 25);
        g.fillOval(xPos+80, yPos+20, 20, 25);
        g.drawOval(xPos+20, yPos+80, 25, 35);
        g.drawOval(xPos+80, yPos+80, 25, 35);
        Polygon nose =
                new Polygon();
        nose.addPoint(xPos+45, yPos+40);
        nose.addPoint(xPos+75, yPos+40);
        nose.addPoint(xPos+60, yPos+60); 
        g.fillPolygon(nose);
        g.drawLine(xPos+60, yPos+125, xPos+120, yPos+150);
        g.drawLine(xPos+80, yPos+125, xPos+120, yPos+130);
        g.drawLine(xPos+60, yPos+135, xPos+120, yPos+140);
        g.drawLine(xPos+60, yPos+145, xPos+120, yPos+140);
        g.drawLine(xPos+50, yPos+135, xPos+120, yPos+150);
    }
    
    @Override
    public void update() {

    switch(moving) {
            case SE:
                xPos+=10;
                yPos+=15;
                break;
            case SW:
                xPos-=10;
                yPos+=15;
                break;
            case NW:
                xPos-=10;
                yPos-=15;
                break;
            case NE:
                xPos+=10;
                yPos-=15;
                break;
        }
    }
}
