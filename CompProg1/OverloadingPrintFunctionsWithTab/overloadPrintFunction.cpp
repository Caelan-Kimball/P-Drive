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
void println(char ch);
void println(char *str);
void println(double d);
//these do not output a newline
void print(bool b, int tab);
void print(int i, int tab);
void print(long i, int tab);
void print(char ch, int tab);
void print(char *str, int tab);
void print(double d, int tab);

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

    print("Here are some values: ", 10);
    print(false, 10);
    print(' ', 10);
    print(88, 10);
    print(' ', 10);
    print(100000L, 10);
    print(' ', 10);
    print(100.01, 10);

    println(" Done! ");
    return 0;
}

void println(bool b) {
    if (b)cout << "true\n";
    else cout << "false\n";
}

void println(int i) {
    cout << i << "\n";
}

void println(long i) {
    cout << i << "\n";

}

void println(char ch) {
    cout << ch << "\n";
}

void println(char *str) {
    cout << str << "\n";
}

void println(double d) {
    cout << d << "\n";
}

void print(bool b, int tab) {
    for (int x = 0; x < tab; x++) {
        cout << " ";
    }
    if (b)cout << "true";
    else cout << "false";
}

void print(int i, int tab) {
    for (int x = 0; x < tab; x++) {
        cout << " ";
    }
    cout << i;
}

void print(long i, int tab) {
    for (int x = 0; x < tab; x++) {
        cout << " ";
    }
    cout << i;

}

void print(char ch, int tab) {
    for (int x = 0; x < tab; x++) {
        cout << " ";
    }
    cout << ch;
}

void print(char *str, int tab) {
    cout << str;
}

void print(double d, int tab) {
    for (int x = 0; x < tab; x++) {
        cout << " ";
    }
    cout << d;
}


