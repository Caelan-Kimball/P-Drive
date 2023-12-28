/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   CreditCardQualify.cpp
 * Author: Caelan Kimball
 *
 * Created on October 23, 2019, 12:24 PM
 */

#include <cstdlib>
#include <iostream>

using namespace std;
void qualify();
void noQualify();
        

/*
 * 
 */
int main(int argc, char** argv) {
    //variable declaration
    double salary;
    int years;
    
    cout << "This program will determine if you qualify\n";
    cout << "for our credit card.\n";
    cout << "What is your annual salary? ";
    cin >> salary;
    cout << "How many years have you worked at your current job? ";
    cin >> years;
    if(salary >= 17000.0 && years >= 2){
        qualify();
    }
    else{
        noQualify();
    }
    return 0;
}
void qualify(){
    cout << "Congratulations! You qualify for a credit card!";
    cout << "\nThe annual interest rate of the card is 12%";
}

void noQualify(){
    cout << "I'm sorry to inform you that you do not qualify for our credit card.\n";
    cout << "To qualify for the card you must \nearn at least $17,000 per year ";
    cout << "and you must have worked at your current job for at least two years.";
}

