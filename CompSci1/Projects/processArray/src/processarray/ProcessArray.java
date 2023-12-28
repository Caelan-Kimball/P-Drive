/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processarray;

import java.util.*;
import static java.lang.System.*;

/**
 *
 * @author 020022
 */
public class ProcessArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        int numbers[] = new int[100];
        // TODO code application logic here
        int index = 0;
        int v = 1;
        int count = 0;
        do {
            out.print("Enter a positive number (enter zero if you would like to stop): ");
            v = input.nextInt();
            if (v == 0 || v < 0)
            {
                break;
            } else
            {
                numbers[index] = v;
                index++;
                count++;
            }

        } while (v != 0);
        out.println("The Numbers entered");
        for (int x = 0; x < numbers.length; x++) 
        {
            if (numbers[x] == 0) 
            {
                //dont print
            }
            else
            {
            out.print(numbers[x] + " ");
            }
        }
        out.println();
        out.println("The numbers in reversed entered order");
        for (int x = numbers.length - 1; x >= 0; x--)
        {
            if (numbers[x] == 0) {
                //dont print
            } else 
            {
                out.print(numbers[x] + " ");
            }
        }
        out.println();
        out.println("The numbers in sorted order");
        Arrays.sort(numbers);
        for (int x = 0; x < numbers.length; x++)
        {
            if(numbers[x] == 0)
            {
                //dont print
            }
            else{
                out.print(numbers[x] + " ");
            }
            
        }
        out.println();
        int sum = 0;
        double average = 0;
        for(int x = numbers.length -1;x >= numbers.length - count; x--)
        { // Calculate the sum of all our numbers
            sum += numbers[x];
        }
        average = (double)sum / count;
        out.println("The sum of the numbers entered is " + sum);
        out.println("The average of your numbers is " + average);
    }

}
