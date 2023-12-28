/* 
 * File:   Ocean_Levels.cpp
 * Author: Caelan Kimball
 *
 * Created on September 23, 2019, 1:04 PM
 */

#include <cstdlib>
#include <iostream>
#include <iomanip>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    //constant for level rise
    const double RAISE_RATE = 1.5;
    
   //constants for controlling loop
    const int START_YEAR = 1,
            END_YEAR = 25;
    
    //variable 
    int yearNumber;
    double waterLevelRise;
    
    //table formatting
    cout << "Year\tWater Level Rise\n";
    cout << "---------------------------\n";
    
    //formatting for numbers
    cout << fixed << showpoint << setprecision(1);
    
    for(yearNumber = START_YEAR; yearNumber <= END_YEAR ; yearNumber++){
        waterLevelRise = yearNumber * RAISE_RATE;
        
        cout << yearNumber << "\t" << waterLevelRise << "\n";
        
    }//end of for loop
        

    return 0;
}//end of main

