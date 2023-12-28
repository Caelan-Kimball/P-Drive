/* 
 * File:   RangeBasedArrays.cpp
 * Author: Caelan Kimball
 *
 * Created on January 13, 2020, 1:05 PM
 */

#include <cstdlib>
#include <iostream>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    string foods[] = {"Pizza", "Corndog", "Spaghetti", "Ham", "Cinnamon Twist", "Hamburger"};
    
    for(string food : foods){
        cout << "I like to eat " << food << endl;
    }
    return 0;
}

