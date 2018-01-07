// Find the gcd of two numbers
#include<iostream>
using namespace std;

void getPrimeFactors(int num){

  int cnt=0,flag=1;
  int temp = num;
  for(int i=2;i<=temp/2;i++){

      cnt=0;
      flag=1;
      while(num%i==0){
        cnt++;
        flag=0;
        num = num/i;
      }
      if(flag==0)
        cout<<i<<"^"<<cnt<<" ";
  }

  //condition for prime numbers
  if(num!=1)
    cout<<temp<<"^1"<<endl;
}

int main()
{
  int num=11;
  getPrimeFactors(num);
}
