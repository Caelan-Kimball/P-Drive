/*
 *  Name: Caelan Kimball
 * Date: September 13, 2017
 * Program: IntroGreeting.cpp
 * File:   Intro.cpp
 * Asks your name and says hi
 */


#include <cstdlib>
#include <iostream>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    string name;
    cout << "What is your name?" << endl;
    cin >> name;
    cout << "Hello " << name << "." << endl;
}

