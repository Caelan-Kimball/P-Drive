/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   SwapByReferences.cpp
 * Author: 020022
 *
 * Created on April 16, 2018, 11:18 AM
 */

#include <cstdlib>
#include <iostream>
#include <cstdio>

using namespace std;

//function prototypes 
void swap(int &x, int &y); // & means "address of"
int main(int argc, char** argv) {
    int a, b;
    cout << "Enter the value of a: ";
    cin >> a;
    cout << "Enter the value of b: ";
    cin >> b;
    cout << "The entered values for a and b: " << a << " and " << b << '\n';
    cout << "The entered values for a and b are located at: " << &a << " and " << &b << '\n'<<'\n';
    swap(a, b); // calls swap function does not require the & or *
    cout << "The swapped values of a and b: " << a << " and " << b << endl;
    cout << "The swapped values of a and b are located at: " << &a << " and " << &b << endl;
    
    

    return 0;
}
void swap(int &x, int &y)
{
    int z;
    z = x;
    x = y;
    y = z;
}
