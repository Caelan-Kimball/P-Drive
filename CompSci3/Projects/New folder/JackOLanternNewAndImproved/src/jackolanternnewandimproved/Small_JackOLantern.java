package jackolanternnewandimproved;

import faces.Face;
import java.awt.Graphics;

/**
 *
 * @author Caelan Kimball
 */
public class Small_JackOLantern extends Small_Pumpkin {

    private Face f = new Face();

    public Small_JackOLantern(Graphics g) {
//        super(g);
        Small_Pumpkin smallBoi = new Small_Pumpkin(0, 0, g);
        Face caelansFace = PumpkinCarver.selectFace(0, 0, g);
        Small_Pumpkin smallBoi2 = new Small_Pumpkin(400, 0, g);
        Face caelansFace2 = PumpkinCarver.selectFace(400, 0, g);
        Small_Pumpkin smallBoi3 = new Small_Pumpkin(0, 400, g);
        Face caelansFace3 = PumpkinCarver.selectFace(0, 400, g);
        Small_Pumpkin smallBoi4 = new Small_Pumpkin(400, 400, g);
        Face caelansFace4 = PumpkinCarver.selectFace(400, 400, g);

    }

    public Small_JackOLantern(int x, int y, Graphics g) {
        Small_Pumpkin smallBoi = new Small_Pumpkin(x, y, g);
        Face caelansFace = PumpkinCarver.selectFace(x, y, g);
//        Small_Pumpkin smallBoi2 = new Small_Pumpkin(x, y, g);
//        Face caelansFace2 = PumpkinCarver.selectFace(x, y, g);
//        Small_Pumpkin smallBoi3 = new Small_Pumpkin(x, y, g);
//        Face caelansFace3 = PumpkinCarver.selectFace(x, y, g);
//        Small_Pumpkin smallBoi4 = new Small_Pumpkin(x, y, g);
//        Face caelansFace4 = PumpkinCarver.selectFace(x, y, g);
    }
}
