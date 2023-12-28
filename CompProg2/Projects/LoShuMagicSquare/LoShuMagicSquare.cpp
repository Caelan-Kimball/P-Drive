/* 
 * File:   LoShuMagicSquare.cpp
 * Author: Caelan Kimball
 *
 * Created on January 21, 2020, 1:01 PM
 */

#include <cstdlib>
#include <iostream>
#include <vector>

using namespace std;
const int ROWS = 3;
const int COLS = 3;
bool isAMagicSquare(int square[ROWS][COLS]);

/*
 * 
 */
int main(int argc, char** argv) {
    bool answer = true;
    vector<int> bruh;
    int num;
    num = bruh.size();
    cout << num;

    int squareArray [ROWS][COLS] = {
        {4, 9, 2},
        {3, 5, 7},
        {8, 1, 6}
    };
    answer = isAMagicSquare(squareArray);
    if(answer == true){
        cout << "The 2-D array is a Lo-Shu Magic Square.";
    }else{
        cout << "The 2-D array is not a Lo-Shu Magic Square.";
    }
    
    return 0;
}

bool isAMagicSquare(int square[ROWS][COLS]) {
    bool toBeOrNotToBe = false;
    int r1, r2, r3;
    int c1, c2, c3;
    int diag;

    //acquire the total for each row
    r1 = square[0][0] + square[0][1] + square[0][2];
    r2 = square[1][0] + square[1][1] + square[1][2];
    r3 = square[2][0] + square[2][1] + square[2][2];
    //acquire the total for each column
    c1 = square[0][0] + square[1][0] + square[2][0];
    c2 = square[0][1] + square[1][1] + square[2][1];
    c3 = square[0][2] + square[1][2] + square[2][2];
    //acquire the total of the diagonal
    diag = square[0][0] + square[1][1] + square[2][2];

    //compare results of the square;
    if (r1 == r2 && r1 == r3 && r1 == c1 && r1 == c2
            && r1 == c3 && r1 == diag && r2 == r3 &&
            r2 == c1 && r2 == c2 && r2 == c3 && r2 == diag
            && r3 == c1 && r3 == c2 && r3 == c3 && r3 == diag
            && c1 == diag && c1 == c2 && c1 == c3 && c2 == diag
            && c2 == c3 && c3 == diag) {
        toBeOrNotToBe = true;
    }

    return toBeOrNotToBe;
}

