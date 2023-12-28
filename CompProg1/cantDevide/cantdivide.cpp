/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   cantdivide.cpp
 * Author: Caelan Kimball
 *
 * Created on November 14, 2017, 11:22 AM
 */

#include <cstdlib>
#include <iostream>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    //declare variables
    double michale;
    double dwight; // denominator
    //Input the variables
    cout << "We are going to divide two numbers\n";
    cout  << "Enter the numerator: ";
    cin >> michale;
    cout << "Enter the denominator: ";
    cin >> dwight;
    if (dwight == 0)
    {
        cout << "Error 4205 You done messed up son you can't devide by zero\n";
    }
    else
    {
        cout << michale /dwight;
    }
    
    

    return 0;
}

