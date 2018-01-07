// Verify whether a number is prime or not
#include<iostream>
using namespace std;

int isPrime(int a){
  for(int i=2;i*i<=a; i++){
      if(a%i==0)
        return(-1);
  }
  return(1);
}

int main()
{
  int num = 11;
  cout<<isPrime(num)<<endl;
}
