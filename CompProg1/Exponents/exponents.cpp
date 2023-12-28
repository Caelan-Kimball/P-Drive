/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   exponents.cpp
 * Author: 020022
 *
 * Created on February 27, 2018, 11:25 AM
 */

#include <cstdlib>
#include <iostream>
#include <cstring>
#include <cmath>

using namespace std;
//function prototypes
int exponents(int base, int exponent);

/*
 * 
 */
int main(int argc, char** argv) {
    int base, exponent;
    char yn[4];
    do{
    cout << "Enter the base: ";
    cin >> base;

    cout << "Enter the exponent: ";
    cin >> exponent;

    //cout << base << " To the " <<  exponent << " = ";
    exponents(base, exponent);
    
    cout << "\nWould you like to calculate again(y/n): ";
    cin >> yn;
    }while(strcmp(yn, "y") == 0 );

    return 0;
}
// define the function

int exponents(int base, int exponent) {
    int solution = 1;
    if (exponent <= 0) {
        cout << "We can not work with Negative exponents";
        return 0;
    }
    for (int x = 0; x < exponent; x++) {
        solution *= base;
    }

    cout << solution;

}

