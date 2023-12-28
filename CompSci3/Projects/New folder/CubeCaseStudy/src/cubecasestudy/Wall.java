package cubecasestudy;
import java.awt.*;
import java.util.*;

/**
 *
 * @author Caelan Kimball
 */
public class Wall{
    ArrayList<Cube> bricks = new ArrayList<>();
    Color wallColor;
    
    public Wall(){
        wallColor = new Color(210,100, 80, 100);
        int cubeSz = 50;
        int wallHeight = 550;
        int wallLength = 700;
        //build a wall with nested for loops
        for(int r = wallHeight-(cubeSz+cubeSz/3); r>= 250;r-=cubeSz){
            for(int c = wallLength-(cubeSz+cubeSz/3);c>=cubeSz;c-=cubeSz){
                bricks.add(new Cube(c, r, cubeSz));
            }
        }
    }
    
    public void drawWall(Graphics g){
        for(Cube c: bricks){
            c.fillCube(g);
        }
    }
}
