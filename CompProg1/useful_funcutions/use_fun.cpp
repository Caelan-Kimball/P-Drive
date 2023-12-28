
/* 
 * File:   use_fun.cpp
 * Author: Caelan Kimball
 *
 * Created on October 5, 2017, 11:19 AM
 */

#include <cstdlib>
#include <iostream>
#include <cmath>
#include <cstdio>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    cout << "built in functions can be very useful!\n";
    //abs, pow, printf
     int number;
    cout << "Enter a Number. ";
   
    cin >> number;
    int absoluteValueOfNumber;
    int numberSquared;
    int numberCubed;
    absoluteValueOfNumber = abs(number);
    numberSquared = pow(number , 2);
    numberCubed = pow(number , 3);
    printf("The absolute value of %i is %i\n ", number , absoluteValueOfNumber); 
    printf("%i squared is %i", number , numberSquared);
    printf("%i cubed is %i", number , numberCubed);
    cout << "\a" << endl;
    
    return 0;
}

