#include <stdlib.h>
#include <iostream>
#include <string>
#include <stdio.h>

using std::cout;
using std::cin;
using std::string;
using std::endl;

double suma(double a, double b) {
    return a + b;
}

double resta(double a, double b) {
    return a - b;
}

double multiplica(double a, double b) {
    return a * b;
}

double divide(double a, double b) {
    return a / b;
}

double (*selecciona(string op))(double,double)  {

  if (op == "-") {
    return resta;
  }

  if (op == "/") {
    return divide;
  }

  if (op == "*") {
    return multiplica;
  }

  return suma;
}

int main() {
  cout << "Inserta el valor de a:" << endl;
  double a;
  cin >> a;

  cout << "Inserta el valor de b:" << endl;
  double b;
  cin >> b;

  cout << "Inserta la función (+ - * /):" << endl;
  string op;
  cin.ignore();//para evitar el "\n"
  std::getline (cin, op);

  double(*fun)(double, double) = selecciona(op);
  cout << "El resultado es: " << fun(a,b) << endl;

}
