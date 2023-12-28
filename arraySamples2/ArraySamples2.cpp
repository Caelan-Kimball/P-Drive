/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   ArraySamples2.cpp
 * Author: Caelan Kimball
 *
 * Created on January 11, 2018, 11:28 AM
 */

#include <cstdlib>
#include <iostream>
#include <cstdio>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    //declare size variable
    int size = 80000;
    //declare array that size
    int list[size];
    //create for loop to assign values
    for(int x = 0;x < size; x++ )
    {
        list[x] = x;
        cout  << "list[" << x << "] = " << list[x] << endl;
    }

    return 0;
}

