/* 
 * File:   CupsToFlOz.cpp
 * Author: Caelan Kimball
 *
 * Created on October 30, 2019, 12:55 PM
 */

#include <cstdlib>
#include <iomanip>
#include <iostream>
#include <ios>

using namespace std;

//Function prototype
void showIntro();
double getCups();
double cupsToOunces(double);

/*
 * 
 */
int main(int argc, char** argv) {

    //Variables for the cups and ounces.
    double cups, ounces;

    //set up numeric output formatting
    cout << fixed << showpoint << setprecision(1);

    //display an into screen
    showIntro();

    //get the number of cups.
    cups = getCups();

    //Convert cups to fluid ounces.
    ounces = cupsToOunces(cups);

    cout << cups << " cups equals " << ounces << " ounces.\n";
    return 0;
}

void showIntro() {
    
    cout << "This program converts measurements\n"
            <<"in cups to fluid ounces. For your\n"
            << "reference the formula is:\n"
            << " 1 cup = 8 fluid ounces\n\n";
}

double getCups(){
    double numCups;
    
    cout << "Enter the number of cups ";
    cin >> numCups;
    return numCups;
}

double cupsToOunces(double numCups){
    return numCups * 8.0;
}
