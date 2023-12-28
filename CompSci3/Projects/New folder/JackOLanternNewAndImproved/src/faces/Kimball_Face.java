/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faces;

import faces.Face;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author ronald.kimball
 */
public class Kimball_Face extends Face {

    public Kimball_Face(int x, int y, Graphics g) {
        g.setColor(new Color(136, 0, 21));
        g.fillOval(115 + x, 100 + y, 50, 50);
        g.fillOval(250 + x, 100 + y, 50, 50);
        
        g.fillArc(125+x, 175+y, 150, 100, 0, 180);
    }
    
}
