/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   OverloadingFunction.cpp
 * Author: 020022
 *
 * Created on April 19, 2018, 11:01 AM
 */

#include <cstdlib>
#include <iostream>


using namespace std;
int min(int dogfood, int catfood);
char min(char catfood, char dogfood);
int *min(int *dogfood, int *catfood);

/*
 * 
 */
int main(int argc, char** argv) {
    int j, k;
    j = 10;
    k = 256;
    cout << "min('$' , '@'): " << min('$' , '@') << endl;
    cout << "min(18 , 5): " << min(18 , 5) << endl;
    cout << "min(&j , &k): " << *min(&j , &k) << endl;
    return 0;
}

int min(int dogfood, int catfood) {
    if (catfood < dogfood) {
        return catfood;
    } else {
        return dogfood;
    }
}

char min(char catfood, char dogfood) {
    if (tolower(catfood) < tolower(dogfood)) {
        return catfood;
    } else {
        return dogfood;
    }
}

int *min(int *dogfood, int *catfood) {
    if (*catfood < *dogfood) {
        return catfood;
    } else {
        return dogfood;
    }
}
