package faces;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

/**
 *
 * @author Caelan Kimball
 */
public class Face {

    public Face() {

    }

    public Face(Graphics g) {
        drawFace(g);
    }

    /**
     *
     * @param x
     * @param y
     * @param g
     */
    public Face(int x, int y,Graphics g) {
        drawFace(g);
    }

    public void drawFace(Graphics g) {
        drawEyes(g);
        drawNose(g);
        drawMouth(g);
    }

    public void drawEyes(Graphics g) {
        g.setColor(Color.black);
        g.fillOval(200, 210, 50, 50);
        g.fillOval(440, 210, 50, 50);
    }

    public void drawNose(Graphics g) {
        g.setColor(Color.black);
        Polygon nose = new Polygon();
        nose.addPoint(350, 300);
        nose.addPoint(320, 350);
        nose.addPoint(380, 350);
        g.fillPolygon(nose);
    }

    public void drawMouth(Graphics g) {
        Polygon mouth = new Polygon();
        //bottom of mouth
        mouth.addPoint(220, 380);
        mouth.addPoint(250, 470);
        mouth.addPoint(280, 460);
        mouth.addPoint(310, 470);
        mouth.addPoint(340, 460);
        mouth.addPoint(370, 470);
        mouth.addPoint(400, 460);
        mouth.addPoint(430, 470);
        mouth.addPoint(460, 460);
        mouth.addPoint(500, 380);
        //top of mouth
        //mouth.addPoint(450, 410);
        //mouth.addPoint(270, 410);
        mouth.addPoint(300, 420);
        mouth.addPoint(330, 410);
        mouth.addPoint(360, 420);
        mouth.addPoint(390, 410);
        mouth.addPoint(420, 420);
        g.fillPolygon(mouth);
    }
}
