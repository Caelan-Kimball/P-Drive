/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   arraySample1.cpp
 * Author: Caelan Kimball
 *
 * Created on January 10, 2018, 11:07 AM
 */

#include <cstdlib>
#include <iostream>
#include <cstdio>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    int list[8];// = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8};
    list[0] = 1;
    list[1] = 2;
    list[2] = 3;
    list[3] = 4;
    list[4] = 5;
    list[5] = 6;
    list[6] = 7;
    list[7] = 8;
    
    cout << "list[0] contains " << list[0] << endl;
    
    printf( "list[1] contains %i\n", list[1]);
    cout << "list[2] contains " << list[2] << endl;
    cout << "list[3] contains " << list[3] << endl;
    cout << "list[4] contains " << list[4] << endl;
    cout << "list[5] contains " << list[5] << endl;
    cout << "list[6] contains " << list[6] << endl;
    cout << "list[7] contains " << list[7] << endl;
    

    return 0;
}

