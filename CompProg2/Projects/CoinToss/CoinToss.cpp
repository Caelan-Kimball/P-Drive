/* 
 * File:   CoinToss.cpp
 * Author: Caelan Kimball
 *
 * Created on October 24, 2019, 12:42 PM
 */

#include <cstdlib>
#include <iostream>
#include <time.h>
#include <locale>
using namespace std;
void coinToss();

/*
 * 
 */
int main(int argc, char** argv) {
    //variable declaration
    int coinTosses;
    srand(time(NULL));
    
    cout << "Welcome to the Coin Toss Simulator.\n";
    cout << "How many times would you like to flip the coin? ";
    cin >> coinTosses;
    
    for(int x = 1; x <= coinTosses; x++){
        cout << "Flip " << x << endl;
        coinToss();
    }
    return 0;
}

void coinToss(){
    
    int headOrTail = rand() % 2 + 1;
    
    if(headOrTail == 1){
        cout << "Heads" << endl;
    }
    else{
        cout << "Tails" << endl;
    }
}

