/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintjob;

import static java.lang.System.*;
import java.util.Scanner;

/**
 *
 * @author Caelan Kimball September 19, 2018 Paint Job Estimate
 */
public class PaintJob {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //scanner
        Scanner input = new Scanner(in);
        //variables
        int rooms;
        int squareFeet;
        int totalSqFt;
        int hours;
        int gallons;
        double costPerGallon;
        double labourCost = 25.00;

        //output statements
        out.print("How many rooms do you need painted? ");
        rooms = input.nextInt();
        out.print("Enter the average square feet per room ");
        squareFeet = input.nextInt();
        out.print("Enter the cost of paint per gallon: ");
        costPerGallon = input.nextDouble();
        totalSqFt = sqftCalc(rooms, squareFeet);
        gallons = PaintJob.gallonCalc(totalSqFt);
        hours = PaintJob.labourCalc(totalSqFt);
        if (gallons == 1) {
            out.println("The job requires " + gallons + " gallon of paint");
        } else {
            out.println("The job requires " + gallons + " gallons of paint");
        }
        out.println("The total cost of the paint is $" + paintCostCalc(gallons, costPerGallon));
        out.println("The job will take " + hours + " hours");
        out.println("The labor costs are $" + labourCostCalc(hours, labourCost));
        out.println("The total cost of the job is $" + PaintJob.costCalculator(hours, gallons, 25.00));
        

    }
    //modules
    public static int gallonCalc(int squareFt) {
        int numOfGallons = (int) Math.ceil(squareFt / 110.0);
        if (numOfGallons <= 1) {
            return 1;
        } else {
            return numOfGallons;
        }
    }
    public static int sqftCalc(int rooms, int sqft){
        int totalSqFt = rooms * sqft;
        return totalSqFt;
    }

    public static int labourCalc(int squareFt) {
        int hrsOfLabour = (int) Math.ceil(squareFt / 110.0) * 8;
        if (hrsOfLabour <= 1) {
            return 1;
        } else {
            return hrsOfLabour;
        }
    }

    public static double costCalculator(int hours, int gallons, double costPerGallon) {
        double totalCost = hours * 25.00 + (gallons * costPerGallon);
        return totalCost;
    }
    public static double paintCostCalc(int gallons, double costPerGallon){
        double totalCost = gallons * costPerGallon;
        return totalCost;
    }
    public static double labourCostCalc(int hrsOfLaobur, double labourCost){
        double totalCost = hrsOfLaobur * labourCost;
        return totalCost;
    }
        
//    public static void validator()
}
