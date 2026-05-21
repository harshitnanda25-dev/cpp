#include <iostream>
using namespace std;

int main(){

    int n = 152;
    int original,digit,sum=0;

    original=n;

    while(n>0){
        digit = n % 10;
        sum = sum + (digit * digit * digit);
        n = n/10;
    }
    if (sum == original){
        cout<< "armstrong number";

    }else {
        cout << " non armstrong number";
    }
    return 0;
}