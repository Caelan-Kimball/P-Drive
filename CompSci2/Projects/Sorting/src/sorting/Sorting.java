package sorting;

import java.io.*;
import java.util.*;
import static java.lang.System.*;

/**
 *
 * @author Caelan Kimball
 * @date February 26, 2019
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long startTime, duration;

        Random randy = new Random();
        int arrayLength = 10;//randy.nextInt(20) + 1;
        //create an int array
        int arrayBoi[] = new int[arrayLength];
        int arrayBoiCpy[] = new int[arrayLength];
        //assign values to array and display the array values
        out.println("Unsorted Data: ");
        for (int x = 0; x < arrayBoi.length; x++) {
            arrayBoi[x] = Math.abs(randy.nextInt(2000));
            out.print(arrayBoi[x] + " ");
        }
        out.print("\n\n");
        // copy the array for a backup
        for (int x = 0; x < arrayBoi.length; x++) {
            arrayBoiCpy[x] = arrayBoi[x];
            // out.print(arrayBoiCpy[x] + " ");
        }

// use the 4 sort algorithms to: 
        //selection sort
        out.println("Selection Sorting: ");
        // start time variable (see document 2)
        startTime = System.nanoTime();

        // sort the array
        selectionSort(arrayBoi);

        // stop time variable
        duration = System.nanoTime() - startTime;

        // display the array values
        printArray(arrayBoi);

        // display sort time
        out.println("\nThis took " + duration + " nanoseconds\n");

        // restore the original values
        arraycopy(arrayBoiCpy, 0, arrayBoi, 0, arrayBoiCpy.length);
        out.println("Data Restored...\n");

        //insertion sort
        out.println("Insertion Sorting: ");
        // start time variable (see document 2)
        startTime = System.nanoTime();

        // sort the array
        insertionSort(arrayBoi);

        // stop time variable
        duration = System.nanoTime() - startTime;

        // display the array values
        printArray(arrayBoi);

        // display sort time
        out.println("\nThis took " + duration + " nanoseconds\n");

        // restore the original values
        arraycopy(arrayBoiCpy, 0, arrayBoi, 0, arrayBoiCpy.length);
        out.println("Data Restored...\n");

        //bubblesort
        out.println("Bubble Sorting: ");
        // start time variable (see document 2)
        startTime = System.nanoTime();

        // sort the array
        bubbleSort(arrayBoi);

        // stop time variable
        duration = System.nanoTime() - startTime;

        // display the array values
        printArray(arrayBoi);

        // display sort time
        out.println("\nThis took " + duration + " nanoseconds\n");

        // restore the original values
        arraycopy(arrayBoiCpy, 0, arrayBoi, 0, arrayBoiCpy.length);
        out.println("Data Restored...\n");

        //quicksort
        out.println("Quick Sorting: ");
        // start time variable (see document 2)
        startTime = System.nanoTime();

        // sort the array
        quickSort(arrayBoi);

        // stop time variable
        duration = System.nanoTime() - startTime;

        // display the array values
        printArray(arrayBoi);

        // display sort time
        out.println("\nThis took " + duration + " nanoseconds\n");

        // restore the original values
        arraycopy(arrayBoiCpy, 0, arrayBoi, 0, arrayBoiCpy.length);
        out.println("Data Restored...\n");

    }

    public static void printArray(int[] data) {
        for (int x = 0; x < data.length; x++) {
            out.print(data[x] + " ");
        }//end of for
    }//end of printArray

    public static void selectionSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int minIndex = findMinimum(data, i);
            if (minIndex != i) {
                swap(data, i, minIndex);
            }//end of if
        }//end of for
    }//end of selectionSort    

    public static int findMinimum(int[] data, int first) {
        int minIndex = first;
        for (int j = first + 1; j < data.length; j++) {
            //out.println(j);
            //out.println(minIndex);
            if (data[j] < data[minIndex]) {
                minIndex = j;
            }//end of if
        }//end of for
        return minIndex;
    }//end of findMinimum

    public static void swap(int[] data, int x, int y) {
        int temp = data[x];
        data[x] = data[y];
        data[y] = temp;
    }//end of swap

    public static void insertionSort(int[] data) {
        int itemToInsert, j;
        boolean stillLooking;

        //on the kth pass insert item k into its coorrect position among
        //the first k entries in array
        for (int k = 1; k < data.length; k++) {
            //Walk backwards through list, looking for slot to insert data[k]
            itemToInsert = data[k];
            j = k - 1;
            stillLooking = true;
            while ((j >= 0) && stillLooking) {
                if (itemToInsert < data[j]) {
                    data[j + 1] = data[j];
                    j--;
                }//end of if
                else {
                    stillLooking = false;
                }//end of else
                //upon leaving loop j + 1 is the index
                //where itemToInsert belongs
                data[j + 1] = itemToInsert;

            }//end of while

        }//end of for
    }//insertion sort

    public static void bubbleSort(int[] data) {
        for (int a = 1; a < data.length; a++) {
            for (int b = data.length - 1; b >= a; b--) {
                if (data[b - 1] > data[b]) //if out of order
                {
                    //exchange the elements
                    int temp = data[b - 1];
                    data[b - 1] = data[b];
                    data[b] = temp;
                }//end of if loop
            }//end of loop b
        }//end of loop a
    }//end of bubbleSort

    public static void quickSort(int[] data) {
        qs(data, 0, data.length - 1);
    }//end of quickSort

    public static void qs(int[] data, int left, int right){
        int i, j;
        int x, y;
        
        i = left; j = right;
        x = data[(left + right) / 2];
        
        do{
            
            while((data[i] < x && (i < right)))i++;
            while((x < data[j] &&(j > left)))j--;
            
            if(i <= j){
                y = data[i];
                data[i] = data[j];
                data[j] = y;
                i++; j--;
            }
            
        }while(i <= j);
        
        if(left < j) qs(data, left, j);
        if(i < right) qs(data, i, right);
    }
    

}//end of class
