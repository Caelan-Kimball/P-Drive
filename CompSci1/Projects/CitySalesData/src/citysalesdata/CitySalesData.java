/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citysalesdata;

import java.util.*;
import static java.lang.System.*;
import java.io.*;

/**
 *
 * @author 020022
 */
public class CitySalesData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double total = 0.0;
        int noData = 0;
        String netPath = "\\\\lvschools1\\high\\High\\Kimball\\DataFiles\\";
        String fileName = "sales2.dat";
        File datafile = new File(netPath + fileName);
        Scanner reader;

        // TODO code application logic here
        try {
            reader = new Scanner(datafile);
            while (reader.hasNextLine()) {

                String city = reader.nextLine();
                String data[] = city.split(": ");
                try {
                    total += Double.parseDouble(data[1]);
                } catch (NumberFormatException num) {
                    noData++;
                }
            }
            out.printf("total sales for all reporting cities is $%,.2f. \n", total);
            if (noData == 1) {
                out.println("Data was not gathered from one city\n");
            } else {
                out.println("The number of cities that did not report sales data " + noData);
            }

        } catch (FileNotFoundException ioe) {
            out.println("File not found exception");
        }

    }

}
