/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   UpperLowerCount.cpp
 * Author: 020022
 *
 * Created on February 14, 2018, 11:10 AM
 */

#include <cstdlib>
#include <cstring>
#include <iostream>
#include <cstdio>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    //create variables
    char string[80];
    int upperCase;
    int lowerCase;
    //Get the string from user
    cout << "Please enter a sentence: ";
    gets(string);
    //Begin counting upper and lower case letters
    for(int x = 0; string[x]; x++)
    {
        if(isupper(string[x]))
        {
            upperCase++;
        }//end of finding out if char is upper
        if(islower(string[x]))
        {
            lowerCase++;
        }
        
    }
    cout << "There were " << upperCase << " upper case letters in your sentence.\n";
    cout << "There were " << lowerCase << " lower case letters in your sentence.\n";
    

    return 0;
}

