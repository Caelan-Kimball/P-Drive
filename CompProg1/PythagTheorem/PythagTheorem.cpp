/* 
 * File:   PythagTheorem.cpp
 * Author: Caelan Kimball
 *
 * Created on October 16, 2017, 11:18 AM
 */

#include <cstdlib>
#include <iostream>
#include <cmath>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    int a;
    int b;
    int c;
    //user input
    cout << "what is the length of side a of your triangle? ";
    cin >> a;
    cout << "\n";
    cout << "what is the length of side b of your triangle? ";
    cin >> b;
    cout << "\n";
    // performing the calculations
    double a2 = pow(a,2);
    double b2 = pow(b,2);
    double c2 = a2 + b2;
    //output
    cout << "The length of the hypotenuse squared of your triangle is " << c2 << "." << endl;
    cout << "\n";
    cout << "The length of the hypotenuse is " << sqrt(c2) << endl;
    cout << "\n";
    cout << "Goodbye have a nice day." << endl;
    
    
            

    return 0;
}

