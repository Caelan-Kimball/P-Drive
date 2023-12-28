/* 
 * File:   SavingsAccountBalance.cpp
 * Author: Caelan Kimball
 *
 * Created on October 3, 2019, 12:49 PM
 */

#include <cstdlib>
#include <iostream>
#include <iomanip>
#include <fstream>
using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    //creation of variables
    ofstream outputFile;
    outputFile.open("FinalReport.txt");
    double annualInterestRate, startingBalance, 
            amountDeposited, depositTotal, amountWithdrawn, 
            withdrawnTotal, monthlyInterestRate, 
            interestAmount,interestTotal;
    int months;


    cout << fixed << showpoint << setprecision(2);

    cout << "Enter the annual interest rate on your account: ";
    cin >> annualInterestRate;
    cout << "What was the starting balance on the account? ";
    cin >> startingBalance;
    cout << "How long has the account been open(in months)? ";
    cin >> months;
    //convert percent to decimal if percent is entered
    if (annualInterestRate > 1) {
        annualInterestRate /= 100;
    }
    monthlyInterestRate = annualInterestRate / 12;

    for (int x = 1; x <= months; x++) {
        cout << "month " << x << endl;
        cout << "How much money was deposited? ";
        cin >> amountDeposited;
        if (amountDeposited < 0) {
            cout << "Please enter a positive value: ";
            cin >> amountDeposited;
        }
        startingBalance += amountDeposited;
        depositTotal += amountDeposited;
        
        cout << "How much money was withdrawn? ";
        cin >> amountWithdrawn;
        if (amountDeposited < 0) {
            cout << "Please enter a positive value ";
            cin >> amountWithdrawn;
        }
        startingBalance -= amountWithdrawn;
        withdrawnTotal += amountWithdrawn;
        
        interestAmount = startingBalance * monthlyInterestRate;
        interestTotal += interestAmount;
        
        startingBalance += interestAmount;


    }
    outputFile << "The final amount in the account is $" <<startingBalance << endl;
    outputFile << "The total deposited into the account was $" << depositTotal << endl;
    outputFile << "The total withdrawn from the account was $" << withdrawnTotal << endl;
    outputFile << "The total interest earned on the account was $" << interestTotal << endl;
    cout << "The final amount in the account is $" <<startingBalance << endl;
    cout << "The total deposited into the account was $" << depositTotal << endl;
    cout << "The total withdrawn from the account was $" << withdrawnTotal << endl;
    cout << "The total interest earned on the account was $" << interestTotal << endl;



    return 0;
}

