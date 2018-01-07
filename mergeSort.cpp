#include<iostream>

using namespace std;


void merge(int arr[],int l,int m,int r){

    int temp[50];

    int i1,i2,i;
    for(i1=l,i2=m+1,i=l;i1<=m && i2<=r ; i++ ) {

      if(arr[i1]<arr[i2]){
        temp[i]=arr[i2++];
      }else{
        temp[i]=arr[i1++];
      }
    }



            while(i1<=m){
              temp[i]=arr[i1++];

            }

            while(i2<=r){
              temp[i]=arr[i2++];
            }

            for(int i=0;arr[i]>=0;i++){
              arr[i]=temp[i];
            }

  }

void mergeSort(int arr[],int l,int r){
  int mid=(l+r)/2;

  if(l<=r){

    mergeSort(arr,l,mid);
    mergeSort(arr,mid+1,r);
    merge(arr,l,mid,r);
  }

}


int main(){

  int size,arr[20];

  cin>>size;

  for(int i=0;i<size;i++){
    cout<<"a["<<i<<"]:";
    cin>>arr[i];
  }

mergeSort(arr,0,size-1);
  for(int i=0;i<size;i++){
    cout<<arr[i];
  }


  return 0;
}
