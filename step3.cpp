#include <iostream>
using namespace std;

 void evenodd (int arr[], int size){
       int counteven = 0; 
       int countodd =0;

      for (int i = 0; i<size; i++){
          if (arr[i] % 2 == 0){
        counteven++;
          }
          else {
        countodd++;
    }
     
   }
    cout << " even = " << counteven << endl;
    cout << " odd = " << countodd ;
 }

int main() {
    // code here
   int arr[]= {1,2,3,4,5,6};
   int size = 6; 
    
    evenodd(arr,size);

    return 0;
}