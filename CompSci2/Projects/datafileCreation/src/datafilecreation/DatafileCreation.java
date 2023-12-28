/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datafilecreation;

import java.io.*;
import static java.lang.System.*;
import java.util.*;


/**
 *
 * @author 020022
 */
public class DatafileCreation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String myPath = "\\\\lvshares\\Document Sharing\\DataFiles\\";
        File myFile = new File(myPath + "IOTestWrite.txt");
        boolean append = true;

        String yesNo = "no";
        String rName = "read";
        String wName = null;
        int count = 1;

        try {
            FileWriter writer = new FileWriter(myFile, append);
            Scanner fr = new Scanner(in);
            out.print("Would you like to overwite the exisiting file? yes or no: ");
            yesNo = fr.nextLine();

            if (yesNo.toLowerCase().equals("yes")) {
                append = false;
            }
            out.print("Please enter a name you would like to add to the text file: ");
            rName = fr.nextLine();

            String[] sNameArr = rName.split(" ");
            wName = sNameArr[0];

            for (int z = 1; z < sNameArr.length; z++) {
                out.println(sNameArr[z]);
                wName = wName + " . " + sNameArr[z];
            }

            writer.write(count + ": " + wName + ", ");
            out.println(count + ": " + wName + " written...");
            count++;
            writer.write(count + ": " + wName + ".\n");
            out.println(count + ": " + wName + " written...");

            rName = "read";
            wName = null;

            writer.close();

            Scanner reader = new Scanner(myFile);
            String readBack;
            while ((readBack = reader.nextLine()) != null) {
                out.println("reading..." + readBack);
            }
            reader.close();

        } catch (IOException e) {
            out.println("Exception 1: " + e);

        } finally {
            out.println("finally done...");
        }

    }

}
