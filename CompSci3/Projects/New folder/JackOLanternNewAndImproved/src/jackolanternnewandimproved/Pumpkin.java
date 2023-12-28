/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jackolanternnewandimproved;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author 020022
 */
public class Pumpkin {

    public Pumpkin(Graphics g) {
        g.setColor(new Color(255, 140, 0));
        g.fillOval(75, 100, 550, 450);
        g.setColor(new Color(165, 42, 42));
        g.fillRect(340, 60, 20, 60);

    }
    
    public Pumpkin(){
        
    }
}
