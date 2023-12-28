/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   OverRead.cpp
 * Author: 020022
 *
 * Created on January 30, 2018, 11:24 AM
 */

#include <cstdlib>
#include <iostream>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    int eggs[6];
    int *pntr = NULL;
    
    cout << "Leftover data in the \"empty\" eggs array:" << endl;
    for(int t = 0; t < 6; t++)
    {
        pntr = &eggs[t];
        cout << "The eggs array element: " << t << " at " << pntr << " is " << eggs[t] << endl; 
    }//end of for loop t
    cout << endl;
    for(int u = 0; u < 6; u++)
    {
        eggs[u] = u * u;
        
    }//end of for loop using u
   
    
    cout << "The First 4 elements of the newly filled egg array;" << endl;
    for(int v = 0; v < 4; v++)
    {
        pntr = &eggs[v];
        cout << "The eggs array, element " << v << " at " << &eggs[v] << " is " << *pntr++ << endl;
    }//end of for loop v
    cout << endl;
    //reading values beyond the array
    cout << "\"Over-Reading\" the eggs array.\n";
    for(int w = 4; w < 9; w++)
    {
        cout << "The eggs array, reading passed the end: at " << &eggs[w] << " is " << eggs[w] << endl;
    }

    return 0;
}

