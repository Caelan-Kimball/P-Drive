package abstractshapelab;

import javax.swing.*;
import java.awt.*;
import java.util.*;

/**
 *
 * @author Caelan Kimball
 */
public class AbstractShapeLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Random Shapes Frame");
        frame.add(new ShapePanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 800);
        frame.setLocation(100, 100);
        frame.setVisible(true);
    }

}

class ShapePanel extends JPanel {

    ArrayList<Shape> shapes = new ArrayList();
    Random random = new Random();
    Color rando = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

    public ShapePanel() {
        //squares
        for (int count = 0; count <= 100; count++) {
            int x = random.nextInt(840);
            int y = random.nextInt(320);
            if (x < 470) {
                x += 470;
            }
            if (x > 840) {
                x -= 20;
            }
            if (y < 10) {
                y += 20;
            }
            Color rando = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            Shape sq = new Square(x, y, 50, 50);
            sq.setColor(rando);
            shapes.add(sq);
        }
        // do this for each shape

        //Circle
        for (int count = 0; count <= 100; count++) {
            int x = random.nextInt(400);
            int y = random.nextInt(600);
            int radi = random.nextInt(150);
            if (x < 15) {
                x += 30;
            }
            if (x + radi > 380) {
                x -= 100;
            }
            if (y < 380) {
                y += 380;
            }
            if (y > 600) {
                y -= 200;
            }
            Color rando = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            Shape circ = new Circle(x, y, radi, radi);
            circ.setColor(rando);
            shapes.add(circ);
        }
        //Line
        for (int count = 0; count <= 100; count++) {
            int x = random.nextInt(440);
            int y = random.nextInt(340);
            int eX = random.nextInt(440);
            int eY = random.nextInt(340);
            if (x < 10) {
                x += 20;
            }

            if (y < 10) {
                y += 20;
            }

            if (eX < 10) {
                eX += 20;
            }

            if (eY < 10) {
                eY += 20;
            }
            Color rando = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            Shape line = new Line(x, y, eX, eY);
            line.setColor(rando);
            shapes.add(line);
        }

        Color rando = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        Shape sq = new Square(675, 500, 75, 75);
        sq.setColor(rando);
        shapes.add(sq);
        rando = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        Shape polygon = new PolygonBox(675, 500);
        polygon.setColor(rando);
        shapes.add(polygon);
        rando = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        Shape sq2 = new Square(700, 550, 75, 75);
        sq2.setColor(rando);
        shapes.add(sq2);
        

    }

    @Override
    public void paintComponent(Graphics g) {

        // you should not change this part
        g.drawRect(10, 10, 960, 740);
        g.drawLine(10, 370, 970, 370);
        g.drawLine(460, 10, 460, 750);

        // draw shapes stuff
        for (Shape s : shapes) {
            s.draw(g);
        }

    }

}

abstract class Shape {

    Color color;
    int left, top;  	// Position of top left corner of rectangle that bounds this shape.
    int width, height;  // Size of the bounding rectangle.

    void setColor(Color c) {
        color = c;
    }

    abstract void draw(Graphics g);
    // nothing specified here
}

class Square extends Shape {

    // constructor
    public Square(int x, int y, int w, int h) {
        width = w;
        height = h;
        top = y;
        left = x;
    }

    void draw(Graphics g) {
        // draw square here
        g.setColor(color);
        g.fillRect(left, top, width, height);
    }
}

class Circle extends Shape {
// constructor

    public Circle(int x, int y, int w, int h) {
        width = w;
        height = h;
        top = y;
        left = x;
    }

    void draw(Graphics g) {
        g.setColor(color);
        g.drawOval(left, top, width, height);
    }
}

class Line extends Shape {

    // constructor
    public Line(int fX, int fY, int eX, int eY) {
        left = fX;
        top = fY;
        width = eX;
        height = eY;
    }

    void draw(Graphics g) {
        g.setColor(color);
        g.drawLine(left, top, width, height);
    }
}

class PolygonBox extends Shape {
// constructor

    public PolygonBox(int x, int y) {
        left = x;
        top = y;
    }

    void draw(Graphics g) {
        g.setColor(color);
        Polygon p1 = new Polygon();
        p1.addPoint(675, 500);
        p1.addPoint(675, 575);
        p1.addPoint(700, 625);
        p1.addPoint(700, 550);
        g.fillPolygon(p1);
        
        g.setColor(color);
        Polygon p2 = new Polygon();
        p2.addPoint(750, 500);
        p2.addPoint(750, 575);
        p2.addPoint(775, 625);
        p2.addPoint(775, 550);
        g.fillPolygon(p2);
    }
}
