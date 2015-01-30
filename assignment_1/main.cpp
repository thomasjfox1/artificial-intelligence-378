/* Better Exponent Function
Thomas J. Fox 2015 */

#include <iostream>
using namespace std;

double temp = 1;

// add something for 0^0 case
static double power(double x, int n){
  // cout<<"here\n";
  // cout<<"tempo = " << temp;
  return (n == 0) ? 1.0 : (n == 1) ? x : (n < 0) ? power(1.0/x, -n) : (n % 2 == 1) ? x * power(x, n-1) : temp *= power(x, n/2);
}

int main() {

  double x;
  int n;

  cout << "Please enter an a base: ";
  cin >> x;
  cout << "\nPlease enter an exponent: ";
  cin >> n;

  double test = power(x, n);
  cout << test << "\n";

  return 0;
}
