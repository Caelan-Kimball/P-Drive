/* 
 * File:   StringReverse.cpp
 * Author: Caelan Kimball
 *
 * Created on February 2, 2018, 11:16 AM
 */

#include <cstdlib>
#include <iostream>
#include <cstring>
#include <cstdio>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    char str[80];//"this a test";
    char *start, *end;
    int len;
    char t;
    cout << "Enter a sentence: ";
    gets(str);
    
    cout << "Before: " << str << "\n";
    len = strlen(str);
    start = str;
    end = &str[len-1];
    while (start < end)
    {
        //swap chars
        t = *start;
        *start = *end;
        *end = t;
        //advance pointers
        start++;
        end--;
    }
    cout << "After: " << str << "\n";
    

    return 0;
}

