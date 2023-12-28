package jackolanternnewandimproved;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Caelan Kimball
 * @Date 10/21/2019
 */
public class JackOLanternPanel extends JPanel {

    Graphics g;

    public JackOLanternPanel() {
//        g.create();
//        Small_JackOLantern jacky = new Small_JackOLantern(0,0,g);
//        Small_JackOLantern jacky2 = new Small_JackOLantern(400,0,g);
//        Small_JackOLantern jacky3 = new Small_JackOLantern(0,400,g);
//        Small_JackOLantern jacky4 = new Small_JackOLantern(400,400,g);
    }

    @Override
    public void paintComponent(Graphics g) {

        Small_JackOLantern jacky = new Small_JackOLantern(0, 0, g);
        Small_JackOLantern jacky2 = new Small_JackOLantern(400, 0, g);
        Small_JackOLantern jacky3 = new Small_JackOLantern(0, 400, g);
        Small_JackOLantern jacky4 = new Small_JackOLantern(400, 400, g);
        Small_JackOLantern jacky5 = new Small_JackOLantern(200, 200, g);
        Small_JackOLantern jacky6 = new Small_JackOLantern(600, 200, g);
        Small_JackOLantern jacky7 = new Small_JackOLantern(200, 600, g);
        Small_JackOLantern jacky8 = new Small_JackOLantern(600, 600, g);
//            JackOCombiner slackerMan = new JackOCombiner(g);
    }

}
