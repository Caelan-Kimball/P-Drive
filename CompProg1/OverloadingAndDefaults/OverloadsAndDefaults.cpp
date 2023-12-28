/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   OverloadsAndDefaults.cpp
 * Author: Caelan Kimball
 *
 * Created on April 23, 2018, 11:29 AM
 */

#include <cstdlib>
#include <iostream>

using namespace std;
//function prototypes
void walk(string animal = "creature");
void walk(int steps, string animal = "beast");
void walk(double steps);
int main(int argc, char** argv) {
    walk(21, "unicorn");
    walk("Cow");
    walk(15);
    walk();
    walk(12.88);
    walk(4.0 , "dragon");

    return 0;
}
// function definitions
void walk(string animal)
{
    int steps = 10;
    walk(steps, animal);//call other overloaded function
    //cout << "This " << animal << " is taking " << steps << " steps" << endl;
    
}
void walk(int steps, string animal)
{
    cout << "This " << animal << " is taking " << steps << " steps.\n";
}
void walk(double steps)
{
    cout << "The animal takes " << steps << " partial steps.\n";
}


