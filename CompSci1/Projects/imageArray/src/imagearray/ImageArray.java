/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagearray;

import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author 020022
 */
public class ImageArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ImageFrame iFrame = new ImageFrame("Image Array Example Lab 2018");
        iFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iFrame.setSize(1000, 800);
        iFrame.setLocation(100, 100);
        ImageJPanel imgPanel = new ImageJPanel();
        iFrame.add(imgPanel);
        iFrame.setVisible(true);
    }

}

class ImageJPanel extends JPanel {

    //Class attributes, Global Variables
    File file;
    BufferedImage bImage;
    BufferedImage bImageArray[];

    /**
     * Constructor for ImageJPanel
     */
    public ImageJPanel() {

        String netPath = "\\\\lvschools1\\high\\high\\kimball\\Datafiles\\";
        String fileName = "Atlasnye_playing_cards_deck.svg.png";
        file = new File(netPath + fileName);

        try {
            //Load the image
            bImage = ImageIO.read(file);
            int index = 0;
            int h = bImage.getHeight()/4;
            int w = bImage.getWidth()/13;
            bImageArray = new BufferedImage[4 * 13];
            
            // Split image into array using nested for loop
            for(int col = 0; col < 13; col++)
            {
                for(int row = 0; row < 4; row++)
                {
                    bImageArray[index] = bImage.getSubimage(w*col + 2, h*row, w, h);
                    index++;
                }
                
            }
        } catch (IOException ioex) {
            Logger.getLogger(ImageJPanel.class.getName()).log(Level.SEVERE, null, ioex);
            System.out.println("IO Exception Most likely a File not found error");
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        int a = (int)(Math.random() * 52);
        g.drawString("Caelan Kimball", 850, 20);
        //g.drawImage(bImage, 20, 30, this);
        g.drawImage(bImageArray[a], 50, 50, this);

    }
}

class ImageFrame extends JFrame {

    public ImageFrame(String s) {
        super(s);
    }
}
