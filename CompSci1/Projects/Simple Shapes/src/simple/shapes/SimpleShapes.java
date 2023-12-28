package simple.shapes;
import javax.swing.*;
import java.awt.*;
/**
 * Date: January 10, 2018
 * @author Caelan Kimball
 * Project: simple shapes
 */
public class SimpleShapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShapesFrame sFrame = new ShapesFrame("Simple Shapes Lab 2018, Caelan Kimball");
        sFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sFrame.setSize(1000, 800);
        sFrame.setLocation(100, 100);
        sFrame.setVisible(true);
        
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
        // draw cube
        g.drawRect(50 , 50 , 300 , 300);
        g.drawRect(175 , 175 , 300 , 300);
        g.drawLine(50, 50, 175, 175);
        g.drawLine(50, 350, 175, 475);
        g.drawLine(350, 50, 475, 175);
        g.drawLine(350, 350, 475, 475);
        //draw sphere
        g.drawOval(125, 90, 300, 300);
        //Vertical ovals
        g.drawOval(215, 90, 115, 300);
        g.drawOval(175, 90, 200, 300);
        g.drawOval(150, 90, 250, 300);
        //Horizontal oval
        g.drawOval(125, 180, 300, 115);
        g.drawOval(125, 140, 300, 200);
        g.drawOval(125, 115, 300, 250);
        //draw pyramid
        g.drawLine(400, 750, 900, 750);
        g.drawLine(400, 750, 650, 450);
        g.drawLine(650, 450, 900, 750);
        g.drawLine(400, 750, 775, 600);
        g.drawLine(900, 750, 525, 600);
        g.drawLine(650, 450, 650, 750);
        g.drawString("Caelan Kimball", 50, 700);
        g.drawString("1st period", 50, 715);
    }
}