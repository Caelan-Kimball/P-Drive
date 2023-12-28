/* 
 * File:   functionsPartTwo.cpp
 * Author: Caelan Kimball
 *
 * Created on November 13, 2019, 12:23 PM
 */

#include <cstdlib>
#include <iostream>

using namespace std;
//function prototype
void anotherFunction();
int num = 2;

/*
 * 
 */
int main(int argc, char** argv) {

    cout << "In main num is " << num << endl;
    anotherFunction();
    cout << "Back in main, num is "<< num << endl;

    return 0;
}

//anotherFunction definition

void anotherFunction() {
    cout << "In anotherFunction, num is " << num << endl;
    num = 50;
    cout << "But, it is now changed to " << num << endl;
}

