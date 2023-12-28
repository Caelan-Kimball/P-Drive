/* 
 * File:   NumberProcessing.cpp
 * Author: Caelan Kimball
 *
 * Created on September 30, 2019, 12:44 PM
 */

#include <cstdlib>
#include <fstream>
#include <iostream>


using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    ifstream fileIn;
    int number;
    int numTotal = 0;
    int numSum;
    double average;
    
    fileIn.open("Random.txt");
    
    if(!fileIn){
        cout << "File open failure";
    }//test to see if file is open
    
    while (fileIn >> number) {
        numTotal++;
        numSum += number;
    }//end of while
    
    //calculate the average;
    average = (double)numSum / (double)numTotal; 
    
    //Code output
    cout << "The number of numbers in the file is " << numTotal << endl;
    cout << "the sum of all the numbers is " << numSum << endl;
    cout << "The average number is " << average << endl;
    
    fileIn.close();//close file to prevent memory leaks

    
    return 0;
}

