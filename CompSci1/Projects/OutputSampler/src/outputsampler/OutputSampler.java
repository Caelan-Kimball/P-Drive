/*
 * Name: Caelan Kimball
Date: September 12, 2017
Program: OutputSampler
 */
package outputsampler;

/**
 *
 * @author 020022
 */
public class OutputSampler {

    /**
     * the main method
     * @param args
     */
    public static void main(String[] args) {
        //code to do stuff goes here
        System.out.println("Bacon makes the rockin' world go round");
        System.out.println("Friends are the only reason I still go to this garbage school");
        System.out.println("My name is chef");
        System.out.println(); //Print a blank line
        System.out.print("25/5 = ");
        System.out.println(25/5);
        System.out.print("4/7.0445902 = ");
        System.out.println(4/7.0445902);
        System.out.print("13 * 159.56 = ");
        System.out.println(13 * 159.56);
        System.out.printf("My name is %s", "Caelan Kimball" );
        System.out.println();
        System.out.printf("I was %s in %d.\n", "born", 2001);
        System.out.printf("%d / %f = %01.3f \n", 4, 7.0445902, 0.5678115953430478);
    }
    
}
