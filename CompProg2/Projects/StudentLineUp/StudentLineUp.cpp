/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   StudentLineUp.cpp
 * Author: Caelan Kimball
 *
 * Created on October 1, 2019, 12:45 PM
 */

#include <cstdlib>
#include <iostream>
#include <algorithm>
#include <fstream>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    int numberOfStudents = 0;
    ifstream inFile;
    string studentName;
    int x = 0;

    inFile.open("Students.txt");

    if (!inFile) {
        cout << "File did not open";
    }


    //    cout << "How many students are in your class? ";
    //    cin >> numberOfStudents;
    //    while (numberOfStudents < 1 || numberOfStudents > 25) {
    //        cout << "Please enter a number between 1 and 25: ";
    //        cin >> numberOfStudents;
    //    }



    while (inFile >> studentName) {
        numberOfStudents++;
        //        studentName = inFile >> studentName;

//        studentNameArray[x] = studentName;
//        x++;
    }
    string studentNameArray[numberOfStudents] = {};
    inFile.close();
    inFile.open("Students.txt");
    while (inFile >> studentName) {


        studentNameArray[x] = studentName;
        x++;
    }


    //cout << numberOfStudents;

    //cout << endl;

    //    for (int x = 0; x < numberOfStudents; x++) {
    //        cout << "Enter a student name: ";
    //        cin >> studentName[x];
    //
    //        //cout << studentName[x] << endl;
    //    }
    sort(studentNameArray, studentNameArray + numberOfStudents);

    cout << studentNameArray[0] << " will be the first in line\n";
    cout << studentNameArray[numberOfStudents - 1] << " will be last in line\n";

    inFile.close();

    return 0;
}

