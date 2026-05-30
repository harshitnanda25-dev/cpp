#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main() {
    // code here
    // power of two //
  int n ;
  cout << "enter the number ";
  cin>>n;
  int ans = 0;
  if (n == 1){
    cout << " true ";
    
  }
  for (int i =1; i<=30; i++){
    ans = pow(2,i);
    if (ans == n){
        cout << " true " << endl;
    }
    else {
        cout << "false ";
        break;
    }
  }

    return 0;
}