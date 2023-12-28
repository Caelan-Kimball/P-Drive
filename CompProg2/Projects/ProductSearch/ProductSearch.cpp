/* 
 * File:   ProductSearch.cpp
 * Author: Caelan Kimball
 *
 * Created on March 3, 2020, 1:03 PM
 */

#include <cstdlib>
#include <iostream>
#include <cstring>
#include <cstddef>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    //Create the const variables
    const int NUM_PRODS = 5; //Number of Products
    const int LENGTH = 27; // String Length

    //Array of products
    char products[NUM_PRODS][LENGTH] = {
        "TV327 31-inch Television",
        "CD257 CD Player",
        "TA677 Answering Machine",
        "CS109 Car Stereo",
        "PC955 Personal Computer"
    };
    char lookUp[LENGTH];
    char *strPtr = nullptr;
    int index; //Loop Counter
    char yOrN = 'Y';
    char garbage[1];

    //Prompt the user for a product number.
    do {
//        strPtr = nullptr;
//        lookUp = '\0';
        cout << "\tProduct Database\n\n";
        cout << "Enter a product number to search for: ";
        cin.getline(lookUp, LENGTH);

        //Search the array for the matching substring
        for (index = 0; index < NUM_PRODS; index++) {
            strPtr = strstr(products[index], lookUp);
            if (strPtr != nullptr) {
                break;
            }
        }
        //If a matching string was found, display the product info.
        if (strPtr != nullptr)
            cout << products[index] << endl;
        else
            cout << "No matching product was found.\n";
        
        cout << "Would you like to search for another item(Y or N)? ";
        cin >> yOrN;
        cout << endl;
        cin.getline(garbage,LENGTH);
    }while(yOrN == 'Y' ||yOrN == 'y');
    return 0;
}

