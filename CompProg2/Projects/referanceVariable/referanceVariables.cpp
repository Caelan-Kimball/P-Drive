/* 
 * File:   referanceVariables.cpp
 * Author: Caelan Kimball
 *
 * Created on November 19, 2019, 12:45 PM
 */

#include <cstdlib>
#include <iostream>

using namespace std;
//Function prototypes. Use reference variables
void doubleNum(int &refNum);
void getNum(int &refNumb);

/*
 * 
 */
int main(int argc, char** argv) {
    int value;
    
    //Get a number and store it in value.
    getNum(value);
    
    //Double the number stored in value
    doubleNum(value);
    
    //Display the resulting number.
    cout << "That value doubled is " << value << endl;
    return 0;
}
//getNum definition
void getNum(int &userNum){
    cout << "Enter a number: ";
    cin >> userNum;
}
//doubleNum definition
void doubleNum(int &refVar){
    refVar *= 2;
}

