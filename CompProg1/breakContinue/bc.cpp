/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   bc.cpp
 * Author: 020022
 *
 * Created on December 5, 2017, 11:22 AM
 */

#include <cstdlib>
#include <iostream>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    for(int n = 1; n <= 4; n++)
    {
        cout << "outer loop " << n <<endl;
        for(int x = 1; x <= 16; x++)
        {
            cout << x <<" ";
           if(x == 7)
           {
               cout << "breaking";
               break;
           }//end of if
        }//end of for loop x
        cout << "\nThis statement runs after the first inner loop is done\n";
        for(int m = 1; m <= 16; m++)
        {
            
            if(m == 7)
            {
                cout << "continuing ";
                continue;
            }//end of if
            cout << m <<" ";
        }//end of loop m
        cout << "\nThis statement runs after the second inner loop is finished\n";
    }//end of for loop n

    return 0;
}

