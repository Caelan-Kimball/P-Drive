package faces;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

/**
 *
 * @author Jared King
 */
public class JaredFace extends Face{
    private int xOffset;
    private int yOffset;
    
    public JaredFace(){
        
    }
    public JaredFace(Graphics g) {
        drawFace(g);
    }
    public JaredFace(int x, int y, Graphics g) {
        xOffset = x;
        yOffset = y;
        drawFace(g);
    }
    @Override
    public void drawFace(Graphics g){
        drawEyes(g);
        drawNose(g);
        drawMouth(g);
    }
    @Override
    public void drawEyes(Graphics g){
        g.setColor(Color.BLACK);
        g.fillOval(135 + xOffset, 160 + yOffset, 50/2, 35/2);
        g.fillOval(265 + xOffset, 160 + yOffset, 50/2, 35/2);
    }
    @Override
    public void drawNose(Graphics g){
        g.setColor(Color.BLACK);
        g.fillArc(200 + xOffset, 200 + yOffset, 26, 30, 0, 180);
    }
    @Override
    public void drawMouth(Graphics g){
        g.drawArc(212 + xOffset, 200 + yOffset, 35, 35, 330, -180);
        g.drawArc(178 + xOffset, 200 + yOffset, 35, 35, 30, -180);
    }
}
