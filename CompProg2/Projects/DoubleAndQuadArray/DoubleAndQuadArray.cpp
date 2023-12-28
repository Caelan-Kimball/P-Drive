/* 
 * File:   DoubleAndQuadArray.cpp
 * Author: Caelan Kimball
 *
 * Created on January 17, 2020, 1:07 PM
 */

#include <cstdlib>
#include <iostream>

using namespace std;
void doubleArray(int array[], int size);
void quadArray(int array[], int size);
void showValues(int array[], int size);

int main(int argc, char** argv) {
    const int ARRAY_SIZE = 7;
    int set[ARRAY_SIZE] = {1, 2, 3, 4, 5, 6, 7};

    //display the initial values
    cout << "The array's values are:\n";
    showValues(set, ARRAY_SIZE);

    //Double the array values
    doubleArray(set, ARRAY_SIZE);

    //Display the results of the double
    cout << "After calling doubleArray the values are:\n";
    showValues(set, ARRAY_SIZE);

    //Quadruple the array values
    quadArray(set, ARRAY_SIZE);

    //Display the results of the quadruple
    cout << "After calling quadArray the values are:\n";
    showValues(set, ARRAY_SIZE);
    return 0;
}

void doubleArray(int array[], int size) {
    for (int index = 0; index < size; index++) {
        array[index] *= 2;
    }
}

void quadArray(int array[], int size) {
    for (int index = 0; index < size; index++) {
        array[index] *= 4;
    }
}

void showValues(int array[], int size) {
    for (int index = 0; index < size; index++) {
        cout << array[index] << " ";
    }
    cout << endl;
}