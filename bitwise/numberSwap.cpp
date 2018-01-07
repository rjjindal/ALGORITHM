/* C Program to demonstrate use of bitwise operators */
#include<iostream>
#include<stdio.h>

using namespace std;

int main()
{
  int x=4, y= 15;

  cout<<"Before Swap X="<<x<<" Y="<<y<<endl;

  x=x^y;
  y=x^y;
  x=x^y;

  cout<<"After Swap X="<<x<<" Y="<<y<<endl;
  return 0;
}
