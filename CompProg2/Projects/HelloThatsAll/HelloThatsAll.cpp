/* 
 * File:   HelloThatsAll.cpp
 * Author: Caelan Kimball
 *
 * Created on September 18, 2019, 12:24 PM
 */

#include <cstdlib>
#include <iostream>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    int count = 0;//loop control value
    while(count <= 4){
        cout << "Hello" ;//<< count << "\n";//output hello
        count++;//increment count variable
    }//end of while loop
    cout << "That's all" << endl;//output final line clear line
    

    return 0;
}

