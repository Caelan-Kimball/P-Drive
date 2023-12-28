/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferedimagereader;

import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.ImageIO;

/**
 *
 * @author 020022
 */
public class BufferedImageRead {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PicturePanel picPanel = new PicturePanel();
        JFrame frame = new JFrame("Picture Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(100, 50);
        frame.add(picPanel);
        frame.setSize(picPanel.getWidth(), picPanel.getHeight());
        frame.setVisible(true);
    }
    
}//end of bufferedImmageReader

class PicturePanel extends JPanel{
    //bufferedImage object to hold the picture
    BufferedImage buffi;
    JRadioButton jr1;
    
    public PicturePanel(){
        try{
            //load the image from file
            String filePath = "\\\\lvshares\\Document Sharing\\DataFiles\\";
            String fileName1 = "St. Basil's cathedral.bmp";
            File input = new File(filePath + fileName1);
            
            buffi = ImageIO.read(input);
            this.setSize(buffi.getWidth(), buffi.getHeight());
            
            //some improvments
            jr1 = new JRadioButton("Display Picture 1");
            jr1.setSelected(true);
            BorderLayout nbl = new BorderLayout();
            this.setLayout(nbl);
            this.add(BorderLayout.SOUTH, jr1);
            
        }catch(IOException ex){
            System.out.println("Can't open image file\n");
        }
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        if(jr1.isSelected())
            g.drawImage(buffi, 0, 0, this);
        else
            g.drawOval(buffi.getWidth()/2 - 100, 100, 200, 200);
    }
}
