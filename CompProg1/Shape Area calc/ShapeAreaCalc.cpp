
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   ShapeAreaCalc.cpp
 * Author: Caelan Kimball
 *
 * Created on March 19, 2018, 11:24 AM
 */
#include "lvhs_cptitle.h"
#include <cstdlib>
#include <iostream>
#include <cmath>


using namespace std;
void showMenu();
void circleArea(double radius);
void squareArea(double height, double lenght);
void triangleArea(double base, double height);
void trapezoidArea(double base1, double base2, double height);
void parallelogramArea(double base, double height);
void hexagonArea(double side);
void processMenuChoice(int choice);
int getMenuChoice();

/*
 * 
 */
int main(int argc, char** argv) {
    // variable creation
    int x = 1;
    double radius;
    double width;
    double length;
    double base;//for trapezoid
    int areaChoice;
    //display title screen
    displayCPTitlePage();
    system("pause");
    
    do{
    showMenu();
    //Ask for what area they want to find
    areaChoice = getMenuChoice();
    if(areaChoice > 0)
    {
        processMenuChoice(areaChoice);
    }
    //Switch to use the correct function

    
    }while(areaChoice != 0);
    cout << "Thank you for using this program enjoy your day.\n";
    return 0;
}
int getMenuChoice()
{
    int choice;
    cout << "Please make a selection: ";
    cin >> choice;
    return choice;
}
void processMenuChoice(int choice)
{
        switch(choice)
    {
        double radius;
        double width;
        double length;
        double base;
        
        case 1:
            cout << "Enter the radius of your circle: ";
            cin >> radius;
            circleArea(radius);
            system("pause");
            break;
        case 2:
            cout << "Enter the length of your rectangle: ";
            cin >> length;
            cout << "Enter the width of your rectangle: ";
            cin >> width;
            squareArea(width, length);
            system("pause");
            break;
        case 3:
            cout << "Enter the height of your triangle: ";
            cin >> width;
            cout << "Enter the Base of your triangle: ";
            cin >> length;
            triangleArea(length, width);
            system("pause");
            break;
        case 4:
            cout << "Enter the first base: ";
            cin >> length;
            cout << "Enter the second base: ";
            cin >> base;
            cout << "Enter the height: ";
            cin >> width;
            trapezoidArea(length, base, width);
            system("pause");
            break;
        case 5:
            cout << "Enter the height of your parallelogram: ";
            cin >> width;
            cout << "Enter the Base of your parallelogram: ";
            cin >> length;
            parallelogramArea(length, width);
            system("pause");
            break;
        case 6:
            cout << "Enter the length of one side: ";
            cin >> length;
            hexagonArea(length);
            system("pause");
            break;
        default:
            cout << "This program cannot find the area of that shape please try another.\n";
            break;
        }
}
void showMenu()
{
    system("cls");
    cout << "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n"
            "*                                                           *\n" <<
            "*                 0. Exit                                   *\n" <<
            "*                 1. Area of a Circle                       *\n" <<
            "*                 2. Area of a Rectangle                    *\n" <<
            "*                 3. Area of a Triangle                     *\n" <<
            "*                 4. Area of a Trapezoid                    *\n" <<
            "*                 5. Area of a Parallelogram                *\n" <<
            "*                 6. Area of a Regular Hexagon              *\n" <<
            "*                                                           *\n" <<
            "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n";
}
void circleArea(double radius)
{
    double cArea;
    cArea = M_PI * (radius * radius);
    cout << "The area of your circle is " << cArea <<"." << endl;
}
void squareArea(double height, double length)
{
    double rectArea = height * length;
    cout << "The area of your rectangle is " << rectArea << "." << endl;
}
void triangleArea(double base, double height)
{
    double triArea = (base * height) / 2;
    cout << "The area of your triangle is " << triArea << "." << endl;
}
void trapezoidArea(double base1, double base2, double height)
{
    double trapArea = ((base1 + base2) / 2) * height;
    cout << "The area of your trapezoid is " << trapArea << "." << endl; 
}
void parallelogramArea(double base, double height)
{
    double paraArea = base * height;
    cout <<  "The area of the parallelogram is " << paraArea << "." << endl; 
}
void hexagonArea(double side)
{
    double hexArea = ((3 * sqrt(3)) / 2) * (side * side);
    cout << "The area of the regular hexagon is " << hexArea << "." << endl;
}