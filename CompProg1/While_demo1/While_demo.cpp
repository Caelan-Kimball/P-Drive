/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   While_demo.cpp
 * Author: Caelan Kimball
 *
 * Created on November 30, 2017, 11:12 AM
 */

#include <cstdlib>
#include <iostream>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    
    int loopCount = 1;
    
    
    while(loopCount <= 10)
    {
        cout << "This is loop " << loopCount << ".\n";
        loopCount++;
    }
    char ch = 32;
    while(ch)
    {
        cout << ch << " ";
        ch++;
        
        if (ch % 32 == 0)
            cout << endl;
    }

    return 0;
}

