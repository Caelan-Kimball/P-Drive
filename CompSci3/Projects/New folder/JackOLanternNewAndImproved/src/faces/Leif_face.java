/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faces;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Leif_face extends Face{
    int xOffset, yOffset;
    
    public Leif_face(){
        
    }
    
    public Leif_face(Graphics g){
        drawFace(g);
    }
    
    public Leif_face(int x, int y, Graphics g){
        xOffset = x;
        yOffset = y;
        drawFace(g);
    }
    
    public void drawFace(Graphics g) {
        drawEyes(g);
        drawMouth(g);
        drawNose(g);
    }

    public void drawEyes(Graphics g) {
        g.setColor(Color.white);
        g.fillArc((260 / 3) + xOffset, (120 / 3) + yOffset, 100 / 2, 170 / 2, 0, 360);
        g.fillArc((440 / 2) + xOffset, (120 / 3) + yOffset, 100 / 2, 170 / 2, 0, 360);

        Random randy = new Random();
        Color customColor;
        g.setColor(Color.black);
        for (int x = 0; x <= 360; x += 5) {
            customColor = new Color(randy.nextInt(256), randy.nextInt(256), randy.nextInt(256));
            g.setColor(customColor);
            g.fillArc((260 / 3) + xOffset, (120 / 3) + yOffset, 100 / 2, 170 / 2, x, 5);
        }
        for (int x = 0; x <= 360; x += 5) {
            customColor = new Color(randy.nextInt(256), randy.nextInt(256), randy.nextInt(256));
            g.setColor(customColor);
            g.fillArc((440 / 2) + xOffset, (120 / 3) + yOffset, 100 / 2, 170 / 2, x, 5);
        }
    }

    public void drawNose(Graphics g) {
        g.setColor(Color.black);
        g.fillArc((325 / 2) + xOffset, (120 / 3) + yOffset, 50, 90, 260, 30);
    }

    public void drawMouth(Graphics g) {
        g.setColor(Color.black);
        g.fillArc((180/2) + xOffset, (330/2) + yOffset, 450/2, 115/2, 80, 360);
        g.setColor(Color.YELLOW);
        for (int x = 0; x <= 360; x += 12) {
            g.fillArc((185/2) + xOffset, (335/2) + yOffset, 440/2, 105/2, x, 10);
        }

    }
}
