/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   ScopeEx.cpp
 * Author: Caelan Kimball
 *
 * Created on February 28, 2018, 11:24 AM
 */

#include <cstdlib>
#include <iostream>
#include <cstdio>

using namespace std;
//prototype functions
void fun1();
//create global variable
int value = 1000;

/*
 * 
 */
int main(int argc, char** argv) {
    cout << "global \"value\": " << value << '\n';
    int value = 10;
    cout << "local \"value\": " << value << '\n';
    fun1();
    cout << "local \"value\": " << value << '\n';
    cout << "global \"value\": "<< value << "(notice how this is incorrect)\n";
    
    

    return 0;
}
void fun1()
{
    int value = 8088;//value local to fun1())
    cout << "\"value\" in fun1(): " << value << '\n';
    
}
