/* 
 * File:   BubbleSort.cpp
 * Author: Caelan Kimball
 *
 * Created on January 12, 2018, 11:33 AM
 */

#include <cstdlib>
#include <cstdio>
#include <iostream>
#include <ctime>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    int size = 12;
    int numbers[size];
    srand(time(NULL));
    //assign numbers to array
    int x  = 2;
    int y = 2 * x++;
    cout << x << y;
    for (int n = 0; n < size; n++) {

        numbers[n] = rand() % 10000;
    }// Generate the array values. End of for loop 1
    cout << "The Original Array of Numbers\n";
    for (int n = 0; n < size; n++) {
        cout << numbers[n] << ' ';
    }// Output the Array values. End of for loop 2
    cout << "\n" << endl;
    for (int a = 1; a < size; a++) {
        for (int b = size - 1; b >= a; b--) {
            if (numbers[b - 1] > numbers[b]) //if out of order
            {
                //exchange the elements
                int temp = numbers[b - 1];
                numbers[b - 1] = numbers[b];
                numbers[b] = temp;
            }//end of if loop
        }//end of loop b
    }//end of loop a
    cout << "The Sorted Array of Numbers\n";
    for (int n = 0; n < size; n++) {
        //display the sorted array
        cout << numbers[n] << ' ';
    }
    cout << "\n\n";


    return 0;
}

