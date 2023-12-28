/* 
 * File:   a2main.cpp
 * Author: Caelan Kimball
 *
 * Created on February 18, 2020, 12:53 PM
 */

#include <cstdlib>
#include <iostream>
#include <cmath>

using namespace std;
double median(int *, int size);
int mode(int *, int size);
double average(int *, int size);
void selectionSort(int [], int size);
int *makeArray(int size);
void getMovieData(int *, int size);
void swap(int data[], int x, int y);
int findMinimum(int data[], int first, int size);

/*
 * 
 */
int main(int argc, char** argv) {
    int size = 0;
    double avg = 0;
    double mid = 0;
    int md = 0;
    int *arr;
    cout << "How big is your sample size? ";
    cin >> size;
    while (size < 0) {
        cout << "Enter a positive number... ";
        cin >> size;
    }
    arr = makeArray(size);
    getMovieData(arr, size);
    avg = average(arr, size);
    md = mode(arr, size);
    selectionSort(arr, size);
    mid = median(arr, size);

    //    for(int x  = 0;x < size;x++ ){
    //        cout << arr[x] << endl;
    //    }

    cout << "\nAverage: " << avg << "\nMedian: " << mid << "\nMode: " << md;

    delete arr;

    return 0;
}

int* makeArray(int size) {
    int *ptrArray = new int[size];
    return ptrArray;
}

double median(int *arr, int size) {
    double theMedian;
    int medianLocation = size / 2;
    //    cout << medianLocation;
    if (medianLocation % 2 == 1) {
        theMedian = ((double) arr[medianLocation] + arr[medianLocation - 1]) / 2;
    } else {
        theMedian = arr[medianLocation];
    }
    return theMedian;
}

int mode(int *arr, int size) {
    int moder;
    int numOfOccureances = 0;
    int counter = 0;
    int mode = -1;
    for (int x = 0; x < size; x++) {
        moder = arr[x];
        for (int y = 0; y < size; y++) {
            if (arr[y] == arr[x]) {
                counter++;
                if (counter > numOfOccureances) {
                    numOfOccureances = counter;
                    mode = moder;
                }
            }
        }//end of for loop y
        counter = 0;
    }//end of for loop x
    return mode;

}

double average(int *arr, int size) {
    double total = 0;
    for (int x = 0; x < size; x++) {
        total += arr[x];
    }
    return total / size;
}

void getMovieData(int *arr, int size) {
    int input = 0;
    for (int x = 0; x < size; x++) {
        cout << "How many movies did student " << x + 1 << " watch? ";
        cin >> input;
        while (input < 0) {
            cout << "Enter a positive number... ";
            cin >> input;
        }
        arr[x] = input;
    }
}

void selectionSort(int arr[], int size) {
    for (int i = 0; i < size; i++) {
        int minIndex = findMinimum(arr, i, size);
        if (minIndex != i) {
            swap(arr, i, minIndex);
        }//end of if
    }//end of for
}//end of selectionSort    

int findMinimum(int data[], int first, int size) {
    int minIndex = first;
    for (int j = first + 1; j < size; j++) {
        if (data[j] < data[minIndex]) {
            minIndex = j;
        }//end of if
    }//end of for
    return minIndex;
}//end of findMinimum

void swap(int data[], int x, int y) {
    int temp = data[x];
    data[x] = data[y];
    data[y] = temp;
}//end of swap
