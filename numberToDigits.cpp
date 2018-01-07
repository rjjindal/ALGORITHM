#include<iostream>

using namespace std;

int main(){

  int var;
  cin>>var;
  while(var>0){
    cout<< var%10;
    var = var/10;
  }
  cout<<"\n";
  return 0;
}
