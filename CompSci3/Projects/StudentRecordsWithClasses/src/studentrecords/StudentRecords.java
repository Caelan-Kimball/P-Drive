package studentrecords;

import java.io.*;
import static java.lang.System.*;
import java.text.*;
import java.util.*;

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
        StudentList studentArray = new StudentList();
        try {
            studentArray.loadList();
            studentArray.checkIfEmpty();
            studentArray.pause();

            studentArray.display("UNSORTED ARRAY OF STUDENTS");
            studentArray.pause();

            studentArray.gpaSort();
            studentArray.display("STUDENTS SORTED IN DESCENDING ORDER BY GPA");
            studentArray.pause();

            Student thisStudent = getStudent();
            studentArray.insert(thisStudent);
            
            //studentArray.gpaSort();
            studentArray.display("STUDENTS SORTED BY GPA WITH NEW STUDENT ADDED");
            studentArray.pause();

            studentArray.removeFailing();

            studentArray.display("STUDENTS SORTED BY GPA WITH FAILING STUDENTS REMOVED");
            studentArray.pause();

            int index = studentArray.search(thisStudent);
            if (index == -1) {
                out.println(thisStudent.name + " is not in the list.\n");
            } else {
                out.println(thisStudent.name + " is in the list at index " + index + ".\n");
            }
            studentArray.compareTop3();
            studentArray.removeAll();
            studentArray.checkIfEmpty();

        } catch (FileNotFoundException ex) {
            out.println("FILE NOT FOUND!!!! " + ex);
        }
    }

    public static Student getStudent() {
        Scanner input = new Scanner(in);
        out.print("\nEnter name: ");
        String name = input.nextLine();
        out.print("Enter id: ");
        int id = input.nextInt();
        out.print("Enter age: ");
        int age = input.nextInt();
        out.print("Enter gpa: ");
        double gpa = input.nextDouble();

        return new Student(name, id, age, gpa);
    }
}
