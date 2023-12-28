/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mouselistener;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

/**
 * May 1st, 2019
 *
 * @author Caelan Kimball
 */
public class MouseListenerDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Random Shapes Frame");
        MouseDemoPanel mdp = new MouseDemoPanel();
        frame.add(mdp);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 800);
        frame.setLocation(100, 100);
        frame.setVisible(true);
    }

}

class MouseDemoPanel extends JPanel {

    private String message = "";
    private int myX;
    private int myY;
    Graphics g2;
    Random boi = new Random();
    Color randyC = new Color(boi.nextInt(256),boi.nextInt(256),boi.nextInt(256));

    public MouseDemoPanel() {
        MyMouseActions mma = new MyMouseActions();
        this.addMouseListener(mma);

    }

    class MyMouseActions implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent me) {
            Color randyC = new Color(boi.nextInt(256),boi.nextInt(256),boi.nextInt(256));
            message = "The building.";
            myX = me.getX();
            myY = me.getY();
            g2 = getGraphics();
            g2.setColor(randyC);
            g2.fillRect(me.getX(), me.getY(), 50, 50);
            g2.setColor(randyC);
            g2.drawString(message, myX - 10, myY - 10);
            g2.dispose();
        }

        @Override
        public void mouseExited(MouseEvent me) {
            Color randyC = new Color(boi.nextInt(256),boi.nextInt(256),boi.nextInt(256));
            myX = me.getX() - 50;
            myY = 50;
            message = "Elvis has left the building.";
            g2 = getGraphics();

            g2.setColor(randyC);
            g2.fillRect(me.getX(), me.getY(), 50, 50);
            g2.setColor(Color.black);
            g2.drawString(message, myX - 10, myY - 10);
        }


        public void mouseEntered(MouseEvent me) {
            Color randyC = new Color(boi.nextInt(256),boi.nextInt(256),boi.nextInt(256));
            myX = me.getX() - 50;
            myY = 50;
            message = "Elvis has entered the building.";
            g2 = getGraphics();

            g2.setColor(randyC);
            g2.fillRect(me.getX(), me.getY(), 50, 50);
            g2.setColor(Color.black);
            g2.drawString(message, myX - 10, myY - 10);
        }

        public void mouseReleased(MouseEvent me) {
            
        }

        public void mousePressed(MouseEvent me) {
            Color randyC = new Color(boi.nextInt(256),boi.nextInt(256),boi.nextInt(256));
            myX = me.getX();
            myY = me.getY();
            g2 = getGraphics();
            int radi = boi.nextInt(59) + 1;
            
            g2.setColor(randyC);
            g2.fillOval(myX, myX, radi, radi);
        }

        public void paintComponent(Graphics g) {
            g.setColor(Color.red);
        }
    }
}
