/* 
 * File:   Area.cpp
 * Author: Caelan Kimball
 *
 * Created on September 25, 2017, 11:21 AM
 */

#include <cstdlib>
#include <iostream>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    //declare variables
    int width = 0;
    int length = 0;
    
    // introduction
    cout << "let's find the area of a rectangle!" << endl;
    //user prompt
    cout << "enter the rectangles length ";
    cin >> length;
    cout << "enter the rectangles width ";
    cin >> width;
    int area = width * length;
    //begin output here
    cout << "Begin Execution\n" << endl;
    cout << width << " * " << length << " = " << area << endl;
    cout << "The area is " << area << " square units" << endl;
    cout << "Execution Terminated";
    

    return 0;
}

