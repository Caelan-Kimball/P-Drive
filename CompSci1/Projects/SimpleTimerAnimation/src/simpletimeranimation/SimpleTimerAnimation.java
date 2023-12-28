/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpletimeranimation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

/**
 *
 * @author 020022
 */
public class SimpleTimerAnimation extends JPanel implements ActionListener
{

    private double frameNum;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Note: The string in the following statement goes in the title
         * bar of the window
         *
         */
        Random colors = new Random();
        // TODO code application logic here
        JFrame winFrame = new JFrame("Simple Animation: Caelan Kimball 2018");
        
        /*
        Note: If you change the name of this class, you must change
        the name of the class in the next line
        */
        SimpleTimerAnimation drawingArea = new SimpleTimerAnimation();
        
        drawingArea.setBackground(Color.BLACK);
        winFrame.setContentPane(drawingArea);
        
        
        drawingArea.setPreferredSize(new Dimension(600, 450));
        
        winFrame.pack();
        winFrame.setLocation(100, 50);
        //winFrame.setVisible(true);
        winFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        winFrame.setResizable(true);
        
        Timer frameTimer = new Timer(20, drawingArea);
        
        winFrame.setVisible(true);
        frameTimer.start();
        
        
     }
    
    @Override
    public void actionPerformed(ActionEvent e){
        frameNum+= .5;
        repaint();
                
    }
    public void drawFrame(Graphics g, int frameNumber, int width, int height){
        Random colors = new Random();
        g.setColor(new Color(colors.nextInt(256), colors.nextInt(256), colors.nextInt(256)));
        g.fillArc(200, 100, 900, 900, 0, frameNumber%360);
        g.setColor(new Color(colors.nextInt(256), colors.nextInt(256), colors.nextInt(256)));
        g.fillArc(250, 150, 800, 800, 0, frameNumber%360);
        g.setColor(new Color(colors.nextInt(256), colors.nextInt(256), colors.nextInt(256)));
        g.fillArc(300, 200, 700, 700, 0, frameNumber%360);
        g.setColor(new Color(colors.nextInt(256), colors.nextInt(256), colors.nextInt(256)));
        g.fillArc(350, 250, 600, 600, 0, frameNumber%360);
        g.setColor(new Color(colors.nextInt(256), colors.nextInt(256), colors.nextInt(256)));
        g.fillArc(400, 300, 500, 500, 0, frameNumber%360);
        g.setColor(new Color(colors.nextInt(256), colors.nextInt(256), colors.nextInt(256)));
        g.fillArc(450, 350, 400, 400, 0, frameNumber%360);
        g.setColor(new Color(colors.nextInt(256), colors.nextInt(256), colors.nextInt(256)));
        g.fillArc(500, 400, 300, 300, 0, frameNumber%360);
        g.setColor(new Color(colors.nextInt(256), colors.nextInt(256), colors.nextInt(256)));
        g.fillArc(550, 450, 200, 200, 0, frameNumber%360);
        g.setColor(new Color(colors.nextInt(256), colors.nextInt(256), colors.nextInt(256)));
        g.fillArc(600, 500, 100, 100, 0, frameNumber%360);
        g.drawString("Frame number "+ frameNumber, 40, 50);
    }
    
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        drawFrame(g, (int)frameNum, getWidth(), getHeight());
    }
     
}
