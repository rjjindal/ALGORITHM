// calculate (a^b) mod m whne constraints are very big

#include<iostream>
using namespace std;

int main()
{
  int a=5,b=3, c=3;
  int result =1 ;
  for(int i=0;i<b; i++){
    result *= (a % c);
  }
  cout <<result %c;
  return(0);
}
