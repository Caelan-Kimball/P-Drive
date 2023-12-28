/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobileserviceprovider;

import java.util.*;
import static java.lang.System.*;
//import java.io.*;

/**
 *
 * @author Caelan Kimball
 */
public class MobileServiceProvider {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(in);
        double planA = 39.99;
        double planB = 59.99;
        double planC = 69.99;
        double savingsB;
        double savingsC;
        int minutesUsed = 0;
        int minutesA = 450;
        int minutesB = 900;
        //int months = 0;
        char packageLetter;
        String prompt;
        String YoN;
        double totalCost;

        //out.println(savingsB);
        do {
            out.print("What is your service package? ");
            packageLetter = input.next().charAt(0);
            packageLetter = Character.toLowerCase(packageLetter);
            if (packageLetter == 'c') {

            } else {
//        out.print("How many months have you been in your current package: ");
//        months = input.nextInt();

            }
            if (minutesUsed > minutesB) {
                savingsB = planB + ((minutesUsed - minutesB) * .40);
            } else {
                savingsB = planB;
            }
            savingsC = planC;
            switch (packageLetter) {
                case 'a':
                    totalCost = planA;
                    out.print("How many minutes did you use: ");
                    minutesUsed = input.nextInt();
                    if (minutesUsed > minutesA) {
                        totalCost += (minutesUsed - minutesA) * .45;
                    }
                    out.printf("Your monthly bill is $%01.2f\n", totalCost);
                    if (totalCost - savingsB > 0) {
                        out.printf("You would save $%01.2f if you switched to package B\n"
                                + "You would save $%01.2f if you switched to package C\n", totalCost - savingsB, totalCost - savingsC);
                    }
                    out.println();
                    break;
                case 'b':
                    totalCost = planB;
                    out.print("How many minutes did you use: ");
                    minutesUsed = input.nextInt();
                    if (minutesUsed > minutesB) {
                        totalCost += (minutesUsed - minutesB) * .40;
                    }
                    out.printf("Your monthly bill is $%01.2f\n", totalCost);
                    if (totalCost - savingsC > 0) {
                        out.printf("You would save $%01.2f if you switched to package C\n", totalCost - savingsC);
                    }
                    out.println();
                    break;
                case 'c':
                    totalCost = planC;
                    out.printf("Your monthly bill is $%01.2f\n", totalCost);
                    out.println();
                    break;
                default:
                    out.print("You have entered a package that does not exist please enter either package A,B, or C: ");
                    packageLetter = input.next().charAt(0);
                    packageLetter = Character.toLowerCase(packageLetter);
            }
            out.print("Do you have another plan to calculate(yes or no)? ");
            YoN = input.next();
            YoN = YoN.toUpperCase();

        } while ("Y".equals(YoN) || "YES".equals(YoN));
    }

}

//class Validator {
//
//    public static int getValidIntRange(Scanner input, String prompt, int h, int i) {
//        out.print(prompt);
//        int x = input.nextInt();
//        if (x > h) {
//            return x;
//        } else {
//            out.println("too high");
//        }
//    }
//}
