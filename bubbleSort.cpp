#include<iostream>

using namespace std;
int main(){

  int size,arr[20];

  cin>>size;

  for(int i=0;i<size;i++){
    cout<<"a["<<i<<"]:";
    cin>>arr[i];
  }
int temp;
  for(int i=0;i<size;i++){

    for(int j=0;j<size-i-1;j++){
      if(arr[j]>arr[j+1]){
        temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
      }

    }
  }

  for(int i=0;i<size;i++){
    cout<<arr[i]<<" ";
  }

}
