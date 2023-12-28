package studentrecords;

import java.util.Arrays;

/**
 *
 * @author Caelan Kimball
 */
public class Student {

    String name;
    int id;
    int age;
    double gpa;
    
    public Student(){
        
    }

    /**
     * constructor
     */
    public Student(String n, int i, int a, double g) {
        name = n;
        id = i;
        age = a;
        gpa = g;

    }

    /**
     * toString
     */
    public String toString()

    {
        String returner = "\n"
                + "Name: "
                + name + "\n" + "ID#: "
                + id + "\n" + "Age: "
                + age + "\n"
                + "GPA: "
                + gpa ;
        return returner;
    }
    /**
     * equals
     */
    public boolean equals(Student student2){
        boolean same = false;
        if(age == student2.age && gpa == student2.gpa){
            same = true;
        }
        return same;
        
    }
}
