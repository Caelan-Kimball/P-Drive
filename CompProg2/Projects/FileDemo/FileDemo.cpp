/* 
 * File:   FileDemo.cpp
 * Author: Caelan Kimball
 *
 * Created on September 27, 2019, 1:07 PM
 */

#include <cstdlib>
#include <fstream>
#include <iostream>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    string superString;
    ifstream myFile;
    char fPath[]  = {"\\\\lvshares\\Document Sharing\\DataFiles\\uscpre.txt"};
    
    myFile.open(fPath);
    
    if(myFile)
    {
        
        while(!myFile.eof()){
            
            getline(myFile, superString);
            cout << superString << endl;
        }//end of while loop
        
        cout << "End of File";
        myFile.close();
    }//checks to make sure file opens
    else{
        cout << "Can't open file";
    }//end of else for if statement
    
    
    return 0;
}

