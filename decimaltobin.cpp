#include<iostream>

using namespace std;

int main(){

  int var,i=15;
  int binNum[16]={0};
  cin>>var;

  while(var>0 && i>0){
    binNum[i] = var%2;
    var = var/2;
    i--;
  }
  for(int j=0;j<16;j++){
    cout<<binNum[j]<<endl;
  }
  return 0;
}
