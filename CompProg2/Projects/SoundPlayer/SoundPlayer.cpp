/* 
 * File:   SoundPlayer.cpp
 * Author: Caelan Kimball
 *
 * Created on December 2, 2019, 12:57 PM
 */

#include <cstdlib>
#include <iostream>
#include <windows.h>
#include <mmsystem.h>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {

    for (int t = 0; t < 500; t++) {
        cout << "Yes Time!!!   ";
        
    }
    PlaySound(TEXT("\\\\lvshares\\Document Sharing\\DataFiles\\"
                "you-are-acting-so-weird.wav"), NULL, SND_FILENAME);


    return 0;
}

