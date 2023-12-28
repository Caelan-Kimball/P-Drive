package winningdivision;

import java.util.*;
import static java.lang.System.*;

/**
 *
 * @author Caelan Kimball November 28, 2018
 *
 */
public class WinningDivision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String division[] = {"Northeast", "Southeast", "Northwest", "Southwest"};
        double northEastSa, southEastSa, northWestSa, southWestSa;
        northEastSa = getSales(0);
        northWestSa = getSales(2);
        southEastSa = getSales(1);
        southWestSa = getSales(3);
        findHighest(northEastSa, northWestSa, southEastSa, southWestSa);

    }

    static double getSales(int x) {
        String division[] = {"Northeast", "Southeast", "Northwest", "Southwest"};
        Scanner input = new Scanner(in);
        out.print("Enter the quarterly sales data for the " + division[x] + " division: ");
        double salesData = input.nextDouble();
        if (salesData >= 0) {
            return salesData;
        } else {
            while (salesData < 0) {
                out.println("You may not enter a value less than $0.00");
                out.print("Enter the quarterly sales data for the " + division[x] + " division: ");
                salesData = input.nextDouble();
            }
        }
        return salesData;
    }

    static void findHighest(double div1, double div2, double div3, double div4) {
        String division[] = {"Northeast", "Northwest", "Southeast", "Southwest"};
        double divSales[] = {div1, div2, div3, div4};
        Arrays.sort(divSales);
        out.println("The highest grossing division earned $" + divSales[3] + " in sales");
        if (divSales[3] == div1) {
            out.println("And that division was the... " + division[0] + " division");
        }
        if (divSales[3] == div2) {
            out.println("And that division was the... " + division[1] + " division");
        }
        if (divSales[3] == div3) {
            out.println("And that division was the... " + division[2] + " division");
        }
        if (divSales[3] == div4) {
            out.println("And that division was the... " + division[3] + " division");
        }

    }

}
