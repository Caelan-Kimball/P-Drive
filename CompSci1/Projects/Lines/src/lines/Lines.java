/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lines;
import static java.lang.System.*;
import java.awt.*;
import javax.swing.*;


/**
 *
 * @author 020022
 */
public class Lines {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShapesFrame lFrame = new ShapesFrame("Line loop lab 2018, Caelan Kimball");
        lFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lFrame.setSize(1100, 900);
        lFrame.setLocation(100, 100);
        lFrame.setVisible(true);
        
        // TODO code application logic here
    }
    
}
class ShapesFrame extends JFrame
{
    
    public ShapesFrame(String s) {
        super(s);
    }
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        g.fillRect(20, 45, 1000, 800);
        
       for(int y = 45; y <= 850; y += 10)
        {
            g.setColor(Color.red);
            g.drawLine(20, 45, 1020, y);
            
        }//lines from left
        for(int y = 45;y <= 850 ; y += 10)
        {
            g.setColor(Color.green);
            g.drawLine(1020, 45, 20, y);
            
        }// lines from top right
        for(int y = 850;y >= 55; y -= 10)
        {
            g.setColor(Color.blue);
            g.drawLine(20, 845, 1020, y);
            
        }
        for(int y = 850; y >= 55; y -= 10)
        {
            g.setColor(Color.orange);
            g.drawLine(1020, 845, 20, y);
            
        }
        g.setColor(Color.black);
        g.drawString("Caelan Kimball    1st period",300, 875);
            
    }
}
