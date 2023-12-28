/* 
 * File:   ArrayReaderandWriter.cpp
 * Author: Caelan Kimball
 *
 * Created on January 8, 2020, 12:32 PM
 */

#include <cstdlib>
#include <iostream>
#include <fstream>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    const int ARRAY_SIZE = 10;
    int numbers[ARRAY_SIZE];
    int count = 0;
    
    ifstream inputFile; 
    ofstream outputFile;
    inputFile.open("\\\\lvshares\\Document Sharing\\DataFiles\\numbers.txt");
    outputFile.open("Results.txt");
    
    if(!inputFile){
        cout << "Input File Error\n";
    }
    else{
        //read the numbers from the file into the array
        while(count < ARRAY_SIZE && inputFile >> numbers[count]){
            count++;
        }
        inputFile.close();
        
        cout << "The numbers are: ";
        for(count = 0; count < ARRAY_SIZE; count++){
            cout << numbers[count] << " ";
        }
        cout << endl;
        
        //process and output
        cout << "These numbers have been saved to the file" << endl;
        for(count = 0; count < ARRAY_SIZE; count++){
            if(numbers[count] % 2){
                outputFile << numbers[count] << endl;
                cout << numbers[count] << endl;
            }
        }
        outputFile.close();
    }
    return 0;
}

