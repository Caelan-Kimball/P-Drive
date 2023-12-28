package cubecasestudy;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Caelan Kimball
 * @Date February 21, 2020
 */
public class CudeCaseStudy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WallJPanel wallPanel = new WallJPanel();
        JFrame wfram = new JFrame("Caelan Kimball Cube Case Study 2020");
        wfram.setSize(800, 600);
        wfram.setLocation(100, 100);
        wfram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wfram.add(wallPanel);
        wfram.setVisible(true);
        
    }
    
    
}
