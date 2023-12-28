/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   UpperCase.cpp
 * Author: 020022
 *
 * Created on December 13, 2017, 11:11 AM
 */

#include <cstdlib>
#include <iostream>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    
    char ch;
    
    cout << "type here: ";
    
    while(ch != '.')
    {
        cin >> ch;
        
        if(ch >= 'a' && ch <= 'z')
        {
            ch = (char)(ch - 32);
        } 
        cout << ch;
    } 
    cout << "\n";
    return 0;
}

