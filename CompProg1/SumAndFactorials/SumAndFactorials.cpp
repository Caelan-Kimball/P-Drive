/* 
 * File:   SumAndFactorials.cpp
 * Author: Caelan Kimball
 *
 * Created on November 29, 2017, 11:10 AM
 */

#include <cstdlib>
#include <iostream>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    int value;
    int sum = 0;
    int factorial = 1;
    cout << "This program will calculate the sum of all the numbers from 1 to the number entered as well as the factorial of the number entered\n";
    cout << "enter a number: ";
    cin >> value;
    //add a for loop
    for (int x = 1; x <= value; x++)
    {
        sum = sum + x;
        factorial *= x;
       
    }//end of for loop
     cout << "The sum is: " << sum <<"\n" ;
     cout  << value << " factorial is: " << factorial << "\n";

    return 0;
}

