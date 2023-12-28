/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   RegPay.cpp
 * Author: Caelan Kimball
 *
 * Created on November 2, 2017, 10:56 AM
 */

#include <cstdlib>
#include <iostream>
#include <cmath>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    //declare variables
    double principle; //original principal
    double intRate; //interest rate such as 0.075
    double payPerYear; // number of payments per year
    double numYears; //number of years
    double payment; // the regular payment
    double numer; 
    double denom; //temp work variables
    double b; //base for pow call
    double e; //exponent for pow call
    double interest;
    double Annual;
    // Enter the variables
    cout << "Enter the principle amount: ";
    cin >> principle;
    
    cout << "Enter interest rate (i.e., 0.075): ";
    cin >> intRate;
    
    cout << "Enter number of payments made per year: ";
    cin >> payPerYear;
    
    cout << "Enter the length of time of the term in number of years: ";
    cin >> numYears;
    //Begin financial calculation
    numer = intRate * principle / payPerYear;
    e = -(payPerYear * numYears);
    b = (intRate / payPerYear) + 1;
    denom = 1 - pow(b, e);
    payment = numer / denom;
    interest = intRate * principle; 
    // Output Payment
    cout << "Payment is " << payment << "\n";
    cout << "Amount you payed in interest is " << abs(payment * e) - principle;

    return 0;
}

