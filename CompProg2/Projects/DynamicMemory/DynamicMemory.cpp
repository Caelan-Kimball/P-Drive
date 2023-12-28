/* 
 * File:   DynamicMemory.cpp
 * Author: Caelan Kimball
 *
 * Created on February 11, 2020, 1:02 PM
 */

#include <cstdlib>
#include <iostream>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    //create pointers as null
    int *memPtr1 = nullptr;
    int *memPtr2 = nullptr;
    double *memPtr3 = nullptr;
    char *memPtr4 = nullptr;
    //assign memory to the pointers
    memPtr1 = new int;
    *memPtr1 = 5;
    memPtr2 = new int(7);
    memPtr3 = new double;
    *memPtr3 = (double)*memPtr1 / *memPtr2;
    memPtr4 = new char[30];
    
    cout << "Enter a short message (less than 30 characters)\n";
    cin.getline(memPtr4, 29, '\n');

    cout << "Memory location " << memPtr1 <<
            " contains the value " << *memPtr1 << endl;
    cout << "Memory location " << memPtr2 <<
            " contains the value " << *memPtr2 << endl;
    cout << "Memory location " << memPtr3 <<
            " contains the value " << *memPtr3 << endl;
    cout << "Memory location " << memPtr4 <<
            " contains the value " << *memPtr4 << endl;
    
    delete memPtr1;
    delete memPtr2;
    delete memPtr3;
    delete [] memPtr4;
    return 0;
}

