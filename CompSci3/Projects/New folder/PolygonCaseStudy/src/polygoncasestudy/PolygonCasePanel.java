package polygoncasestudy;

import java.awt.*;
import static java.lang.System.*;
import javax.swing.*;

/**
 *
 * @author Caelan Kimball
 */
public class PolygonCasePanel extends JPanel {

    @Override
    public void paintComponent(Graphics g) {

        //super.paint(g);
        //draw things here copy polygon code from main
        SpecialPolygon specPo = new SpecialPolygon();
        System.out.println(specPo);
        specPo.drawSpecPoly(g);
        int sideCount = 3;
        for (int y = 100;; y += 110) {
            for (int x = 100; x <= 550; x += 110) {
//                if (sideCount == 23) {
//                    break;
//                }
                SpecialPolygon specPol = new SpecialPolygon(x, y, 50, sideCount);
                out.println(specPol);
                specPol.drawSpecPoly(g);
                sideCount++;

            }
//            if (sideCount == 23) {
//                break;
//            }
        }
    }
}
