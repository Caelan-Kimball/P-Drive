/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:    NumCounter.cpp
 * Author: 020022
 *
 * Created on March 29, 2018, 11:19 AM
 */

#include <cstdlib>
#include <iostream>

using namespace std;
//global variable
int nextNumber = 0;

//function prototypes
int countByThrees();
void reset();

/*
 * 
 */
int main(int argc, char** argv) {
    //declare variables
    int maximum;
    do{
        cout << "How many threes would you like in your set? ";
        cin >> maximum;
        
        cout << "{";
        for(int x = 0; x <= maximum; x++)
        {
            cout << countByThrees() << " ";
        }
        cout << "}";
        cout <<'\n';
        reset();
        cout << "Request another series? Enter 0 to quit\n";
        
    }while(maximum != 0);

    return 0;
}
int countByThrees()
{
    int t;
    t = nextNumber;
    nextNumber += 3;
    return t;
    
}
void reset()
{
    nextNumber = 0;
}
  

