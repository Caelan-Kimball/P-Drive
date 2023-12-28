/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   MPHtoKPH.cpp
 * Author: 020022
 *
 * Created on September 23, 2019, 12:52 PM
 */

#include <cstdlib>
#include <iostream>
#include <cmath>
#include <iomanip>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    //constants for loop
    const int START_KPH = 60,
            END_KPH = 130,
            INCREMENT = 10;
    
    //constant for conversion
    const double CONVERSION_FACTOR = 0.6214;
    
    //variables
    int kph; //Kilometer per hour variable
    double mph; //Miles per hour variable
    
    //formatting fo decimals
    cout << fixed << showpoint << setprecision(1);
    
    //displays table
    cout << "KPH\tMPH\n";
    cout << "----------------\n";
    for (kph = START_KPH; kph <= END_KPH; kph += INCREMENT) {
        //calculate mph
        mph = kph * CONVERSION_FACTOR;
        
        //display speeds
        cout << kph << "\t" << mph << endl;
    }//end of for loop

    return 0;
}

