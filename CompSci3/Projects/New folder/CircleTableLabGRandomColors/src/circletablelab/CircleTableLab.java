package circletablelab;

import java.awt.*;
//import java.util.*;
import static java.lang.System.*;
import java.util.Random;
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
//   out.println("---------------------------------------------------------------------------------------");

    }

}

class CircleFrame extends JFrame {

    public CircleFrame(String s) {
        super(s);
    }

    public void paint(Graphics g) {
        int x = 50;
        int y = 100;
        int randR;
        int randG;
        int randB;
        //make circle object
        for (;;) {
            while (y <= 450) {
                while (x <= 730) {
                    randR = (int) (Math.random() * 256);
                    randG = (int) (Math.random() * 256);
                    randB = (int) (Math.random() * 256);

                    Circle boyo = new Circle(g, 100);
                    g.setColor(boyo.getRandomColor());
                    boyo.setTLX(x);
                    if (boyo.getRed() > boyo.getGreen()) {
                        if (boyo.getRed() > boyo.getBlue()) {
                            boyo.setTLY(100);
                            if (boyo.redCircCount <= 23) {
                                boyo.setTLY(150);
                                boyo.redCount = 0;
                                //boyo.setTLX(boyo.redCount);
                                boyo.drawRandomCircle(g);

                                //break;
                            }

                            boyo.redCount += 30;
                            boyo.redCircCount--;

                        }

                    }
                    if (boyo.getRed() > boyo.getGreen()) {
                        if (boyo.getRed() > boyo.getBlue()) {
                            boyo.setTLY(100);
//                            if (boyo.redCircCount <= 23) {
//                                boyo.setTLY(150);
//                                boyo.redCount = 0;
//                                //boyo.setTLX(boyo.redCount);
//                                boyo.drawRandomCircle(g);
//
//                                //break;
//                            }

                            boyo.redCount += 30;
                            boyo.redCircCount--;

                        }

                    }
                    if (boyo.getRed() < boyo.getGreen()) {
                        if (boyo.getGreen() > boyo.getBlue()) {
                            boyo.setTLY(250);
                            if (boyo.greenCircCount <= 23) {
                                boyo.setTLY(300);
                                //boyo.setTLX(boyo.greenCount);
                                boyo.greenCount = 0;
                                boyo.drawRandomCircle(g);
                                //break;
                            }

                            boyo.greenCount += 30;
                            boyo.greenCircCount--;
                        }

                    }
                    if (boyo.getRed() < boyo.getGreen()) {
                        if (boyo.getGreen() > boyo.getBlue()) {
                            boyo.setTLY(250);
//                            if (boyo.greenCircCount <= 23) {
//                                boyo.setTLY(300);
//                                //boyo.setTLX(boyo.greenCount);
//                                boyo.greenCount = 0;
//                                boyo.drawRandomCircle(g);
//                                //break;
//                            }

                            boyo.greenCount += 30;
                            boyo.greenCircCount--;
                        }

                    }
                    if ((boyo.getBlue() > boyo.getGreen())
                            && (boyo.getRed() < boyo.getBlue())) {
                        boyo.setTLY(400);
//                        if (boyo.blueCircCount <= 23) {
//                            boyo.setTLY(450);
//                            //boyo.setTLX(boyo.blueCount);
//                            boyo.blueCount = 0;
                            boyo.drawRandomCircle(g);
//                            //break;
//                        }

                        boyo.blueCount += 30;
                        boyo.blueCircCount--;
                    }
                    if (boyo.getBlue() > boyo.getGreen()) {
                        if (boyo.getRed() < boyo.getBlue()) {
                            boyo.setTLY(400);
                            if (boyo.blueCircCount <= 23) {
                                boyo.setTLY(450);
                                //boyo.setTLX(boyo.blueCount);
                                boyo.blueCount = 0;
                                boyo.drawRandomCircle(g);
                                //break;
                            }

                            boyo.blueCount += 30;
                            boyo.blueCircCount--;
                        }
                    }
                        
                        boyo.drawRandomCircle(g);
                        x += 30;
                    }
                        
                    
                    y += 150;
                    x = 50;
                }
                y = 100;
            }
        }
   }

    class Circle {

        private int topLeftX = 0;
        private int topLeftY;
        private int diameter;
        private long timeDelay;
        private int circleCount;
        private Random rnd;
        private Color randomColor;
        private int colorRow;
        public int redCount, greenCount, blueCount;
        public int redCircCount, greenCircCount, blueCircCount = 0;

        private int radius;
        private double area, circum, surfArea, volume;
        private int red, green, blue;

        public Circle(Graphics g, int c) {
            rnd = new Random();
            circleCount = c;
            redCount = 50;
            greenCount = 50;
            blueCount = 50;
            drawSquares(g);
            for (int k = 1; k <= 23; k++) {
                drawRandomCircle(g);
            }
//        diameter = cDiametetr;
//        timeDelay = cTimedelay;
//        //intialize var
//        radius = (int) (1.0 / 2 * cDiametetr);
//        //calc! 
//        circum = 2 * Math.PI * radius;
//        area = Math.PI * Math.pow(radius, 2);
//        surfArea = 4 * Math.PI * Math.pow(radius, 2);
//        volume = 4.0 / 3 * Math.PI * Math.pow(radius, 3);
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

        public void drawRandomCircle(Graphics c) {
            //while(circleCount < 23){
            c.setColor(randomColor);
            c.fillOval(topLeftX, topLeftY, 30, 30);
            //}
            //delay(timeDelay);
        }

        public void drawSquares(Graphics g) {
            g.setColor(Color.red);
            g.fillRect(10, 100, 30, 30);
            g.setColor(Color.GREEN);
            g.fillRect(10, 250, 30, 30);
            g.setColor(Color.blue);
            g.fillRect(10, 400, 30, 30);

        }

        public Color getRandomColor() {
            int r = rnd.nextInt(256);
            int g = rnd.nextInt(256);
            int b = rnd.nextInt(256);
            red = r;
            green = g;
            blue = b;
            randomColor = new Color(r, g, b);
            return randomColor;
        }

        public int getRed() {
            return red;
        }

        public int getGreen() {
            return green;
        }

        public int getBlue() {
            return blue;
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
