/* 
 * File:   Moon.cpp
 * Author: Caelan Kimball
 *
 * Created on October 4, 2017, 11:19 AM
 */

#include <cstdlib>
#include <iostream>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    //Declare Variables
    int Weight = 0;
    double weightOnTheMoon;
    //Begin output
    cout << "What is your weight in lbs? ";
    cin >> Weight; 
    weightOnTheMoon = Weight *.17;
    cout << "If your weight is " << Weight << "lbs on earth. Than your Weight on the moon would be " << weightOnTheMoon << "lbs." << endl;
    return 0;
}

