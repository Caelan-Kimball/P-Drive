/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   PhoneBook.cpp
 * Author: 020022
 *
 * Created on January 25, 2018, 11:21 AM
 */

#include <cstdlib>
#include <cstdio>
#include <iostream>
#include <cstring>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    
    int index;
    char name[80];
    char phoneBook[10][80] = {
        "Jenny", "867-5309",
        "Billy", "345-1052",
        "Tom Jones", "555-6852",
        "Danny", "555-3252",
        "Inky" , "300-6663"
    };
    //user input
    cout << "Look up a contact.\n";
    cout << "Enter name: ";
    gets(name);
    //Search for the contact
    for(index = 0;index < 10 ;index +=2 ){
        if(strcmp(name, phoneBook[index]) == 0)
        {
            cout << "Name: " << name << '\n';
            cout << "Number is " << phoneBook[index + 1] << "\n";
            break;
        }
        
    }
    if(index == 10)
        cout << "Contact not Found";

    return 0;
}

