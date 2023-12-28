/* 
 * File:   ChipsAndSalsa.cpp
 * Author: Caelan Kimball
 *
 * Created on January 14, 2020, 12:47 PM
 */

#include <cstdlib>
#include <iostream>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    const int SIZE = 5;
    string salsa[SIZE] = {"Mild", "Medium", "Sweet", "Hot", "Zesty"};
    int numSold[SIZE];
    int numSoldEnter = 0;
    string lowSalsa, highSalsa;
    int highJarsSold, lowJarsSold;


    for (int i = 0; i < SIZE; i++) {
        cout << "How many jars of the " << salsa[i] << " salsa were sold? ";
        cin >> numSoldEnter;
        while (numSoldEnter < 0) {
            cout << "Enter a positive number of jars sold: ";
            cin >> numSoldEnter;
        }

        numSold[i] = numSoldEnter;
    }//end of for loop 1
    
    lowJarsSold = numSold[0];

    for (int count = 0; count < SIZE; count++) {

        if (numSold[count] < lowJarsSold) {
            lowJarsSold = numSold[count];
            lowSalsa = salsa[count];
        }//acquires the lowest selling salsa
        if (numSold[count] > highJarsSold) {
            highJarsSold = numSold[count];
            highSalsa = salsa[count];
        }//acquires the highest selling salsa
    }// end of sorting loop

    for (int i = 0; i < SIZE; i++) {
        cout << "Salsa type: " << salsa[i] << endl;
        cout << "Number of Jars sold: " << numSold[i] << endl;
    }//end of for loop 2
    cout << "\nThe salsa that sold best was the " << highSalsa << " salsa" << endl;
    cout << "The salsa that sold the least was the " << lowSalsa << " salsa" << endl;


    return 0;
}

