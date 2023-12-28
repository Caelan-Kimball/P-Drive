package polygoncasestudy;

import java.awt.*;
import static java.lang.System.*;
import javax.swing.*;

/**
 *
 * @author Caelan Kimball
 */
public class PolygonCaseStudy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SpecialPolygon specPo = new SpecialPolygon();
        out.println(specPo);
        SpecialPolygon specPol = new SpecialPolygon(50,50,20,6);
        out.println(specPol);
        
        JFrame pcFrame = new JFrame("Polygon Case Study");
        PolygonCasePanel polyPan = new PolygonCasePanel();
        pcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pcFrame.setSize(800,800);
        pcFrame.setLocation(100, 100);
        pcFrame.add(polyPan);
        pcFrame.setVisible(true);

    }

}
