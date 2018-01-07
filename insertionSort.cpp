#include<iostream>

using namespace std;
int main(){

  int size,arr[20];

  cin>>size;

  for(int i=0;i<size;i++){
    cout<<"a["<<i<<"]:";
    cin>>arr[i];
  }

  for(int i=1;i<size;i++){
    int j=i-1,temp=arr[i];

    while(j>=0 && arr[j]>temp){
      arr[j+1]=arr[j];
      j--;
    }
    arr[j+1]=temp;

  }

  for(int i=0;i<size;i++){
    cout<<arr[i]<<" ";
  }

  return 0;
}
