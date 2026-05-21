#include <iostream>
using namespace std;
  

  void primenum(int n){

   for (int num = 2; num <=n; num ++){

       bool isPrime = true; 

      // inner loop check prime number // 
      for (int i = 2; i<num; i++){
         if (num % i ==0){
            isPrime = false ; 
            break;
         }
      }
      if (isPrime){
          cout << num << " ";
      }
   }
}

int main(){
  
    primenum(20);
   
    
   return 0;
}

 
  