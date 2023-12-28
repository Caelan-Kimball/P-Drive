/* 
 * File:   PaperBackWriter.cpp
 * Author: Caelan Kimball
 *
 * Created on October 2, 2019, 12:50 PM
 */

#include <cstdlib>
#include <fstream>
#include <iostream>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    
    //create and open file;
    ofstream outputFile;
    outputFile.open("demofile.txt");

    cout << "Now writing data to the file.\n";
    
    //Write four lines to the file
    outputFile << "Bach\n";
    outputFile << "Beethoven\n";
    outputFile << "Mozart\n";
    outputFile << "Schubert\n";

    //close the file
    outputFile.close();
    cout << "Done.\n";

    return 0;
}

