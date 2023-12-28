#include <iostream>
#include <iomanip>
using namespace std;
// Write your function prototype here.
void convert(double *num);

int main() {
//    double measurement;
//    cout << "Enter a length in inches, and I will convert\n";
//    cout << "it to centimeters: ";
//    cin >> measurement;
//    convert(&measurement);
//    cout << fixed << setprecision(4);
//    cout << "Value in centimeters: " << measurement << endl;
//    return 0;
    {
    if (__cplusplus == 201703L) std::cout << "C++17\n";
    else if (__cplusplus == 201402L) std::cout << "C++14\n";
    else if (__cplusplus == 201103L) std::cout << "C++11\n";
    else if (__cplusplus == 199711L) std::cout << "C++98\n";
    else std::cout << "pre-standard C++\n";
}
}
//
// Write the function convert here.
//

void convert(double *num) {
    *num *= 2.54;
}


