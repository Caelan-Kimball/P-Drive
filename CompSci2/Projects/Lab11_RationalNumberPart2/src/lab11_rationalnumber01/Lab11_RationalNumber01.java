package lab11_rationalnumber01;

import javax.swing.*;
import static java.lang.System.*;

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
        String strNum1 = JOptionPane.showInputDialog("Enter Numerator 1");
        String strDen1 = JOptionPane.showInputDialog("Enter Denominator 1");
        String strNum2 = JOptionPane.showInputDialog("Enter Numerator 2");
        String strDen2 = JOptionPane.showInputDialog("Enter Denominator 2");

        //assigns ints from boxes
        int num1 = Integer.parseInt(strNum1);
        //out.print(num1);
        int den1 = Integer.parseInt(strDen1);
        //out.print(num1);
        int num2 = Integer.parseInt(strNum2);
        //out.print(num1);
        int den2 = Integer.parseInt(strDen2);

        //create rationals
        Rational r1 = new Rational(num1, den1);
        //out.print(num1);
        Rational r2 = new Rational(num2, den2);
        //out.print(num1);
        Rational r3 = new Rational();
        //out.print(num1);
        // TODO code application logic here
//        JOptionPane.showMessageDialog(null, r.getOriginal() + " equals " + r.getDecimal()
//                + "\n and reduces to " + r.getRational());
//        r3.multiply(r1, r2);
//        String mul = r1.getOriginal() + " * " + r2.getOriginal() + " = " + r3.getRational();
//        out.println(mul);
//        r3.divide(r1, r2);
//        String div = r1.getOriginal() + " * " + r2.getOriginal() + " = " + r3.getRational();
//        out.println(div);
//        r3.add(r1, r2);
//        String add = r1.getOriginal() + " * " + r2.getOriginal() + " = " + r3.getRational();
//        out.println(add);
//        r3.subtract(r1, r2);
//        String sub = r1.getOriginal() + " * " + r2.getOriginal() + " = " + r3.getRational();
//        out.println(sub);
//        String output = mul + "\n" + div + "\n" + add + "\n" + sub;
//        System.out.println(output);
        r3.multiply(r1, r2);

        String mul = r1.getOriginal() + " * " + r2.getOriginal() + " = " + r3.getRational();
        r3.divide(r1, r2);
        String div = r1.getOriginal() + " / " + r2.getOriginal() + " = " + r3.getRational();
        r3.add(r1, r2);
        String add = r1.getOriginal() + " + " + r2.getOriginal() + " = " + r3.getRational();
        r3.subtract(r1, r2);
        String sub = r1.getOriginal() + " - " + r2.getOriginal() + " = " + r3.getRational();
        String output = mul + "\n" + div + "\n" + add + "\n" + sub;
        //out.print(num2);
        JOptionPane.showMessageDialog(null, output);

        System.exit(0);

    }

}

class Rational {

    private double firstNum, firstDen, firstCom;
    private double num, den;
    //private double rNum, rDen;
    private double decimal;
    private String rational, original;
    private int gcf;

    //default constructor
    public Rational() {
        firstNum = num;
        firstDen = den;
    }

    //Rational
    public Rational(int cNum, int cDen) {
        num = cNum;
        den = cDen;
        firstNum = cNum;
        firstDen = cDen;
        decimal = num / den;
        original = (int) num + "/" + (int) den;
        rational = original;
        //rational = (int) reduce(num, den) + "/" + (int) reduce(den, num);

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
        rational = reduce(num, den);
        return rational;
    }

    //getOriginal
    public String getOriginal() {
        // original = rational;
        return original;
    }

    //reduce
    public String reduce(double num1, double num2) {
        num1 = num1 / getGCF(num, den);
        
        num2 = num2 / getGCF(num, den);
        
        String reduce = (int) num1 + "/" + (int) num2;
        
        return reduce;

    }

    //returns the greatest common fraction
//    private double getGCF(double n1, double n2) {
//        double rem = 0;
//        double gcf = 0;
//        do {
//            rem = n1 % n2;
//            if (rem == 0) {
//                gcf = n2;
//            } else {
//                n1 = n2;
//                n2 = rem;
//            }
//        } while (rem != 0);
//        return gcf;
//    }
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

    public void multiply(Rational r1, Rational r2) {
        num = r1.getNum() * r2.getNum();
        den = r1.getDen() * r2.getDen();
       // rational = firstNum + "/" + firstDen;

    }

    public void divide(Rational r1, Rational r2) {
        num = r1.getNum() * r2.getDen();
        den = r1.getDen() * r2.getNum();
        //rational = rNum + "/" + rDen;

    }

    public void add(Rational r1, Rational r2) {
        firstNum = r1.getNum() * r2.getDen();
        firstCom = r1.getDen() * r2.getDen();
        firstDen = r2.getNum() * r1.getDen();
        num = firstNum + firstDen;
        den = firstCom;
        //rational = rNum + "/" + rDen;

    }

    public void subtract(Rational r1, Rational r2) {
        firstNum = r1.getNum() * r2.getDen();
        firstCom = r1.getDen() * r2.getDen();
        firstDen = r2.getNum() * r1.getDen();
        num = firstNum - firstDen;
        den = firstCom;
        //rational = rNum + "/" + rDen;
    }

}
