/* 
 * File:   SoftwareSales.cpp
 * Author: Caelan Kimball
 * Project: Determine discount based on number of program packages
 * Created on September 13, 2019, 12:53 PM
 */

#include <cstdlib>
#include <iostream>
#include <iomanip>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    const double PACKAGEPRICE = 99.00;
    int numOfPackages = 0;
    double costTotal = 0;
    cout << "How many packages did you purchase? ";
    cin >> numOfPackages;
    do {
        if (numOfPackages < 0) {
            cout << "You can not purchase negative packages!" << endl;
            cout << "Enter a new value: ";
            cin >> numOfPackages;
        }//end of input validation
    } while (numOfPackages < 0); //End of do-while loop
    if (numOfPackages < 10) {
        costTotal = numOfPackages * PACKAGEPRICE;
    } else if (numOfPackages >= 10 && numOfPackages < 20) {
        costTotal = numOfPackages * (PACKAGEPRICE - (PACKAGEPRICE * .2));
    }//end of 20 percent discount
    else if (numOfPackages >= 20 && numOfPackages < 50) {
        costTotal = numOfPackages * (PACKAGEPRICE - (PACKAGEPRICE * .3));
    }//end of 30 percent discount
    else if (numOfPackages >= 50 && numOfPackages < 100) {
        costTotal = numOfPackages * (PACKAGEPRICE - (PACKAGEPRICE * .4));
    }//end of 40 percent discount
    else if (numOfPackages >= 100) {
        costTotal = numOfPackages * (PACKAGEPRICE - (PACKAGEPRICE * .5));
    }//end of 50 percent discount
    cout << fixed << showpoint << setprecision(2);
    cout << "The total cost of your software package order is $" << costTotal << endl;



    return 0;
}

