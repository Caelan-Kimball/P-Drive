/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   CmdLnAdd.cpp
 * Author: 020022
 *
 * Created on April 2, 2018, 11:43 AM
 */

#include <cstdlib>
#include <iostream>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    if(argc < 2)
    {
        cout << "command line arguments required\n proper usage: cmdlnadd value1 value2\n";
    }
    else
    {
        float a = atof(argv[1]);
        double b = atof(argv[2]);
        cout << a << " + " << b << " = " << (a + b) << "\n";
    }

    return 0;
}

