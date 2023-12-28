/* 
 * File:   proverbs.cpp
 * Author: Caelan Kimball
 *
 * Created on November 27, 2017, 11:24 AM
 */

#include <cstdlib>
#include <iostream>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    int choice; //selection variable must be an int or char
    cout << "Welcome to the Proverb Selector\n";
    
    cout << "Enter a number between 1 and 3 ";
    cin >> choice;
    
    switch( choice )
    {
        case 1:
            cout << "A rolling stone gathers no moss." << endl;
            break;
        case 2:
            cout << "A journey of a thousand miles \n" << "begins with a single step" << endl;
            break;
        case 3:
            cout << "The past is far behind us the future doesn't exist" << endl;
            break;
        default:
            cout << "Tell me, I forget.\nShow me, I remember.\nInvolve me, I understand.\n" << endl;
    }

    return 0;
}

