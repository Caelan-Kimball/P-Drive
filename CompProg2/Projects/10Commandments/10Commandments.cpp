/* 
 * File:   10Commandments.cpp
 * Author: Caelan Kimball
 *
 * Created on September 6, 2019, 12:52 PM
 */

#include <cstdlib>
#include <iostream>
#include <string>
#include <array>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    //variables
    int commandNumber = 0;
    string yesOrNo = "YES";
    //string array for commandments
    string Commandments[10] = {"Thou shalt not use a computer to harm other people.",
        "Thou shalt not interfere with other people's computer work.",
        "Thou shalt not snoop around in other people's files.",
        "Thou shalt not use a computer to steal.",
        "Thou shalt not use a computer to bear false witness.",
        "Thou shalt not use or copy software for which you have not paid.",
        "Thou shalt not use other people's computer resources without authorization.",
        "Thou shalt not appropriate other people's intellectual output."
        , "Thou shalt think about the social consequences of the program you write."
        , "Thou shalt use a computer in ways that show consideration and respect."};
    cout << "Welcome To the database of Computer Ethics Commandments" << endl;
//for looping the switch case
    do {
        cout << "Enter the Commandment number: ";
        cin >> commandNumber;
        cout << endl;
        switch (commandNumber) {
            case 1:
                cout << Commandments[0] << endl;
                break;
            case 2:
                cout << Commandments[1] << endl;
                break;
            case 3:
                cout << Commandments[2] << endl;
                break;
            case 4:
                cout << Commandments[3] << endl;
                break;
            case 5:
                cout << Commandments[4] << endl;
                break;
            case 6:
                cout << Commandments[5] << endl;
                break;
            case 7:
                cout << Commandments[6] << endl;
                break;
            case 8:
                cout << Commandments[7] << endl;
                break;
            case 9:
                cout << Commandments[8] << endl;
                break;
            case 10:
                cout << Commandments[9] << endl;
                break;
            default:
                cout << "Commandment not found" << endl;
                break;
        }//end of switch case statement
        cout << "Would you like to hear another commandment?(Yes or No) ";
        cin >> yesOrNo;
        // yesOrNo.
    } while (yesOrNo == "Yes" || yesOrNo == "YES" || yesOrNo == "yes");//end of do-while

    return 0;
}

