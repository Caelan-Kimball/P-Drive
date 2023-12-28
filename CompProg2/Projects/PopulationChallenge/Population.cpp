/* 
 * File:   Population.cpp
 * Author: Caelan Kimball
 *
 * Created on November 20, 2019, 12:28 PM
 */

#include <cstdlib>
#include <iostream>


using namespace std;

double populationCalculator(double pop, double bR, double dR, double popIn, double popOut);
double precentageConverter(double decimal);

/*
 * 
 */
int main(int argc, char** argv) {
    double startPopSize, years, newPopSize;
    double birthRate, deathRate;
    double popIn, popOut;
    //Introduction to the program
    cout << "This program will calculate the population based on \n birth rates, death rates, "
            "and starting population size and display it by year" << endl;
    //Acquire data from the user
    cout << "What is the starting population? ";
    cin >> startPopSize;
    while (startPopSize < 2) {
        cout << "Please enter a number greater than 2 for the starting population: ";
        cin >> startPopSize;
    }
    cout << "\nWhat is the annual birth rate as a decimal? ";
    cin >> birthRate;
    while (birthRate < 0) {
        cout << "Enter a positive birth rate: ";
        cin >> birthRate;
    }
    birthRate = precentageConverter(birthRate);
    cout << "\nWhat is the annual death rate as a decimal? ";
    cin >> deathRate;
    while (deathRate < 0) {
        cout << "Enter a positive death rate: ";
        cin >> deathRate;
    }
    deathRate = precentageConverter(deathRate);
    cout << "\nWhat is the average number of people that enter the region? ";
    cin >> popIn;
    while (popIn < 0) {
        cout << "Enter a positive population in value: ";
        cin >> popIn;
    }
    cout << "\nWhat is the average number of people that leave the region? ";
    cin >> popOut;
    while (popOut < 0) {
        cout << "Enter a positive population out value: ";
        cin >> popOut;
    }
    cout << "\nHow many years would you like to have displayed? ";
    cin >> years;
    while (years < 0) {
        cout << "Enter a positive number of years: ";
        cin >> years;
    }

    newPopSize = startPopSize;
    for (int x = 1; x <= years; x++) {
        newPopSize = populationCalculator(newPopSize, birthRate, deathRate, popIn, popOut);
        cout << "Year " << x << " population: " << newPopSize << endl;
    }


    return 0;
}

double populationCalculator(double pop, double bR, double dR, double popIn, double popOut) {
    double newPopsize;
    newPopsize = pop + (popIn - popOut) + (bR * pop) - (dR * pop);
    return newPopsize;
}

double precentageConverter(double decimal) {
    double percentage;
    if (decimal > 1) {
        percentage = decimal / 100;
        return percentage;
    }
    return decimal;
}

