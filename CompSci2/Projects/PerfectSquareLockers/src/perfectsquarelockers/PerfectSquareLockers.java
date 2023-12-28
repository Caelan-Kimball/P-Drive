package perfectsquarelockers;

import static java.lang.System.*;
import java.util.Scanner;

/**
 *
 * @author Caelan Kimball
 */
public class PerfectSquareLockers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(in);
        out.println("\nLAB12G 100 POINT VERSION\n");
        out.print("Enter the perfect square upper bound ====>>  ");
        final int MAX = input.nextInt();
        boolean lockerOpen[];
        lockerOpen = new boolean[MAX + 1];
        openCloseLockers(lockerOpen);
        out.println("PERFECT SQUARES BETWEEN 1 AND " + MAX + "\n");
        displayOpenLockers(lockerOpen);

    }

    public static void openCloseLockers(boolean lockOpen[]) {
        out.println("\nOPENING AND CLOSING LOCKERS\n");
        for (int x = 0; x < lockOpen.length; x++) {
            //lockOpen[x] = true;
        }
        for (int x = 1; x < lockOpen.length; x++) {
            for (int y = (int) Math.pow(x, 2); y < lockOpen.length; y += y) {
                if (Math.sqrt(y) == x) {
                    lockOpen[y] = true;
                }
                
            }
        }
    }

    public static void displayOpenLockers(boolean lockOpen[]) {
        int cont = 0;
        
        for (int open = 1; open < lockOpen.length; open++) {
            
            if (lockOpen[open] == true) {
                out.print(open + " ");
                cont++;
            }
            if(cont == 20){
                cont = 0;
                out.println();
            }
        }
        out.println("\n");
    }

}
