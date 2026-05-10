 #include <iostream>
 using namespace std;

 int main() {
  int n = 9; 
  bool isPrime = true;

  for (int i =2; i<n-1; i++ ){
   if (n % i == 0){
      isPrime = false;
      break;
   }
  }
  if (isPrime){
   cout<< "Prime number "<< endl;
  }else {
   cout << " Not a prime number "<< endl;
  }
  return 0;
  
 }