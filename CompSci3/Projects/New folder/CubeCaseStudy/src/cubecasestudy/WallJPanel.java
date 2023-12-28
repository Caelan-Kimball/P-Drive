package cubecasestudy;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Caelan Kimball
 */
public class WallJPanel extends JPanel{
    Cube brick1;
    Cube brick2;
    Cube brick3;
    Wall wallDone;
    
    public WallJPanel(){
        //initComponents();
        brick1 = new Cube();
        brick2 = new Cube(400, 50, 120);
        brick3 = new Cube(200, 50, 80);
        wallDone = new Wall();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        brick1.drawCube(g);
        
        g.setColor(Color.red);
        brick2.fillCube(g);
        
        g.setColor(Color.BLACK);
        brick3.fillCube(g);
        
        g.setColor(Color.red);
        wallDone.drawWall(g);
    }
}
