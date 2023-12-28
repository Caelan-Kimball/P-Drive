package imagespart2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.ImageIO;

/**
 *
 * @author Caelan Kimall
 * @date May 8, 2019
 */
public class ImagesPart2 {

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

}

class PicturePanel extends JPanel implements KeyListener {

    int xPos = 200;
    int yPos = 150;
    BufferedImage buffi;

    public PicturePanel() {

        addKeyListener(this);
        this.setFocusable(true);
        this.requestFocusInWindow();

        this.setBackground(Color.white);

        try {
            //load an image from a file
            String filePath = "\\\\lvshares\\Document Sharing\\DataFiles\\";
            String fileName1 = "perfect-world-people.png";
            File input = new File(filePath + fileName1);

            buffi = ImageIO.read(input);
            this.setSize(buffi.getWidth(), buffi.getHeight());

            //drawFrame(g, 100, 100);
        } catch (IOException ex) {
            System.out.println("Error: Can't open file" + ex);

        }

    }

    private void drawFrame(Graphics g, int width, int height) {
        //g.drawOval(xPos, yPos, 100, 100);
        g.drawImage(buffi, xPos, yPos, this);
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        int keyCode = ke.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_NUMPAD1:
                xPos -= 4;
                yPos += 4;
                break;
            case KeyEvent.VK_NUMPAD2:
                yPos += 4;
                break;
            case KeyEvent.VK_NUMPAD3:
                xPos += 4;
                yPos += 4;
                break;
            case KeyEvent.VK_NUMPAD4:
                xPos -= 4;
                break;
            case KeyEvent.VK_NUMPAD5:
                xPos = 200;
                yPos = 150;
                break;
            case KeyEvent.VK_NUMPAD6:
                xPos += 4;
                break;
            case KeyEvent.VK_NUMPAD7:
                xPos -= 4;
                yPos -= 4;
                break;
            case KeyEvent.VK_NUMPAD8:
                yPos -= 4;
                break;
            case KeyEvent.VK_NUMPAD9:
                xPos += 4;
                yPos -= 4;
                break;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        //do nothing here, we can ignore this
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        //do nothing here, we can ignore this
    }

    @Override
    public void paintComponent(Graphics g) {
        drawFrame(g, xPos, yPos);
        g.clearRect(xPos, yPos, WIDTH, HEIGHT);

    }

}
