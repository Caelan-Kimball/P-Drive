package jackolanternnewandimproved;

import java.awt.*;

/**
 *
 * @author Caelan Kimball
 */
public class Small_Pumpkin extends Pumpkin   {
    
    private int offsetX = 0;
    private int offsetY = 0;
    
    public Small_Pumpkin(){
        
    }
    
    public Small_Pumpkin(Graphics g) {
        drawPumpkin(g);
        //Pumpkin smallBoi = new Pumpkin(g);
//        g.setColor(new Color(255, 140, 0));
//        g.fillOval(50 + offsetX , 50 + offsetY, 300, 250);
//        g.setColor(new Color(165, 42, 42));
//        g.fillRect(187 + offsetX, 10 + offsetY, 15, 60);
        
    }

    public Small_Pumpkin(int x, int y,Graphics g) {
        offsetX = x;
        offsetY = y;
        drawPumpkin(g);
    }

    public void drawPumpkin(Graphics g) {
        g.setColor(new Color(255, 140, 0));
        g.fillOval(50 + offsetX , 50 + offsetY, 300, 250);
        g.setColor(new Color(165, 42, 42));
        g.fillRect(187 + offsetX, 10 + offsetY, 15, 60);

    }

    
}
