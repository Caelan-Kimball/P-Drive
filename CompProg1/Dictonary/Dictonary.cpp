/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Dictonary.cpp
 * Author: 020022
 *
 * Created on February 6, 2018, 11:30 AM
 */

#include <cstdlib>
#include <iostream>
#include <cstring>
#include <cstdio>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    char *dictionary[][2] = {
        "append", "To add as a supplement, accessory, or appendix",
        "compatible", "capable of being used together without special modification or adaptation",
        "concatenation", "connection, as in a chain",
        "category","any general or comprehensive division; a class",
        "encounter", "To come upon or meet with,  especially unexpectedly",
        "lexicographically", "In dictionary order",
        "library", "a collection of subroutines and functions stored in one or more files, for linking with other programs",
        "manipulate", "To adapt or change",
        "precise", "definitely or strictly stated, defined, or fixed",
        "string", "In c++, a null-terminated character array used to store a text value; that represents sequences of characters",
        "", ""  
    };
    char word[80];
    int index;
    
    while(strcmp(word, "ZZZ"))
    {
        cout << "Welcome to the Digital Dictionary\n";
        cout << "Search for a word or enter ZZZ to exit.\n";
        cout << "Enter a word ";
        gets(word);
        for(index = 0; *dictionary[index][0]; index++)
        {
            if(strcmp(dictionary[index][0], word) == 0)
            {
                cout << dictionary[index][1] << "\n";
                break;// found it, stop looking 
            }//end of strcmp if statement
        }//end of for loop 1
        if(!*dictionary[index][0])
            cout << "word not found";
    }//end of while
    cout << "Good bye"; 

    return 0;
}

