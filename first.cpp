 #include <iostream>
 using namespace std;

 int main(){

   int marks;

    cout<< "Enter your marks  "<< endl;
    cin>> marks;

    if (marks >90){
      cout << "you have achieved grade A "<< endl;
    }else if (marks >=80 && marks<=90){
      cout << "You have achieved grade B " << endl;
    }else {
      cout<< "You have achieved grade C "<< endl;
    }
    return 0;
 }
 


 