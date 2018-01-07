// Find the gcd of two numbers
#include<iostream>
using namespace std;

int gcd(int a, int b){
  if(b==0)
    return(a);
  else
    return(gcd(b, a%b));
}

int ngcd(int arr[], int n){

  int result = arr[0];
  for(int i=1;i<n;i++){
    result = gcd(arr[i], result);
  }
  return(result);
}

int main()
{
  int arr[] = {30,12,24};

  cout<<ngcd(arr,3)<<endl;
}
