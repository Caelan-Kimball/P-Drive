/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jackolanternnewandimproved;


import faces.*;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author 020022
 */
public abstract class PumpkinCarver {

    public static Face selectFace(int x, int y, Graphics g) {
        Random randy = new Random();
        int faceSelector = randy.nextInt(7);
        

        Face face = new Face();

        switch (faceSelector) {
            case 1:
                face = new Caelan_Face(x, y, g);
                break;
            case 2:
                face = new Kimball_Face(x, y, g);
                break;
            case 3:
                face = new DanesFace(x, y, g);
                break;
            case 4:
                face = new Maldonado_Face(x, y, g);
                break;
            case 5:
                face = new Leif_face(x, y, g);
                break;
            case 6:
                face = new JaredFace(x, y, g);
                break;
//            case 7:
//                face = new Caelan_Face(x, y, g);
//                break;

            default:
                face = new Caelan_Face(x, y, g);
                break;
        }
        System.out.print("Making a face");
        return face;
    }
}
