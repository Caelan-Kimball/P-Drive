/* 
 * File:   functionOverloads.cpp
 * Author: Caelan Kimball
 *
 * Created on December 3, 2019, 12:50 PM
 */

#include <cstdlib>
#include <iostream>
#include <iomanip>
#include <ios>
#include <valarray>

using namespace std;
void getChoice(char &);
double calcWeeklyPay(int, double);
double calcWeeklyPay(double);


/*
 * 
 */
int main(int argc, char** argv) {
    
    char selection; //Menu Selection
    int worked; //Hours worked
    double rate, yearly; //Hourly pay rate and Yearly salary
    
    //set numeric formatting
    cout << fixed << showpoint << setprecision(2);
    
    //display the menu and get a selection
    cout << "Do you want to calculate the weekly pay of \n";
    cout << "(H) an hourly paid employee, or \n";
    cout << "(S) a salaried employee?\n";
    getChoice(selection);
    
    
    //Process the menu selection.
    switch(selection){
        //Hourly paid employee
        case 'H':
        case 'h': 
            cout << "How many hours were worked? ";
            cin >> worked;
            cout << "What is the hourly pay rate? ";
            cin >> rate;
            cout << "The gross weekly pay is $";
            cout << calcWeeklyPay(worked, rate) << endl;
            break;
        case 'S':
        case 's':
            cout << "What is the annual salary? ";
            cin >> yearly;
            cout << "The gross weekly pay is $";
            cout << calcWeeklyPay(yearly);
            break;
        default:
            cout << "Invalid character entered!! \n Please re-run the program and enter a valid character";
            break;
        
    }//end of switch
    return 0;
}

//Function definitions
void getChoice(char &letter){
    //Get the users selection
    cout << "Enter your choice (H or S): ";
    cin >> letter;
    
    //Validate the selection.
    while(letter != 'H' && letter != 'h' && 
            letter != 'S' && letter != 's')
    {
        cout << "Please enter H or S: ";
        cin >> letter;
    }
}//end of getChoice definition

double calcWeeklyPay(int hours, double payRate){
    return hours * payRate;
}

double calcWeeklyPay(double annSalary){
    return annSalary / 52;
}

