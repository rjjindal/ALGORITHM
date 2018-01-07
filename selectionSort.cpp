#include<iostream>
using namespace std;

int main(){

  int arr[20],size;

  cin>>size;

for(int i=0;i<size;i++){
  cout<<"a["<<i<<"]:";
  cin>>arr[i];
}

int temp=arr[0],pos;

for(int i=0;i<size;i++){

  pos=i;
  temp=arr[i];
  for(int j=i;j<size;j++){
    if(temp<arr[j]){
      temp=arr[j];
      pos=j;
    }
  }
  int var;
  var=arr[pos];
  arr[pos]=arr[i];
  arr[i]=var;

}

for(int i=0;i<size;i++){
  cout<<arr[i]<<" ";
}

}
