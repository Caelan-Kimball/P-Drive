/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Priceisright.cpp
 * Author: Caelan Kimball
 *
 * Created on November 15, 2017, 11:11 AM
 */

#include <cstdlib>
#include <iostream>
#include <time.h>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    srand(time(NULL));
    int luckyNum = rand() %10 + 1;
    int guessNum;
    int score = 100;
    
    cout << "Guess the lucky number(1-10): ";
    cin >> guessNum;
    do{
    if(guessNum == luckyNum)
    {
        cout << "Way to go you guessed the lucky number\n";
    }//end of if1
    if(guessNum > luckyNum)
    {
        cout << "Guess lower: ";
        cin >> guessNum;
        score = score - 10;
    }
    if(guessNum < luckyNum)
    {
        cout << "Guess Higher ";
        cin >> guessNum;
        score = score - 10;
    }//end of else
    }while(guessNum != luckyNum);//end of do loop
    
    cout << "The lucky number was " << luckyNum << "\n";
    cout << "And your score was " << score << "!" ;

    //return 0;
}

