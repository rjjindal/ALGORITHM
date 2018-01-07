// Find The missing Number
// 1) XOR all the array elements, let the result of XOR be X1.
// 2) XOR all numbers from 1 to n, let XOR be X2.
// 3) XOR of X1 and X2 gives the missing number.

#include<iostream>
#include<stdio.h>

using namespace std;

int getMissingNo(int a[], int n){
  int X1=0,X2=0;
  for(int i=0;i<n;i++){
    X1 ^= a[i];
  }
  for(int j=1;j<=(n+1);j++){
    X2 ^=j;
  }
  return(X1^X2);
}

int main()
{
  int a[] = {1, 2, 4, 5, 6};
   int miss = getMissingNo(a, 5);
   cout<<miss;
}
