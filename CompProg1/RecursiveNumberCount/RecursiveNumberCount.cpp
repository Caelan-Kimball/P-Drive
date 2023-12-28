/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   RecursiveNumberCount.cpp
 * Author: Caelan Kimball
 *
 * Created on April 5, 2018, 11:21 AM
 */

#include <cstdlib>
#include <iostream>

using namespace std;
void printNumbers(int x);

/*
 * 
 */
int main(int argc, char** argv) 
{
    int number;
    cout << "Enter a  number: ";
    cin >> number;
    printNumbers(number);
    cout << endl;
    return 0;
}
void printNumbers(int x)
{
    
    if(x > 1)
        printNumbers( x - 1 );
    cout << x << " ";
}

