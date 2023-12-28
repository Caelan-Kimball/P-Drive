/* 
 * File:   SafestDrivingArea.cpp
 * Author: Caelan Kimball
 *
 * Created on November 1, 2019, 12:51 PM
 */

#include <cstdlib>
#include <iostream>
#include <algorithm>

using namespace std;
int getNumAccidents(string name);
void findLowest(int, int, int, int, int);

/*
 * 
 */
int main(int argc, char** argv) {
    string regionName[] = {"North", "South", "West", "East", "Central"};
    int northTotal, centralTotal, southTotal,
            eastTotal, westTotal;
    northTotal = getNumAccidents(regionName[0]);
    southTotal = getNumAccidents(regionName[1]);
    westTotal = getNumAccidents(regionName[2]);
    eastTotal = getNumAccidents(regionName[3]);
    centralTotal = getNumAccidents(regionName[4]);
    findLowest(northTotal, southTotal, westTotal, eastTotal, centralTotal);

    return 0;
}

int getNumAccidents(string name) {
    string region = name;
    int numOfAccidents;
    cout << "Enter the number of accidents for the " << region << " region: ";
    cin >> numOfAccidents;
    while (numOfAccidents < 0) {
        cout << "Please a enter a positive number: ";
        cin >> numOfAccidents;
    }
    return numOfAccidents;
}

void findLowest(int region1, int region2, int region3, int region4, int region5) {
    int regionTotals[] = {region1, region2, region3, region4, region5};
    int length = 0;
    
    for (int num : regionTotals) {
        length++;
    }
    
    sort(regionTotals, regionTotals + length);
    
    if (region1 == regionTotals[0]) {
        cout << "The Northern region had the lowest number of accidents with " << regionTotals[0];
    } else if (region2 == regionTotals[0]) {
        cout << "The Southern region had the lowest number of accidents with " << regionTotals[0];
    } else if (region3 == regionTotals[0]) {
        cout << "The Western region had the lowest number of accidents with " << regionTotals[0];
    } else if (region4 == regionTotals[0]) {
        cout << "The Eastern region had the lowest number of accidents with " << regionTotals[0];
    } else if (region5 == regionTotals[0]) {
        cout << "The Central region had the lowest number of accidents with " << regionTotals[0];
    }


}
