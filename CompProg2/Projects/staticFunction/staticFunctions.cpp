/* 
 * File:   staticFunctions.cpp
 * Author: Caelan Kimball
 *
 * Created on November 14, 2019, 12:42 PM
 */

#include <cstdlib>
#include <iostream>
using namespace std;

void showStatic(); //function prototype

int main(int argc, char** argv) {
    //Call the showStatic function five times
    for (int count = 0; count < 5; count++) {
        showStatic();
    }
    return 0;
}

void showStatic() {
    static int statNum1;
    static int statNum2 = 5;

    cout << "statNum1 is " << statNum1 << "\t";
    statNum1++;
    cout << "statNum2 is " << statNum2 << endl;
    statNum2++;
}