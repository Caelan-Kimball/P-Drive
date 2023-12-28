/* 
 * File:   FahrenhietToCelsius.cpp
 * Author: Caelan Kimball
 *
 * Created on November 8, 2019, 12:56 PM
 */

#include <cstdlib>
#include <iostream>
#include <iomanip>

using namespace std;
double celciusConverter(double);

/*
 * 
 */
int main(int argc, char** argv) {
    cout << fixed << showpoint << setprecision(3);
    
    int fahrenhite;
    double celcius;
    //cout << fahrenhite << "°F is " << celciusConverter(20) << "°C\n";
    for(fahrenhite = 0; fahrenhite <= 20; fahrenhite++){
        celcius = celciusConverter(fahrenhite);
        cout << fahrenhite << "°F is " << celcius << "°C\n";
    }
    return 0;
}

double celciusConverter(double fahren){
    double celcius;
    celcius = (double)(5.0/9.0) * (fahren - 32);
    return celcius;
}

