/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bullseyepyramide;
import java.awt.*;
import javax.swing.*;
        

/**
 * Program: 
 * @author Caelan Kimball
 * January 26, 2018 
 */
public class BullseyePyramide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TargetFrame sFrame = new TargetFrame("Target shooting 2018, Caelan");
        sFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sFrame.setSize(1000, 800);
        sFrame.setLocation(100, 100);
        sFrame.setVisible(true);
    } 
    
    
            
    
}
class TargetFrame extends JFrame
    {
        public TargetFrame(String s)
            {
             super(s);   
            }
        @Override
        public void paint(Graphics g)
        {
            g.drawLine(100, 300, 450, 300);
            g.drawLine(100, 300, 300, 100);
            g.drawLine(450, 300, 300, 100);
            g.drawLine(450, 300, 500, 150);
            g.drawLine(500, 150, 300, 100);
            //draw target
            g.fillOval(600, 100, 275, 275);
            g.setColor(Color.white);
            g.fillOval(625, 125, 225, 225);
            g.setColor(Color.blue);
            g.fillOval(650, 150, 175, 175);
            g.setColor(Color.red);
            g.fillOval(675, 175, 125, 125);
            g.setColor(Color.yellow);
            g.fillOval(710, 210, 50, 50);
            //draw arrow 
            g.setColor(Color.BLACK);
            g.drawLine(735, 235, 745, 235);
            g.drawLine(735, 235, 735, 245);
            g.drawLine(735, 235, 770, 270);
            g.drawLine(770, 270, 780, 270);
            g.drawLine(770, 270, 770, 280);
            
            
            
        }
    
    }
