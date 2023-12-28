package computethis;

/**
 * Date: November 7, 2017
 * @author Caelan Kimball
 * Program: Compute This
 */
public class ComputeThis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declare varibles and convert the degress to radians
        double a1 = Math.toRadians(187);
        double a2 = Math.toRadians(122);
        double d1;
        double d2;
        //Begin output
        d1 = 3 * Math.PI * Math.sin(a1) + Math.abs(Math.cos(a2));
        d2 = Math.pow(14.72, 3.801) + Math.log(72);
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
    }
    
}
