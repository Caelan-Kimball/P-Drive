/* 
 * File:   madLib.cpp
 * Author: Caelan Kimball
 *
 * Created on October 25, 2017, 11:25 AM
 */

#include <cstdlib>
#include <iostream>
#include <string>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    string firstName;
    string noun1;
    string malePersonInRoom;
    string adj1;
    string noun2;
    string noun3;
    string personInRoom2;
    string adj2;
    string adverb;
    string adj3;
    string celebrityMale;
    string adj4;
    string adj5;
    string celebrityFemale;
    string noun4;
    cout << "Enter a first name. ";
    cin >> firstName;
    cout << "Enter a noun. ";
    cin >> noun1;
    cout << "Enter the name of a male someone in the room. ";
    cin >> malePersonInRoom;
    cout << "Enter an adjective. ";
    cin >> adj1;
    cout << "Enter a noun. ";
    cin >> noun2;
    cout << "Enter a noun. ";
    cin >> noun3;
    cout << "Enter the name of someone in the room. ";
    cin >> personInRoom2;
    cout << "Enter an adjective. ";
    cin >> adj2;
    cout << "Enter an Adverb. ";
    cin >> adverb;
    cout << "Enter an adjective. ";
    cin >> adj3;
    cout << "Enter the name of a male celebrity. ";
    cin >> celebrityMale;
    cout << "Enter an adjective. ";
    cin >> adj4;
    cout << "Enter an adjective. ";
    cin >> adj5;
    cout << "Enter the name of a female celebrity. ";
    cin >> celebrityFemale;
    cout << "Enter a noun. ";
    cin >> noun4;
    cout << "Recently I," << firstName << " Walters, sat down with " << noun1 << endl;
    cout << "famous actor and vampire " << malePersonInRoom <<", to discuss his" << endl;
    cout << "most recent work, his run-in with the law, and how he met his" << endl;
    cout << adj1 << " fiancee" << endl;
    cout << "Q: How does it feel to have recently won the Motion Picture" << endl;
    cout << "Academy " << noun2 << " for your performance in the coming-" << endl;
    cout << "of-" << noun3 << " movie, \"The " << personInRoom2 << " story\"?" << endl;
    cout << "A: It was a/an " << adj2 << " honor just to be nominated." << endl;
    cout << "Q: Last month you were " << adverb << " arrested by the" << endl;
    cout << "Hollywood police for allegedly trying to turn someone into a/an" << endl;
    cout << adj3 << " vampire. Can you comment on that?" << endl;
    cout << "A: My friend " << celebrityMale << " wanted to become a vampire. It was" << endl;
    cout << "all a/an " << adj4 << " misunderstanding." << endl;
    cout << "Q: Tell us about your romance with the " << adj5 << " actress," << endl;
    cout << celebrityFemale << "." << endl;
    cout << "A: Let's just say I like to keep my private " << noun4 << " private." << endl;
    

    return 0;
}

