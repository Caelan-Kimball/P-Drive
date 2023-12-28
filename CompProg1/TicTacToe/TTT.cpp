/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   TTT.cpp
 * Author: Caelan KImball
 *
 * April 26, 2000: Original version published program by Herbert Schildt
 * April 29, 2011: Modified and adapted by Mr.Kimball
 * May 2, 2011: Added 2 player and play again options
 * May 9, 2011: Version 2.0 redesigned to fix flaw in 2 player option,
 * 
 * May 4, 2015: Moved the program to NetBeans IDE
 * May 4, 2015: fixed problem with the tie game.
 * April 28, 2016: Bug found by James Thompson, class of '17, allowing entry of 1 4, and 2 4;
 * 
 * April 25, 2018: Fixed problem with scanf not working properly in the program when built with MinGW, use setvbuf(stdout, 0, _IONBF, 0);
 * May 2, 2018: Modified by Caelan Kimball removed extra exclamation mark after the O wins statement
 */

#include <cstdlib>
#include <cstdio>
using namespace std;
//Global variables
char matrix[3][3]; // tic tac toe matrix

//function prototypes
void init_matrix();
void display_matrix();
void get_player1_move();
void get_player2_move();
void get_computer_move();
char check();

/*
 * 
 */
int main(int argc, char** argv) {
    setvbuf(stdout, 0, _IONBF, 0);

    char done;
    char play = 'Y';
    do {
        int players;
        printf("This is the game of Tic-Tac-Toe.\n");
        printf("Please chose the number of players (1 or 2): ");
        scanf("%d", &players);
        if(players <= 1){
            printf("You will be playing against the computer.\n");
        }
        else{
            printf("You will provide your own opponent. X goes first. \n");
        }
        printf("To play, enter the row number and column number.\n");
        
        done = ' ';
        init_matrix();
        do {
            display_matrix();
            get_player1_move();
            done = check(); // see if there is a winner
            if (done != ' ') {
                break; // winner!
            }
            if (players > 1) {
                display_matrix();
                get_player2_move();
            }
            else{
                get_computer_move();
            }
            done = check();// see if winner
        }while(done == ' ');
        display_matrix();
        
        if(done == 'X'){
            printf("\nX's Won!\n");
        }
        else if (done == 'O'){
            printf("\nO's Won!\n");
        }
        else{
            printf("It's a draw - CAT\n");
        }
        
        printf("Would you like to play another game? (Y or N): ");
        scanf("%s", &play);



    } while (play != 'n' && play != 'N'); //end of while loop

    return 0;
}//end of main()
/* Initialize the matrix. */
void init_matrix(){
    for(int r = 0; r < 3; r++){
        for(int c = 0; c < 3; c++){
            matrix[r][c] = ' ';
        }
    }
}//end of init_matrix()
/* Get 1st player's Move*/
void get_player1_move(){
    int x, y;
    
    printf("Enter x, y coordinates for X's move: ");
    scanf("%d%*c%d", &x, &y);
    
    x--; y--;
    if(matrix[x][y] != ' '){
        printf("Invalid move, try again.\n");
        get_player1_move(); // recursion
    }
    else
        matrix[x][y] = 'X';
    
}// End of get_player1_move()

/* Get 2nd player's move. */
void get_player2_move(){
    int x, y;
    
    printf("Enter x, y coordinates for O's move: ");
    scanf("%d%*c%d", &x, &y);
    
    x--; y--;
    if(matrix[x][y] != ' '){
        printf("Invalid move, try again. \n");
        get_player2_move();
    }
    else
        matrix[x][y] = 'O';
}//end of get_player2_move() 
/* Get a move from the computer. */
void get_computer_move(){
    printf("The computer is thinking...\n");
    int r, c;
    for(r = 0; r < 3;r++){
        for(c = 0; c < 3; c++){
            if(matrix[r][c] == ' ') break; 
        }
        if(matrix[r][c] == ' ') break;
    }
    if(r*c < 9) {
        matrix[r][c] = 'O';
    }
}// end of get_computer_move()
void display_matrix(){
    printf("\n");
    for(int t = 0; t < 3; t++){
        printf(" %c | %c | %c" , matrix[t][0], matrix[t][1], matrix[t][2]);
        if(t != 2)
            printf("\n---|---|---\n");
    }
    printf("\n\n");
}//end of display_matrix()

/* See if there is a winner */
char check(){
    int r, c;
    
    for(r = 0; r < 3; r++) //check rows
        if(matrix[r][0] == matrix[r][1] && matrix[r][0] == matrix[r][2])
            return matrix[r][0];
    
    for(c = 0; c < 3; c++)//check columns
        if(matrix[0][c] == matrix[1][c] && matrix[0][c] == matrix[2][c])
            return matrix[0][c];
    
    /* TEST DIAGONALS */
    if(matrix[0][0] == matrix[1][1] && matrix[1][1] == matrix[2][2])
        return matrix[0][0];
    
    if(matrix[0][2] == matrix[1][1] && matrix [1][1] == matrix[2][0])
        return matrix[0][2];
    
    for(r = 0; r < 3; r++){
        for(c = 0; c < 3; c++){
            if(matrix[r][c] == ' ') break;
        }
        if(matrix[r][c] == ' ') break;
    }
    if(r*c == 9)
        return 'C'; //tie game 'C' for cat
    
    return ' ';
}//end of check

