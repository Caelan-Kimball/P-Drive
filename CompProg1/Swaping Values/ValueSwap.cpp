/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   ValueSwap.cpp
 * Author: 020022
 *
 * Created on March 7, 2018, 11:20 AM
 */

#include <cstdlib>
#include <iostream>


using namespace std;
void swap(int *x, int *y);
/*
 * 
 */
int main(int argc, char** argv) {
    int j, k;
    j = 50;
    k = 250;
    
    cout << "The initial value of j is: " << j;
    cout << " and the value of k is: " << k << '\n';
    
    swap(&j, &k);
    
    cout << "The swapped values of j and k are:  " << j << " and " << k << '\n';
    
    

    return 0;
}
void swap(int *x, int *y)
{
    int temp;
    temp = *x;// store x till later use
   *x = *y;// put y into x
   *y = temp;//put x into y
   
}

