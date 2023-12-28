/* 
 * File:   Volume.cpp
 * Author: Caelan Kimball
 *
 * Created on February 23, 2018, 11:25 AM
 */

#include <cstdlib>
#include <iostream>
#include <cstdio>

using namespace std;
//function prototypes
int boxVolume(int length, int height, int width);
//void function2();

/*
 * 
 */
int main(int argc, char** argv) {
    int length;
    int width, height;
    cout << "enter the length of your box: ";
    cin >> length;
    cout << "Enter the width of your box: ";
    cin >> width;
    cout << "Enter the height of your box: ";
    cin >> height;
    cout << "I have a box that is " << length << " by " << width << " by " << height <<". \n";
    cout << "The volume is: " << boxVolume(length, width, height);

    return 0;
}
int boxVolume(int length, int height, int width)
{
    int volume = length * width * height;
    return volume;
   
}

