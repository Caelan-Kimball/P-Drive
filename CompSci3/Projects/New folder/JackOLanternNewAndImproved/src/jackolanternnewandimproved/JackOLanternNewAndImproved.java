package jackolanternnewandimproved;

import javax.swing.JFrame;

/**
 *
 * @author Caelan Kimball
 */
public class JackOLanternNewAndImproved {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame pcFrame = new JFrame("Jack O Lantern MultiMan Smash");
        JackOLanternPanel polyPan = new JackOLanternPanel();

        pcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pcFrame.setSize(800, 800);
        pcFrame.setLocation(100, 100);
        pcFrame.add(polyPan);
        pcFrame.setVisible(true);
}

}
