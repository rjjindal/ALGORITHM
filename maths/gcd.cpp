// Find the gcd of two numbers
#include<iostream>
using namespace std;

int gcd(int a, int b){
  if(b==0)
    return(a);
  else
    return(b, a%b);
}

int main()
{

  cout<<gcd(291,42)<<endl;
}
