/* 
 * File:   FTM.cpp
 * Author: Caelan Kimball
 *
 * Created on September 26, 2017, 11:18 AM
 */

#include <cstdlib>
#include <iostream>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    
    //declare two variables
    double Feet; //Holds the length in feet
    double meters; //holds the conversion to meters
    //get input from user
    cout << "Enter the length in feet: ";
    cin >> Feet; //reads the number of feet
    //calculate
    meters = Feet / 3.2808398; //converts to meters
    //output answer
    cout << Feet << " feet is " << meters << " meters. \n" << endl;

    return 0;
}// end of main

