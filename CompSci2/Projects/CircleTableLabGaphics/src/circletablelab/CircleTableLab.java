package circletablelab;

import java.awt.*;
//import java.util.*;
import static java.lang.System.*;
import javax.swing.JFrame;

/**
 *
 * @author Caelan Kimball January 22, 2019 Circle lab with graphics
 */
public class CircleTableLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        //make scanner and var
        CircleFrame cfram = new CircleFrame("Caelan Kimball Circle Lab 2019");
        cfram.setSize(800, 600);
        cfram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cfram.setVisible(true);
//        Scanner input = new Scanner("2 5 3 12 15");
//        int circRadius = 0;
//        String output = "radius:  %6d Circumference: %6.1f Area: %6.1f Surface Area: %6.1f Volume: %7.1f \n";
//        out.println("---------------------------------------------------------------------------------------");
//        while (input.hasNextInt()) {
//            //get radius from user
//            //out.print("Enter the radius of the circle: ");
//            circRadius = input.nextInt();
//            //make new circle with radius
//            Circle fella = new Circle(circRadius);
//            out.printf(output, fella.getRadi(), fella.getCirc(), fella.getArea(), fella.getSurfArea(), fella.getVolume());
//        }
//        out.println("---------------------------------------------------------------------------------------");
    }

}

class CircleFrame extends JFrame {

    public CircleFrame(String s) {
        super(s);
    }

    public void paint(Graphics g) {
        int x = 30;
        int y = 50;
        int randR;
        int randG;
        int randB;
        //make circle object
        for (int c = 0; c < 10; c++) {
            while (y < 570) {
                while (x < 730) {
                    randR = (int) (Math.random() * 256);
                    randG = (int) (Math.random() * 256);
                    randB = (int) (Math.random() * 256);
                    g.setColor(new Color(randR, randG, randB));
                    Circle boyo = new Circle(30, 100);
                    boyo.setTLX(x);
                    boyo.setTLY(y);
                    boyo.drawCircle(g);
                    x += 40;
                }
                y += 40;
                x = 30;
            }
            y = 50;
        }
    }
}

class Circle {

    private int topLeftX = 0;
    private int topLeftY;
    private int diameter;
    private long timeDelay;

    private int radius;
    private double area, circum, surfArea, volume;

    public Circle(int cDiametetr, long cTimedelay) {
        diameter = cDiametetr;
        timeDelay = cTimedelay;
        //intialize var
        radius = (int) (1.0 / 2 * cDiametetr);
        //calc! 
        circum = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        surfArea = 4 * Math.PI * Math.pow(radius, 2);
        volume = 4.0 / 3 * Math.PI * Math.pow(radius, 3);
    }

    private void delay(long n) {
        //sleep
        try {
            Thread.sleep(n);
        } catch (InterruptedException ie) {
            out.println("Broken");
        }
    }

    public void setTLX(int xCoord) {
        topLeftX = xCoord;
    }

    public void setTLY(int yCoord) {
        topLeftY = yCoord;
    }

    public void drawCircle(Graphics c) {
        c.fillOval(topLeftX, topLeftY, diameter, diameter);
        delay(timeDelay);
    }

    public int getRadi() {
        return radius;
    }

    public double getCirc() {
        return circum;
    }

    public double getArea() {
        return area;
    }

    public double getSurfArea() {
        return surfArea;
    }

    public double getVolume() {
        return volume;
    }
}
