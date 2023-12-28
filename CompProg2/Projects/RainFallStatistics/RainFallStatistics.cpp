/* 
 * File:   RainFallStatistics.cpp
 * Author: Caelan Kimball
 *
 * Created on January 9, 2020, 12:47 PM
 */

#include <cstdlib>
#include <iostream>


using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    const int ARRAY_SIZE = 12;
    double rainFall[ARRAY_SIZE];
    double rainFell;
    double totalRain = 0;
    double averageRain;
    double highestRain = 0;
    double highMonth, lowMonth;
    double lowestRain = 0;
    int count;

    for (count = 0; count < ARRAY_SIZE; count++) {
        cout << "Enter the amount of rainfall for month " << count + 1 << " in inches: ";
        cin >> rainFell;
        while (rainFell < 0) {
            cout << "Please enter a positive number: ";
            cin >> rainFell;
        }
        rainFall[count] = rainFell;
    }
    for (count = 0; count < ARRAY_SIZE; count++) {
        totalRain += rainFall[count];
    }
    lowestRain = rainFall[0];
    for (count = 0; count < ARRAY_SIZE; count++) {

        if (rainFall[count] < lowestRain) {
            lowestRain = rainFall[count];
            lowMonth = count + 1;
        }
        if (rainFall[count] > highestRain) {
            highestRain = rainFall[count];
            highMonth = count + 1;
        }
    }
    averageRain = totalRain / 12;

    cout << "\nTotal Rainfall: " << totalRain;
    cout << "\nAverage Rainfall: " << averageRain;

    if (highMonth == 1) {
        cout << "\nThe highest rainfall was " << highestRain << "\" in the " << highMonth << "st month";
    } else if (highMonth == 2) {
        cout << "\nThe highest rainfall was " << highestRain << "\" in the " << highMonth << "nd month";
    } else if (highMonth == 3) {
        cout << "\nThe highest rainfall was " << highestRain << "\" in the " << highMonth << "rd month";
    } else {
        cout << "\nThe highest rainfall was " << highestRain << "\" in the " << highMonth << "th month";
    }


    if (lowMonth == 1) {
        cout << "\nThe lowest rainfall was " << lowestRain << "\" in the " << lowMonth << "st month";
    } else if (lowMonth == 2) {
        cout << "\nThe lowest rainfall was " << lowestRain << "\" in the " << lowMonth << "nd month";
    } else if (lowMonth == 3) {
        cout << "\nThe lowest rainfall was " << lowestRain << "\" in the " << lowMonth << "rd month";
    } else {
        cout << "\nThe lowest rainfall was " << lowestRain << "\" in the " << lowMonth << "th month";
    }




    return 0;
}

