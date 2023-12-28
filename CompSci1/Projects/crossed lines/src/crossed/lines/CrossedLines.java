/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crossed.lines;
import javax.swing.*;
import java.awt.*;
import java.util.*;

/**
 *
 * @author 020022
 */
public class CrossedLines {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinesFrame lFrame = new LinesFrame("Simple Crossed Lines Lab 2018, Caelan Kimball");
        lFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lFrame.setSize(1050, 900);
        lFrame.setLocation(100, 50);
        lFrame.setVisible(true);
        // TODO code application logic here
    }
    
}
class LinesFrame extends JFrame
{
    
    public LinesFrame(String s) 
    {
        super(s);
    }
    @Override
    
    public void paint(Graphics g) 
    {  
        //super.paint(g);
        Random colors = new Random();
        
       int y;
       int width = 630;
       int height = 630;
       g.drawRect(50, 50, width, height);
       y = 680;
       for(int x = 50; x <= 680; x += 10)
       {
           g.setColor(new Color(colors.nextInt(256), colors.nextInt(256), colors.nextInt(256)));
           g.drawLine(50, y, x, 50);
           y = y - 10;
       }
       y = 680;
       for(int x = 680; x >= 50; x -= 10)
       {
           g.setColor(new Color(colors.nextInt(256), colors.nextInt(256), colors.nextInt(256)));
           g.drawLine(680, y, x, 50);
           y -= 10;
       }
       y = 50;
       for(int x = 50; x <= 680 ; x += 10)
       {
           g.setColor(new Color(colors.nextInt(256), colors.nextInt(256), colors.nextInt(256)));
           g.drawLine(50, y, x, 680);
           y += 10;
       }//good
       y = 50;
       for(int x = 680; x >= 50; x -= 10)
       {
           g.setColor(new Color(colors.nextInt(256), colors.nextInt(256), colors.nextInt(256)));
           g.drawLine(680, y, x, 680);
           y += 10;
       }//good
//           
           
    }
}
