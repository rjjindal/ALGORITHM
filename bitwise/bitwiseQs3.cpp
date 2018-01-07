// Count number of bits to be flipped to convert A to B\
// Input : a = 10, b = 20
// Output : 4
// Binary representation of a is 00001010
// Binary representation of b is 00010100
// We need to flip highlighted four bits in a
// to make it b.

/* C Program to demonstrate use of bitwise operators */
#include<iostream>
#include<stdio.h>

using namespace std;

int getCount(int Xnum){

  int count=0;
  while(Xnum!=0){
    count += Xnum & 1;
    Xnum >>= 1;
  }
  return(count);
}

int flippedNum(int a,int b){
  return(getCount(a^b));
}

int main()
{
  cout<<flippedNum(10, 20)<<endl;
  return(0);
}
