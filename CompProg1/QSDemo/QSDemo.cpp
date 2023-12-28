/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   QSDemo.cpp
 * Author: Caelan Kimball
 *
 * Created on March 1, 2018, 11:00 AM
 */

#include <cstdlib>
#include <iostream>
#include <cstring>
#include <cstdio>


using namespace std;

void quicksort(char *items, int len);

void qs(char *items, int left, int right);

/*
 * 
 */
int main(int argc, char** argv) {
    
    char str[80];
    
    cout << "Please enter a string: ";
    
    gets(str);
    
    cout << "Original order: " << str << '\n';
    
    quicksort(str, strlen(str));
    
    cout << "Sorted order: " << str << '\n';

    return 0;
}

void qs(char *items, int left, int right) 
{
    int i, j;
    char x, y;
    i = left;
    j = right;
    x = items[( left + right) /2];
    
    do
    {
        while((items[i] < x) && (i < right)) i++;
        while((x < items[j]) && (j > left)) j--;
        
        if(i <= j)
        {
            y = items[i];
            items[i] = items[j];
            items[j] = y;
            i++;
            j--;
        }
    } while(i <= j);
    
    if(left < j)
        qs(items, left, j);
    if(i < right)
        qs(items, i, right);
}

void quicksort(char *items, int len) 
{
    qs(items, 0, len - 1);
}

