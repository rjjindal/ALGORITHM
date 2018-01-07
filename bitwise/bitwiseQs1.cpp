/* C Program to demonstrate use of bitwise operators */
#include<iostream>
#include<stdio.h>

using namespace std;


int findOdd(int arr[], int n){

  int res=0;
  for(int i=0;i<n;i++){
    res ^= arr[i];
  }
  return res;
}

int main()
{
   int arr[] = {12, 12, 14, 12, 14, 14, 14};
   int n = sizeof(arr)/sizeof(arr[0]);
   printf ("The odd occurring element is %d ", findOdd(arr, n));
   return 0;
}
