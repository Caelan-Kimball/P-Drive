/* 
 * File:   UserChoice.cpp
 * Author: Caelan Kimball
 * Project: Take user data to determine health insurance cost
 * Created on September 9, 2019, 1:20 PM
 */

#include <cstdlib>
#include <iostream>
#include <iomanip>


using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {

    int choice; //To hold a menu choice
    int months; //To hold the number of months
    double charges; //To hold the monthly charges

    //constants for membership rates
    const double ADULT = 40.0,
            SENIOR = 30.0,
            CHILD = 20.0;

    //constants for membership rates
    const double ADULT_CHOICE = 1,
            CHILD_CHOICE = 2,
            SENIOR_CHOICE = 3,
            QUIT_CHOICE = 4;

    //Display the menu and get a choice.
    cout << "\t\tHealth Club Membership Menu\n\n"
            << "1. Standard Adult Membership\n"
            << "2. Child Membership\n"
            << "3. Senior Citizen Membership\n"
            << "4. Quit the Program\n\n"
            << "Enter your choice: ";
    cin >> choice;

    //Set the numeric output formatting.
    cout << fixed << showpoint << setprecision(2);

    //Respond to the user's menu selection.
    switch (choice) {
        case 1:
            cout << "For how many months? ";
            cin >> months;
            charges = months * ADULT;
            cout << "The total charges are $" << charges << endl;
            break;
        case 2:
            cout << "For how many months? ";
            cin >> months;
            charges = months * CHILD;
            cout << "The total charges are $" << charges << endl;
            break;
        case 3:
            cout << "For how many months? ";
            cin >> months;
            charges = months * SENIOR;
            cout << "The total charges are $" << charges << endl;
            break;
        case 4:
            break;
        default:
            cout << "The valid choices are 1 through 4. Run the\n"
                    << "program again and select one of those\n";

    }



    return 0;
}

