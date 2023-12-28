/* 
 * File:   TalkingToMars.cpp
 * Author: Caelan Kimball
 *
 * Created on October 19, 2017, 11:09 AM
 */

#include <cstdlib>
#include <iostream>
#include <cmath>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    //Declare Variables
    double distance;
    double lightspeed;
    double delay;
    double delay_in_min;
    distance = 34000000.0;
    lightspeed = 186000.0;
    delay = distance / lightspeed;
    delay_in_min = delay / 60.0;
    cout << "Time delay when talking to Mars: " << delay << " seconds. \n";
    cout << "This is " << delay_in_min << " minutes \n";
    
    cout << "Time delay for return message when talking to Mars: " << delay * 2 << " seconds. \n";
    cout << "This is " << delay_in_min * 2 << " minutes \n";
    

    return 0;
}

