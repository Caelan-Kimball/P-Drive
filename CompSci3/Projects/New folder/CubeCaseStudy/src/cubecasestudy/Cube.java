package cubecasestudy;

import java.awt.*;

/**
 *
 * @author Caelan Kimball
 */
public class Cube {

    private int upperLeftX, upperLeftY;
    private int size;
    private Color color;
    private Polygon top, left;

    //default constructor
    public Cube() {
        upperLeftX = 50;
        upperLeftY = 50;
        size = 50;
        color = Color.BLACK;
        makeCubePolygons();
    }

    public Cube(int x, int y, int s) {
        upperLeftX = x;
        upperLeftY = y;
        size = s;
        color = Color.BLACK;
        makeCubePolygons();
    }

    public Cube(int x, int y, int s, Color c) {
        upperLeftX = x;
        upperLeftY = y;
        size = s;
        color = c;
        makeCubePolygons();
    }

    void makeCubePolygons() {
        top = new Polygon();
        top.addPoint(upperLeftX, upperLeftY);
        top.addPoint(upperLeftX+size, upperLeftY);
        top.addPoint(upperLeftX+size+ size/3, upperLeftY+size/3);
        top.addPoint(upperLeftX+size/3, upperLeftY+size/3);
        
        left = new Polygon();
        left.addPoint(upperLeftX, upperLeftY);
        left.addPoint(upperLeftX+size/3, upperLeftY + size/3);
        left.addPoint(upperLeftX+size/3, upperLeftY+size+size/3);
        left.addPoint(upperLeftX, upperLeftY+size);
        
    }

    public int getUpperLeftX() {
        return upperLeftX;
    }

    public int getUpperLeftY() {
        return upperLeftY;
    }

    public int getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }

    public void setUpperLeftX(int x) {
        upperLeftX = x;
    }

    public void setUpperLefty(int y) {
        upperLeftY = y;
    }

    public void setSize(int s) {
        size = s;
    }

    public void setColor(Color c) {
        color = c;
    }

    public void drawCube(Graphics g) {
        g.drawRect(upperLeftX, upperLeftY, size, size);
        g.drawLine(upperLeftX+size, upperLeftY+size, upperLeftX + size +size/3, upperLeftY+size+size/3);
        g.drawPolygon(top);
        g.drawPolygon(left);
        g.drawRect(upperLeftX+size/3, upperLeftY+size/3, size, size);
    }

    public void fillCube(Graphics g) {
        Color c = g.getColor();
        
        g.fillPolygon(top);
        g.fillPolygon(left);
        g.fillRect(upperLeftX+size/3, upperLeftY+size/3, size, size);
        if(c == Color.black){
            g.setColor(Color.WHITE);
        }else{
            g.setColor(Color.BLACK);
        }
        g.drawPolygon(top);
        g.drawPolygon(left);
        g.drawRect(upperLeftX+size/3, upperLeftY+size/3, size, size);
        
        g.setColor(c);
    }

//    public int getUpperLeftX() {
//        return upperLeftX;
//    }
}
