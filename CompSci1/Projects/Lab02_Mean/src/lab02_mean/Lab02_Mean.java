
package lab02_mean;

/**
 * Name: Caelan Kimball
 * Date:September 21, 2017
 * Project: Lab02_Mean
 */
public class Lab02_Mean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //status message
        System.out.println("Execution begins....");
        System.out.println();
        
        //declare vraribles here
        int a = 11;
        int b = 12;
        int c = 13;
        int d = 14;
        double e = 11.23456;
        double f = 12.5678;
        double g = 13.999;
        double h = 14.666;
        // do calculations
        int sum = a + b + c + d;
        int mean = sum / 4;
        double dsum = e + f + g + h;
        double dmean = dsum / 4;
        //Begin system output
        System.out.println("Lab 1, mean, 80 Point Version");
        System.out.println("Sum = " + a +" + " + b + " + " + c + " + " + d + " = "+sum);
        System.out.println("Mean = " + sum + " /4 " + "= " + mean + "\n");
        System.out.println("Lab 1, mean, 100 Point Version");
        System.out.println("Sum = " + e +" + " + f + " + " + g + " + " + h + " = "+dsum);
        System.out.println("Mean = " + dsum + " /4 " + "= " + dmean + "\n");
        System.out.println("Execution ends\n");
    }
    
}
