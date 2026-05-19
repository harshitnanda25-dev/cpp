#include <iostream>
using namespace std;

int main(){
    int n = 4; 
     
    // outer loop 
    for (int i=0; i<n; i++){

        //inner loop
        // print spaces 
        for (int j=0 ; j<n-i-1; j++){
             cout << " ";

        }

        // second inner loop
        // increasing  numbers
        for (int j=1; j<=i+1; j++ ){
            cout << j;
        }

        // Third loop
        // it is a backword loop

        
        for (int j=i; j>0; j--){
        cout << j;
        }
        cout << endl;
    } 
    return 0;
}