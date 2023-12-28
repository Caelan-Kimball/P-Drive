/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   FindingDupicates.cpp
 * Author: Caelan Kimball
 *
 * Created on February 7, 2018, 11:09 AM
 */

#include <cstdlib>
#include <iostream>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    
    //create an array of ints
    int nemo[] = {1, 2, 3, 3, 4, 56, 5, 6, 7, 7, 8, 9, 4, 56, 1};
    for(int g = 0; g < 15; g++)
    {
        for(int q = g+1; q < 15; q++)
        {
            if(nemo[g] == nemo[q])
            {
                cout << "Duplicate Found: " << nemo[g] <<"\n";
            }//end of if statement
            
        }//end of for loop q
        
    }//end of for loop g
    
        


    return 0;
}

