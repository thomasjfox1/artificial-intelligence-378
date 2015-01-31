/* Better Exponent Function
Thomas J. Fox 2015 */

#include <iostream>
using namespace std;

static double power(double x, int n){
  return (n == 0) ? 1.0 : (n == 1) ? x : (n < 0) ? power(1.0/x, -n) : (n % 2 == 1) ? x * power(x, n-1) : power(x, n/2) * power(x, n/2);
}

int main() {

  double x;
  int n;

  cout << "Please enter an a base: ";
  cin >> x;
  cout << "Please enter an exponent: ";
  cin >> n;

  double answer = power(x, n);
  cout << "The number " << x << " raised to the " << n << " power is: " << answer << "\n";


  return 0;
}
