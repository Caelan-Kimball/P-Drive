/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   ReturningAPointer.cpp
 * Author: Caelan Kimball
 *
 * Created on March 28, 2018, 11:03 AM
 */

#include <cstdlib>
#include <iostream>

using namespace std;
char *find_substring(char *sub, char *str);

int main(int argc, char** argv) {
    char *substr;
    char text[] = "one, two, buckle my shoe, three, four, shut the door.";
    
    substr = find_substring("three", text);
    
    cout << "Substring Found: " << substr << endl;
    cout << "Substring Found: " << find_substring("ten", text) << endl;

    return 0;
}
char *find_substring(char *sub, char *str)
{
    int t;
    char *p, *p2, *start;
    
    for(t = 0; str[t]; t++)
    {
        p = &str[t];
        start = p;
        p2 = sub;
        while(*p2 && *p2 == *p)
        {
            p++;
            p2++;
        }//end of while
        //if reach the end then a match has been found
        if(!*p2)
        {
            return start;
        }//end of if
        
    }//end of for
    return 0;//no match was found
}//end of substring prototype


