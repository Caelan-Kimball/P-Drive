/* 
 * File:   TypeCast.cpp
 * Author: Caelan Kimball
 *
 * Created on November 6, 2017, 11:33 AM
 */

#include <cstdlib>
#include <iostream>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    int n; 
    int c;
    for(n = 1; n <=6; n++)
    {
        cout << n << " / 5 is " << n / 5 << endl;
    }
     cout << "--------------------------------------\n";
     for(n = 1; n <=6; n++)
    {
        cout << n << " / 5 is " <<(double)n / 5 << endl;
    }
     cout << "--------------------------------------\n";
     
     //This will cast an int as a char
     for(c = 32; c <= 127; c++){
         cout << (char)c << " ";
         if(c == 79) cout << "\n";
     }
     cout << "\n";
         

    return 0;
}

