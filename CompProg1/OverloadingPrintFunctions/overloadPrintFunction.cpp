/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   overloadPrintFunction.cpp
 * Author: 020022
 *
 * Created on April 26, 2018, 11:03 AM
 */

#include <cstdlib>
#include <iostream>

using namespace std;
// these output a newline
void println(bool b);
void println(int i);
void println(long i);
void println (char ch);
void println(char *str);
void println(double d);
//these do not output a newline
void print(bool b);
void print(int i);
void print(long i);
void print(char ch);
void print(char *str);
void print(double d);

/*
 * 
 */
int main(int argc, char** argv) {
    println(true);
    println(10);
    println("This is a test");
    println('x');
    println(99L);
    println(123.23);
    
    print("Here are some values: ");
    print(false);
    print(' ');
    print(88);
    print(' ');
    print(100000L);
    print(' ');
    print(100.01);
    
    println(" Done! ");
    return 0;
}
void println(bool b)
{
    if(b)cout << "true\n";
    else cout << "false\n";
}
void println(int i)
{
    cout << i << "\n";   
}
void println(long i)
{
    cout << i << "\n";
    
}
void println(char ch)
{
   cout << ch << "\n";
}
void println(char *str)
{
    cout << str << "\n";
}
void println(double d)
{
    cout << d << "\n";
}
void print(bool b)
{
    if(b)cout << "true";
    else cout << "false";
}
void print(int i)
{
    cout << i;   
}
void print(long i)
{
    cout << i;
    
}
void print(char ch)
{
   cout << ch;
}
void print(char *str)
{
    cout << str;
}
void print(double d)
{
    cout << d;
}


