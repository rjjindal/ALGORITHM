// Find all the factors of the numbers
#include<iostream>
#include<algorithm>
using namespace std;

int getLength(int a[]){
  int i;
  for(i=0;a[i]!=0;i++);
  return(i);
}

void getFactor(int a){

  int k=0,fac[100];
  for(int i=2;i*i<=a;i++){
    if(a%i==0){
      fac[k] = i;
      if(i!=a/i){         // added to remove duplicate numbers
        fac[k+1] = a/i;
        k+=2;
      }else{
        k++;
      }
    }
  }

  sort(fac,fac+getLength(fac));

  for(int i=0;i<getLength(fac);i++)
    cout<<fac[i]<<" ";
}

int main()
{

  int num=100;
  getFactor(num);
}
