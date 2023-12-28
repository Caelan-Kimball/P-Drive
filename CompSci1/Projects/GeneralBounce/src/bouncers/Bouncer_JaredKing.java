package bouncers;

import bouncers.Directions.*;
import java.awt.*;


/**
 * @author Jared King
 */
public class Bouncer_JaredKing extends Bouncer{
    
    private int xPos;
    private int yPos;
    direction moving = direction.SE;
    boolean wac = false;
    int delay = 0;
    
    @Override
    public int getX(){
        return xPos;
    }
    public int getY(){
        return yPos;
    }
    /* @return the current Direction value of the Bouncer object */
    public direction getDirection(){
        return moving;
    }
    /* change the current Direction value of the Bouncer object 
    * @param d
    */
    public void setDirection(direction d){
        moving = d;
    }
    
    public void drawBouncer(Graphics g){
        //better graphic (ghost)
        g.setColor(Color.PINK);
        g.fillArc(xPos, yPos, 30, 60, 0, 180);
        g.setColor(Color.white);
        g.fillOval(xPos+5, yPos+5, 10, 15);
        g.fillOval(xPos+15, yPos+5, 10, 15);
        g.setColor(Color.black);
        g.fillOval(xPos+7, yPos+8, 5, 5);
        g.fillOval(xPos+17, yPos+8, 5, 5);
        
        //pac-man
        g.setColor(Color.YELLOW);
        if(moving != direction.NE || moving != direction.NW){
            if(wac && delay < 50000){
                delay++;
                g.fillArc(xPos+35, yPos, 30, 30, 220, 280);
                wac = false;
            }
            else{
                delay++;
                g.fillArc(xPos+35, yPos, 30, 30, 40, 360);
                wac = true;
                if(delay>633)
                    delay =0;
            }
        }
        else{
            
        }
    }
    
    public void update(){
        
        switch(moving){
            case SE:
                xPos+=7;
                yPos+=7;
                break;
            case SW:
                xPos-=7;
                yPos+=7;
                break;
            case NW:
                xPos-=7;
                yPos-=7;
                break;
            case NE:
                xPos+=7;
                yPos-=7;
                break;
            }
    }
}
