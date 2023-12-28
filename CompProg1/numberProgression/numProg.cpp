/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   numProg.cpp
 * Author: 020022
 *
 * Created on December 7, 2017, 11:29 AM
 */

#include <cstdlib>
#include <iostream>
using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    //int num = 1;
    cout << "Number Progression Using \"for\" Loops" << endl;
    for(int x = 1; x <= 65356 ; x += x)
    {
        cout << x << " ";
    }
    //num = 1;
    cout << "\n";
    for(int x = 1; x <= 65356  ; x *= 2)
    {
        cout << x << " ";
    }
    cout << "\nHave a nice day.\n";


    return 0;
}

