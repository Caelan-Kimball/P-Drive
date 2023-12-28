/* 
 * File:   ArrayAllocator.cpp
 * Author: Caelan Kimball
 *
 * Created on February 13, 2020, 12:40 PM
 */

#include <cstdlib>
#include <memory>
#include <iostream>
int *dynamicAllocator(int size);
using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    int size;
    unique_ptr<int> *ptrArray(new int);
    cout << "Enter the number of integers you would like to allocate memory for: ";
    cin >> size;
    *ptrArray = dynamicAllocator(size);
    
    return 0;
}
int* dynamicAllocator(int size){
    int *ptrArray [size];
    return *ptrArray;
}
