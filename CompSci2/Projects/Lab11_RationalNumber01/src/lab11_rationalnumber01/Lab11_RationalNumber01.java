package lab11_rationalnumber01;

import javax.swing.*;

/**
 *
 * @author Caelan Kimball
 * @date February 12, 2019 Rational Number lab 11
 */
public class Lab11_RationalNumber01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make Variables
        String strNbr1 = JOptionPane.showInputDialog("Enter Numerator ");
        String strNbr2 = JOptionPane.showInputDialog("Enter Denominator ");

        int num = Integer.parseInt(strNbr1);
        int den = Integer.parseInt(strNbr2);
        Rational r = new Rational(num, den);
        // TODO code application logic here
        JOptionPane.showMessageDialog(null, r.getOriginal() + " equals " + r.getDecimal()
                + "\n and reduces to " + r.getRational());

    }

}

class Rational {

    private double num, den;
    private double decimal;
    private String rational, original;
    private int gcf;

    //Rational
    public Rational(int cNum, int cDen) {
        num = cNum;
        den = cDen;
        decimal = num / den;
        original = cNum + "/" + cDen;
        rational = (int)reduce(num, den) + "/" + (int)reduce(den, num);

    }

    //getNum
    public double getNum() {
        return num;
    }

    //getDen
    public double getDen() {
        return den;
    }

    //getDecimal
    public double getDecimal() {
        return decimal;
    }

    //getRational
    public String getRational() {
        return rational;
    }

    //getOriginal
    public String getOriginal() {
        return original;
    }

    //reduce
    public double reduce(double num1, double num2) {
        num1 = num1 / getGCF(num1, num2);
        num2 = num2 / getGCF(num1, num2);
        return num1;
        
    }
    //returns the greatest common fuction

    private double getGCF(double n1, double n2) {
        double rem = 0;
        double gcf = 0;
        do {
            rem = n1 % n2;
            if (rem == 0) {
                gcf = n2;
            } else {
                n1 = n2;
                n2 = rem;
            }
        } while (rem != 0);
        return gcf;
    }
}
