package faces;

import faces.Face;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

/**
 *
 * @author Caelan Kimball
 */
public class Caelan_Face extends Face {

    private int xOffset = 0;
    private int yOffset = 0;

    public Caelan_Face() {

    }

    public Caelan_Face(Graphics g) {
        drawFace(g);
    }

    public Caelan_Face(int x, int y, Graphics g) {
        xOffset = x;
        yOffset = y;
        drawFace(g);
    }

    @Override
    public void drawFace(Graphics g) {
        drawEyes(g);
        drawNose(g);
        drawMouth(g);
    }

    @Override
    public void drawEyes(Graphics g) {
        g.setColor(Color.black);
        g.fillOval(125 + xOffset, 140 + yOffset, 10, 10);
        g.fillOval(255 + xOffset, 140 + yOffset, 10, 10);
    }

    @Override
    public void drawNose(Graphics g) {
        g.setColor(Color.black);
        Polygon nose = new Polygon();
        nose.addPoint(190 + xOffset, 160 + yOffset);
        nose.addPoint(170 + xOffset, 170 + yOffset);
        nose.addPoint(210 + xOffset, 170 + yOffset);
        g.fillPolygon(nose);
    }

    @Override
    public void drawMouth(Graphics g) {
        Polygon mouth = new Polygon();
        //bottom of mouth
        mouth.addPoint(145 + xOffset, 180 + yOffset);
        mouth.addPoint(155 + xOffset, 190 + yOffset);
        mouth.addPoint(165 + xOffset, 185 + yOffset);
        mouth.addPoint(175 + xOffset, 190 + yOffset);
        mouth.addPoint(185 + xOffset, 185 + yOffset);
        mouth.addPoint(195 + xOffset, 190 + yOffset);
        mouth.addPoint(205 + xOffset, 185 + yOffset);
        mouth.addPoint(215 + xOffset, 190 + yOffset);
        mouth.addPoint(225 + xOffset, 185 + yOffset);
        mouth.addPoint(235 + xOffset, 180 + yOffset);
        //top of mouth
        mouth.addPoint(225 + xOffset, 175 + yOffset);
        mouth.addPoint(215 + xOffset, 180 + yOffset);
        mouth.addPoint(205 + xOffset, 175 + yOffset);
        mouth.addPoint(195 + xOffset, 180 + yOffset);
        mouth.addPoint(185 + xOffset, 175 + yOffset);
        mouth.addPoint(175 + xOffset, 180 + yOffset);
        mouth.addPoint(165 + xOffset, 175 + yOffset);
        mouth.addPoint(155 + xOffset, 180 + yOffset);
        mouth.addPoint(145 + xOffset, 175 + yOffset);
        g.fillPolygon(mouth);
    }

}
