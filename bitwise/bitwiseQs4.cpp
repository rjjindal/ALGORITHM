/* Detect if two integers have opposite signs */
#include<iostream>
#include<stdio.h>

using namespace std;

bool checkOppositeSign(int a, int b){
  return ( (a^b) < 0);
}

int main()
{
  cout<<checkOppositeSign(3,-4)<<endl;
  return(0);
}
