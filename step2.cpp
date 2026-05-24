#include <iostream>
using namespace std;

int  main(){

    int nums[] = {2,2,1};
    int size = 3;
    int single = 0;
    
    for (int i =0; i<size; i++){

    single = single ^ nums[i];
     
    }
    cout << single << endl;
   return 0;
}