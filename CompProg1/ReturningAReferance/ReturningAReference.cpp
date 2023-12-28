/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   ReturningAReference.cpp
 * Author: Caelan Kimball
 *
 * Created on April 17, 2018, 11:28 AM
 */

#include <cstdlib>
#include <iostream>
#include <time.h>


using namespace std;
//function prototypes
double &change_this(int n); //note the & in front of the function name
double fRand(double fMin, double fMax);

//Global Variables
double values[] = {1.1, 2.2, 3.3, 4.4, 5.5};


int main(int argc, char** argv) {
    srand(time(NULL));
    //declare variables
    

    cout << "Here are the original array values: ";
    for (int x = 0; x < 5; x++) {
        cout << values[x] << " ";

    }
    cout << "\n";

    change_this(1) = rand() %1000 + 1;
    change_this(2) = rand() %1000 + 1;
    change_this(3) = rand() %1000 + 1;
    change_this(4) = rand() %1000 + 1;
    change_this(0) = rand() %1000 + 1;

    cout << "Here are the changed array values: ";
    for (int x = 0; x < 5; x++) {
        cout << values[x] << " ";

    }
    cout << "\n";

    return 0;
}
double &change_this(int n){
    return values[n]; // returns a reference to the nth element of the values array 
}
double fRand(double fMin, double fMax)
{
    double f = (double)rand() / RAND_MAX;
    return fMin + f * (fMax - fMin);
}

