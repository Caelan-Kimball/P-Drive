/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   ChangingCaseStrings.cpp
 * Author: Caelan Kimball
 *
 * Created on January 31, 2018, 11:18 AM
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
    char str[80];
    char *pntr = str;

    cout << "Enter some text please: ";
    gets(str);

    //access the string using the pointer name
    for (int m = 0; str[m]; m++) {
        str[m] = toupper(str[m]);
    }
    cout << str << endl;
    for (int n = 0; pntr[n]; n++) {
        pntr[n] = tolower(pntr[n]);
    }
    cout << pntr << endl;

    return 0;
}

