package polygoncasestudy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.color.ColorSpace;
import java.util.Arrays;

/**
 *
 * @author Caelan Kimball
 */
public class SpecialPolygon {

    private int centerX;
    private int centerY;
    private int radius;
    private int sideCount;
    private final double TWO_PI = Math.PI * 2;
    private Color color;
//    int randR = (int) (Math.random() * 256);
//    int randG = (int) (Math.random() * 256);
//    int randB = (int) (Math.random() * 256);
    int xCoords[];
    int yCoords[];

    private void makeCoordinate() {
        for (int k = 0; k < sideCount; k++) {
            xCoords[k] = (int) Math.round(Math.cos(TWO_PI * k / sideCount) * radius) + centerX;
            yCoords[k] = (int) Math.round(Math.sin(TWO_PI * k / sideCount) * radius) + centerY;
        }
    }

    @Override
    public String toString() {
        String returner = "SpecialPolygon\n"
                + "centerX: "
                + centerX + "\n" + "centerY: "
                + centerY + "\n" + "radius: "
                + radius + "\n"
                + "sideCount "
                + sideCount + "\n" + "color "
                + color + "\n"
                + "xCoords: " + Arrays.toString(xCoords) + "\n"
                + "yCoords: " + Arrays.toString(yCoords) + "\n";

        return returner;
    }

    //getter methods
    public int getCenterX() {
        return centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public int getRadius() {
        return radius;
    }

    public int getSideCount() {
        return sideCount;
    }

    public Color getColor() {
        return color;
    }

    //Setter methods
    public void setCenterX(int x) {
        centerX = x;
        makeCoordinate();
    }

    public void setCenterY(int y) {
        centerY = y;
        makeCoordinate();
    }

    public void setRadius(int radi) {
        radius = radi;
    }

    public void setSideCount(int side) {
        sideCount = side;
        makeCoordinate();
    }

    public void setColor(Color colour) {
        color = colour;
    }

    private Color randomColorGen() {
        int randR = (int) (Math.random() * 256);
        int randG = (int) (Math.random() * 256);
        int randB = (int) (Math.random() * 256);
        Color rando = new Color(randR, randG, randB);
        return rando;
    }

    /**
     * constructor
     */
    public SpecialPolygon(int cX, int cY, int r, int numOfSides) {
        centerY = cY;
        centerX = cX;
        radius = r;
        sideCount = numOfSides;
        color = randomColorGen();

        xCoords = new int[sideCount];
        yCoords = new int[sideCount];

        makeCoordinate();

    }//parameterized constructor

    public SpecialPolygon() {
        centerY = 100;
        centerX = 100;
        radius = 10;
        sideCount = 6;
        color = randomColorGen();

        xCoords = new int[sideCount];
        yCoords = new int[sideCount];

        makeCoordinate();

    }//default constructor

    public void drawSpecPoly(Graphics g) {
        //save current color
        Color temp = g.getColor();

        Polygon p = new Polygon(xCoords, yCoords, sideCount);
        g.setColor(color);
        g.fillPolygon(p);

        //restore the default color
        g.setColor(temp);

    }
}
