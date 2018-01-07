// Write a c program to find the size of structure without using sizeof operator

// Exlpanation: http://www.cquestions.com/2011/07/write-c-program-to-find-size-of.html

#include<iostream>
#include<stdio.h>
using namespace std;

struct student{
   int roll;
   char name[100];
   float marks;
};

int main(){
 student *ptr = 0;
 ptr++;
 printf("Size of the structure student: %d", ptr);
 return 0;
}
