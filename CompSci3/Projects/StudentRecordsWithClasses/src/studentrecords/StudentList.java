package studentrecords;

import java.io.*;
import static java.lang.System.*;
import java.util.*;

/**
 *
 * @author Caelan Kimball
 */
public class StudentList {

    private ArrayList<Student> students = new ArrayList<>();

    public StudentList() {

    }

    public void loadList() throws FileNotFoundException {
        File inFile = new File("\\\\lvshares\\Document Sharing\\DataFiles\\students2.dat");
        Scanner inStream = new Scanner(inFile);
        String s1, s2, s3, s4;
        int age, id;
        double gpa;
        while (inStream.hasNextLine()) {
            s1 = inStream.nextLine();
            s2 = inStream.nextLine();
            s3 = inStream.nextLine();
            s4 = inStream.nextLine();
            String name = s1;
            id = Integer.parseInt(s2);
            age = Integer.parseInt(s3);
            gpa = Double.parseDouble(s4);

            Student newStudent = new Student(name, id, age, gpa);
            students.add(newStudent);
        }

    }

    public void display(String listInfo) {

        out.println("\nDISPLAYING " + listInfo);
        out.println();

        for (int x = 0; x < students.size(); x++) {
            out.println(students.get(x));
        }
    }

    public void pause() {
        Scanner input = new Scanner(in);
        String dummy;
        out.println("\nPress <Enter> to continue.");
        dummy = input.nextLine();
    }

    private void swap(int x, int y) {
        Student tempStudent = students.get(x);
        students.set(x, students.get(y));
        students.set(y, tempStudent);
    }

    public void gpaSort() {
        //Note: This method is provided for you,
        //      but it will not work if you have not written the method

        for (int x = 1; x < students.size(); x++) {
            for (int y = 0; y < students.size() - x; y++) {
                Student thisOne = students.get(y);
                Student nextOne = students.get(y + 1);
                if (thisOne.gpa < nextOne.gpa) {
                    swap(y, y + 1);
                }
            }
        }
    }

    public int search(Student thisStudent) {
        Student searcher = thisStudent;
        int index = students.indexOf(searcher);
        return index;
    }

    public void insert(Student newStudent) {
        //Precondition: The student list is not empty

        students.add(0, newStudent);
        gpaSort();
    }

    public void removeFailing() {
        //Hint Remeber, the list will be sorted in DECENDING order.
        boolean bruh = true;

        while (bruh == true) {
            Student thisOne = students.get(students.size() - 1);
            if (thisOne.gpa < 2.0) {
                students.remove(thisOne);
            } else {
                bruh = false;
            }
        }
    }

    public void removeAll() {
        students.removeAll(students);
    }

    public void compareTop3() {
        //Note: This method is provided for you
        //      but it will not work if you have not written the equals method of the Person class

        Student first, second, third;
        first = (Student) students.get(0);
        second = (Student) students.get(1);
        third = (Student) students.get(2);

        if (first.equals(second)) {
            out.println(first.name + " and " + second.name + " are equal.\n");
        }
        if (first.equals(third)) {
            out.println(first.name + " and " + third.name + " are equal.\n");
        }
        if (third.equals(second)) {
            out.println(third.name + " and " + second.name + " are equal.\n");
        }

    }

    public void checkIfEmpty() {
        boolean Bruh = students.isEmpty();
        if (Bruh == true) {
            out.print("The array list students is empty\n");
        }
        else{
            out.print("The array list students is not empty\n");
        }
    }
}
