#include <iostream>
using namespace std;

int main(){

     int n = 123; 

     int digit = 0;
     int sum = 1;

     while (n>0){
        digit = n % 10; 

        sum = sum * digit ;

        n = n / 10;
     }
     cout << sum ;
     return 0;
 

  // count of numbers 
    //    int n = 4244; 
    //    int digit = 0;

    //    int count = 0; 

    //    while(n>0){
    //     digit = n % 10; 

    //     count++; 

    //     n = n / 10;

    //    }
    //    cout<<  count ;
    //    return 0;

}