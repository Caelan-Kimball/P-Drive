/* 
 * File:   puppies.cpp
 * Author: Caelan Kimball
 *
 * Created on September 27, 2017, 11:22 AM
 * Demonstrate relation operators using puppy comparison
 */

#include <cstdlib>
#include <iostream>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    // declare a variable
    int puppies = 0;
    cout << "How many doges do you pets? ";
    cin >> puppies;
    if(puppies <= 0){
        cout << "you are sad here is picture of doge" << endl;
        cout << "                       ▄                        ▄" << endl;
                cout << "                     ▌▒█                  ▄▀▒▌" << endl;
                cout << "                     ▌▒▒█              ▄▀▒▒▒▐" << endl;
                cout << "               ▄▄▀▒░▒▒▒▒▒▒▒▒▒█▒▒▄█▒▐" << endl;
                cout << "             ▄▀▒▒▒░░░▒▒▒░░░▒▒▒▀██▀▒▌" << endl;
                cout << "            ▐▒▒▒▄▄▒▒▒▒░░░▒▒▒▒▒▒▒▀▄▒▒▌" << endl;
                cout << "            ▌░░▌█▀▒▒▒▒▒▄▀█▄▒▒▒▒▒▒▒█▒▐" << endl;
                cout << "           ▐░░░▒▒▒▒▒▒▒▒▌██▀▒▒░░░▒▒▒▀▄▌" << endl;
                cout << "           ▌░▒▄██▄▒▒▒▒▒▒▒▒▒░░░░░░▒▒▒▒▌" << endl;
                cout << "          ▌▒▀▐▄█▄█▌▄░▀▒▒░░░░░░░░░░▒▒▒▐" << endl;
                cout << "          ▐▒▒▐▀▐▀▒░▄▄▒▄▒▒▒▒▒▒░▒░▒░▒▒▒▒▌" << endl;
                cout << "          ▐▒▒▒▀▀▄▄▒▒▒▄▒▒▒▒▒▒▒▒░▒░▒░▒▒▐" << endl;
                cout << "           ▌▒▒▒▒▒▒▀▀▀▒▒▒▒▒▒░▒░▒░▒░▒▒▒▌" << endl;
                cout << "           ▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▒▒▄▒▒▐" << endl;
                cout << "            ▀▄▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▒▄▒▒▒▒▌" << endl;
                cout << "              ▀▄▒▒▒▒▒▒▒▒▒▒▄▄▄▀▒▒▒▒▄▀" << endl;
                cout << "                ▀▄▄▄▄▄▄▀▀▀▒▒▒▒▒▄▄▀" << endl;
                cout << "                   ▒▒▒▒▒▒▒▒▒▒▀▀" << endl;           
    }
    if(puppies == 1){
        cout << "you have " << puppies << " doge?" << endl;
        cout << "Give it plenty of pets\n";
    }
if (puppies > 1 && puppies < 75){
    cout << puppies << " That's a lot of doges to give pets" <<endl;
}
if (puppies > 75){
    cout << "that is far too many doges to pet." << endl;
}    

    return 0;
}

