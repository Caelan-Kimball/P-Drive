
/* 
 * File:   SomeVaribles.cpp
 * Author: Caelan Kimball
 *
 * Created on September 21, 2017, 11:26 AM
 */

#include <cstdlib>
#include <iostream>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    //int used for whole numbers
    int length; //declares variable called length
    length = 15; // assign an initial value of 15
    //double used for decimal numbers
    double pancakes = 100.5; // declares and assigns value to pancakes
    //strings = text
    string toppings = "chocolate chips";
    cout<< "The length of our table was " << length << " feet." <<endl;
    cout<< "We ate " << pancakes << " pancakes with " << toppings;
    cout<< " for breakfest." << endl;
    return 0;
}

