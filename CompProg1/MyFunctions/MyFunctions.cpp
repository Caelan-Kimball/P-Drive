

/* 
 * File:   MyFunctions.cpp
 * Author: Caelan Kimball
 *
 * Created on February 21, 2018, 11:14 AM
 */

#include <cstdlib>
#include <iostream>
#include <windows.h>
//#include <>

using namespace std;
//function declarations/ function prototypes below
void function1();
void function2();

int main(int argc, char** argv) 

{
    cout << "Our program begins in the main function.\n";
    
    cout << "we call function 1.\n";
    function1();
    cout << "We are now back in main\n";
    
    
    cout << "We call function 2\n";
    function2();
    cout << "\n We are back in main once again\n";
    cout << "We can now call the functions as many times as we like.\n";
    function1();
    function1();
    function2();
    
    cout << "This is the the end of the main function.\n";
    return 0;
}//end of main
//function  definitions
void function1()
{
    cout << "function 1 is running... please wait\n";
    //pause for two seconds
    Sleep(2000); //defined in windows.h header file
    cout << "function 1 is ending\n";
}//end of function 1 definition
void function2()
{
    cout << "function two is running... please wait\n";
    int wait = 4;
    for(int x = 0; x < wait; x++)
    {
        cout << " . ";
        Sleep(1000);
    }
    cout << "function two is ending\n";
}// end of function 2 definition

