package faces;

import java.awt.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 020173
 */
public class DanesFace extends Face{
    private int xOffset;
    private int yOffset;
    
    public DanesFace(){
        
    }
    
    public DanesFace(Graphics g) {
        super(g);
    }
    
    public DanesFace(int x, int y, Graphics g){
        xOffset = x;
        yOffset = y;
        drawEyes(g);
        drawNose(g);
        drawMouth(g);
    }
    
    
    public void drawEyes(Graphics g){
        g.setColor(Color.black);
        
        g.drawLine(225/2+xOffset, 175/2+yOffset, 350/2+xOffset, 250/2+yOffset);
        g.drawLine(350/2+xOffset, 175/2+yOffset, 225/2+xOffset, 250/2+yOffset);
        g.drawLine(450/2+xOffset, 175/2+yOffset, 575/2+xOffset, 250/2+yOffset);
        g.drawLine(575/2+xOffset, 175/2+yOffset, 450/2+xOffset, 250/2+yOffset);
    }
    
    public void drawMouth(Graphics g){
        g.fillOval(327/2+xOffset, 370/2+yOffset, 150/2, 130/2);
    }
    
    public void drawNose(Graphics g){
        Polygon nose = new Polygon();
        nose.addPoint(350/2+xOffset, 340/2+yOffset);
        nose.addPoint(450/2+xOffset, 340/2+yOffset);
        nose.addPoint(400/2+xOffset, 270/2+yOffset);
        g.fillPolygon(nose);
    }
    
}
