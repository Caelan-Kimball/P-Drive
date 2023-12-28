/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   reciprocal.cpp
 * Author: 020022
 *
 * Created on April 11, 2018, 11:41 AM
 */

#include <cstdlib>
#include <iostream>

using namespace std;
//function prototypes
double reciprocal(double x);

int main(int argc, char** argv) {

    double t = 10.0;
    do {


        cout << "Enter the number you would like to find the reciprocal of(Enter zero to stop): ";
        cin >> t;
        if (t != 0)
        {
            cout << "reciprocal of " << t << " is " << reciprocal(t) << endl;
            cout << "Value of t is still " << t << endl;
        }
        else
        {
            cout << "Have a nice day. Good bye\n";
        }


    } while (t != 0);
    return 0;
}

double reciprocal(double x) {
    return 1 / x;
}

