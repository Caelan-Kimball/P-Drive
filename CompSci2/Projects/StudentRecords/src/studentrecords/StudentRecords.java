package studentrecords;

import java.io.*;
import static java.lang.System.*;
import java.text.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Caelan Kimball April 3, 2019 Student Records file program
 */
public class StudentRecords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int name = 0;
        double gpa = 0;
        int age = 0;
        double aAge = 0;
        double aGpa = 0;
        String sName;
        String wName;
        
        System.out.println("\nLab17 -- The Student Records File Program\n");
        DecimalFormat df = new DecimalFormat("00.000");
        String path = "\\\\lvshares\\Document Sharing\\DataFiles\\";
        File f1 = new File(path + "students.dat");
        File f2 = new File("passing.dat");
        File f3 = new File("honors.dat");
        //f2.delete();
        //f3.delete();
        
        try {
            FileWriter fWrite = new FileWriter(f2);
            FileWriter f3Write = new FileWriter(f3);
            if (f1.exists()) {
                FileReader inFile = new FileReader(f1);
                Scanner inStream = new Scanner(inFile);
                while(inStream.hasNextLine()){
                            sName = inStream.nextLine();
                            wName = sName;
                            out.println("Name: " + sName);
                            name++;
                            age = (int)Double.parseDouble(inStream.nextLine());
                            aAge +=age;
                            out.println("Age: " + age);
                            gpa = Double.parseDouble(inStream.nextLine());
                            aGpa += gpa;
                            out.println("GPA: " + gpa);
                            if(gpa >= 2.000){
                                fWrite.write("Name: " + wName + "\n");
                                fWrite.write("Age: " + age + "\n");
                                fWrite.write("GPA: " + gpa + "\n");
                                fWrite.write("\n");
                                
                            }
                            if(gpa >= 3.75){
                                f3Write.write("Name: " + wName + "\n");
                                f3Write.write("Age: " + age + "\n");
                                f3Write.write("GPA: " + gpa+ "\n\n");
                            }
                            
                            
                   
                    out.println();
                }
                fWrite.close();
                f3Write.close();
                out.println("Total Students records: " + name);
                out.println("Average student age: " + df.format(aAge/name));
                out.println("Average student GPA: " + df.format(aGpa/name));
                // use Scanner instead of BufferedReader if you prefer
            } else {
                System.out.append(f1.getName() + " Does not exist");
            }
            System.out.println();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentRecords.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERR: File not found exception");
        } catch (IOException ex) {
            Logger.getLogger(StudentRecords.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
