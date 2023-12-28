/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   primeNum.cpp
 * Author: 020022
 *
 * Created on November 7, 2017, 11:29 AM
 */

#include <cstdlib>
#include <iostream>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    cout << "Prime Number ";
    //Compute and display prime numbers
    for (int n = 1; n <= 10000; n++) {
        bool isPrime = true;
        for (int k = 2; k <= n / 2; k++) {
            if (n % k == 0) {
                isPrime = false;
            }//end of if

        }//end of k
        if (isPrime) {
            cout << n << " ";
        }
    }//end of n
    cout << endl;

    return 0;
}

