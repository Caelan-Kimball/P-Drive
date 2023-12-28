/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncers;

import java.awt.Color;
import java.awt.Polygon;
import java.awt.Graphics;

public class Bouncer_Eliana extends Bouncer {
    
    private int xPos;
    private int yPos;
    Directions.direction moving = Directions.direction.SE;
    
    @Override
    public int getX() {
        return xPos;
    }
    @Override
    public int getY() {
        return yPos;
    }
    @Override
    public Directions.direction getDirection() {
        return moving;
    }
    @Override
    public void setDirection(Directions.direction d) {
        moving = d;
    }
    
    @Override
    public void drawBouncer(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(xPos, yPos, 75, 75);
        g.setColor(Color.RED);
        g.fillOval(xPos, yPos, 50, 50);
        g.setColor(Color.CYAN);
        g.fillOval(xPos, yPos, 25, 25);
    }
    @Override
    public void update() {
         switch(moving) {
            case SE:
                xPos++;
                yPos++;
                break;
            case SW:
                xPos--;
                yPos++;
            case NW:
                xPos--;
                yPos--;
            case NE:
                xPos++;
                yPos--;
        }
    }
    
    
}
