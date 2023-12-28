/* 
 * File:   FTM table.cpp
 * Author: Caelan Kimball
 *
 * Created on September 29, 2017, 11:25 AM
 */

#include <cstdlib>
#include <iostream>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    int feet = 1; //holds the length in feet
    double meters; //holds the length in meters
    int counter = 0; //start the counter at 0
    for(feet == 1.0; feet <= 1000.0; feet++){
        meters =  feet / 3.2808398; //calculate feet into meters
        cout << feet << " feet is " << meters << " meters." << endl;
        counter++;
        if(counter == 10){
            cout << "\n";
            counter = 0;
        }//end of if loop
        
    }// end of for loop
    
    

    
}//end of code

