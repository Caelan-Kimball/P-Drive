/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   MoreString.cpp
 * Author: 020022
 *
 * Created on January 22, 2018, 11:18 AM
 */

#include <cstdlib>
#include <cstring>
#include <cstdio>
#include <iostream>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    char string1[80];
    char string2[80];
    char string3[80], string4[80];
    
    strcpy(string1, "C++");
    strcpy(string2, " is power programming.");
    
    //display string 1
    cout << "String 1 is: ";
    for(int k = 0; k < strlen(string1); k++)
    {
        cout << string1[k];
    }
    cout << '\n';
    
    //display the second string without the for loop
    cout << "String 2 is: " << string2 << '\n';
    
    cout << "Enter a string, a.k.a. sentence below.\n";
    cin >> string3;
    std::cin.ignore(80,'\n');
    cout << "Enter another string. \n";
    gets(string4);
    
    cout << "String lengths: \n";
    cout << "\tString 1:\t " << strlen(string1) << endl;
    cout << "\tString 2:\t " << strlen(string2) << endl;
    cout << "\tString 3:\t " << strlen(string3) << endl;
    cout << "\tString 4:\t " << strlen(string4) << endl;
    //compares
    cout << "Difference between string1 vs. string2: " << strcmp(string1, string2) << '\n';
    cout << "Difference between string2 vs. string3: " << strcmp(string2, string3) << "\n";
    cout << "Difference between string3 vs. string4: " << strcmp(string3, string4) << "\n";
    cout << "Difference between string4 vs. string1: " << strcmp(string4, string1) << "\n";
    strcat(string1, string2);
    cout << string1 << '\n';
    
    //copy the string now
    strcpy(string2, string1);
    
    //compare string 1 and 2 again
    if(!strcmp(string1,string2))
        cout << "String 1 and String 2 are now the same.\n";
    else
        cout << "String 1 and String 2 are not the same.\n";
    
    //display the strings again
    cout <<  "string1 is: " << string1 << endl;
    cout <<  "string2 is: " << string2 << endl;
    cout <<  "string3 is: " << string3 << endl;
    cout <<  "string4 is: " << string4 << endl;
    
    
    
        

    return 0;
}

