/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   OkieDokie.cpp
 * Author: Caelan Kimball
 *
 * Created on February 12, 2018, 11:21 AM
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
    //declare variables
    char string1[80];
    char string2[80];
    //acquire the strings
    cout << "Please input a string ";
    gets(string1);
    cout << "Please input the same string ";
    gets(string2);
    if (strlen(string1) == strlen(string2)) 
    {
        for (int x = 0; string1[x]; x++) 
        {
            string1[x] = toupper(string1[x]);
            string2[x] = toupper(string2[x]);
        }//end of for x
//        for (int y = 0; string2[y]; y++) 
//        {
//            
//        }//end of for y
        if (strcmp(string1, string2) == 0) 
        {
            cout << "The first string and the second string are the same when case is ignored\n";
        }//end of final output statement if strings are the same
        else 
        {
            cout << "The strings are not the same\n";
        }

    }//end of if using strlen


    return 0;
}

