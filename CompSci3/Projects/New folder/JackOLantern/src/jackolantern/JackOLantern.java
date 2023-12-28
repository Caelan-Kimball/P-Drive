/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jackolantern;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author 020022
 */
public class JackOLantern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JackOFrame sFrame = new JackOFrame("Jack o' lantern 2018, Caelan Kimball");
        sFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sFrame.setSize(700, 600);
        sFrame.setLocation(100, 100);
        sFrame.setVisible(true);
    }

    static class JackOFrame extends JFrame {

        public JackOFrame(String s) {
            super(s);
        }

        @Override
        public void paint(Graphics g) {
            //Pumpkin pimp = new Pumpkin(g);
            JackOCombiner slackerMan = new JackOCombiner(g);

        }
    }

}

class Pumpkin {

    public Pumpkin(Graphics g) {
        drawPumpkin(g);
    }

    public void drawPumpkin(Graphics g) {
        g.setColor(new Color(255, 140, 0));
        g.fillOval(75, 100, 550, 450);
        g.setColor(new Color(165, 42, 42));
        g.fillRect(340, 60, 20, 60);

    }
}

class Face {

    public Face(Graphics g) {
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
//        mouth.addPoint(450, 410);
//        mouth.addPoint(270, 410);
        mouth.addPoint(300, 420);
        mouth.addPoint(330, 410);
        mouth.addPoint(360, 420);
        mouth.addPoint(390, 410);
        mouth.addPoint(420, 420);
        g.fillPolygon(mouth);
    }
}

class JackOCombiner extends Pumpkin {

    private Face f;

    public JackOCombiner(Graphics g) {
        super(g);
        f = new Face(g);
    }
}
