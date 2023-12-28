/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   countp.cpp
 * Author: Caelan Kimball
 *
 * Created on December 6, 2017, 11:27 AM
 */

#include <cstdlib>
#include <iostream>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    char letter;
    int periodCount = 0;
    int totalCount = 0;
    
    //prompt user for input
    cout << "Enter a characters (enter a $ to stop)";
    do
    {
        cin >> letter;
        totalCount++;
        if(letter == '.')
        {
            periodCount++;
        }
    }while(letter != '$');//end of do-while
        
    cout << "The total characters entered was " << totalCount << endl;
    cout << "The total number of periods was " << periodCount << endl;
   
}

