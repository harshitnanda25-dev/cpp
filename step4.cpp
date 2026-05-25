#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main() {
    // code here
   int arr[]= {12,35,1,10,34};
   int n = 5; 
   int largest = INT_MIN;
   int index = 0;
   int secindex = 0;

   for (int i =0; i<n ; i++){
     if (arr[i] > largest){
        largest = arr[i];
         index++;
          
        
         
     }
    arr[index]= 0;

    
      
   }
   cout << largest <<  endl;
     
    return 0;
}