package faces;

import faces.Face;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Maldonado_Face extends Face {

    private int xOffset;
    private int yOffset;

    public Maldonado_Face() {
    }

    public Maldonado_Face(Graphics g) {
        drawFace(g);
    }

    public Maldonado_Face(int x, int y, Graphics g) {
        xOffset = x;
        yOffset = y;
        drawFace(g);
    }

    public void drawFace(Graphics g) {

        drawEyes(g);
        drawNose(g);
        drawMouth(g);
    }

    public void drawEyes(Graphics g) {
        g.setColor(Color.black);
        g.fillOval(200 / 2+xOffset, 200 / 2+yOffset, 100 / 2, 100 / 2);
        g.fillOval(500 / 2+xOffset, 200 / 2+yOffset, 100 / 2, 100 / 2);
        g.setColor(Color.red);
        g.fillOval(200 / 2 + 15+xOffset, 200 / 2 + 15+yOffset, 100 / 2 - 30, 100 / 2 - 30);
        g.fillOval(500 / 2 + 15+xOffset, 200 / 2 + 15+yOffset, 100 / 2 - 30, 100 / 2 - 30);
        g.setColor(Color.black);
        g.fillOval(200 / 2 + 20+xOffset, 200 / 2 + 20+yOffset, 100 / 2 - 30, 100 / 2 - 30);
        g.fillOval(500 / 2 + 20+xOffset, 200 / 2 + 20+yOffset, 100 / 2 - 30, 100 / 2 - 30);

    }

    public void drawNose(Graphics g) {
        g.setColor(Color.black);
        Polygon nose = new Polygon();
        nose.addPoint(350 / 2+xOffset, 340 / 2+yOffset);
        nose.addPoint(450 / 2+xOffset, 340 / 2+yOffset);
        nose.addPoint(400 / 2+xOffset, 270 / 2+yOffset);
        g.fillPolygon(nose);

    }

    public void drawMouth(Graphics g) {
        Polygon mouth = new Polygon();
        mouth.addPoint(300 / 2+xOffset, 400 / 2+yOffset);
        mouth.addPoint(200 / 2+xOffset, 350 / 2+yOffset);
        mouth.addPoint(250 / 2+xOffset, 450 / 2+yOffset);
        mouth.addPoint(400 / 2+xOffset, 500 / 2+yOffset);
        mouth.addPoint(550 / 2+xOffset, 450 / 2+yOffset);
        mouth.addPoint(600 / 2+xOffset, 350 / 2+yOffset);
        mouth.addPoint(500 / 2+xOffset, 400 / 2+yOffset);
        g.fillPolygon(mouth);
    }

}
