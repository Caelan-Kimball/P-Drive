/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   StringSample1.cpp
 * Author: 020022
 *
 * Created on January 18, 2018, 11:10 AM
 */

#include <cstdlib>
#include <iostream>
#include <cstring>
#include <cstdio>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) 
{
    //declare 2 character array 80 characters long(for 2 strings)
    char string1[80];
    char string2[80];
    cout << "The length of string1: " << strlen(string1) << endl;
    cout << "The length of string2: " << strlen(string2) << endl;
    // ask the user to enter their name
    cout << "Please type your first and last name ";
    cin >> string1;
    cin.ignore(80, '\n');
    
   // output the first array and its length
    cout << "Your first string read as " << string1 << " using cin. " 
            << "It contains " << strlen(string1) << " characters. \n";
    cout << "Please enter your full name: ";
    gets(string2);
    cout << "Your second string read as " << string2 << " using gets. "
            << "it contains " << strlen(string2) << " characters.\n";
    
    return 0;
}

