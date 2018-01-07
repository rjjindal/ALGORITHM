#include<iostream>

using namespace std;

int *binAdd(int *num1, int *num2){

  int result[16]={0},buffer=0;
  for(int i=15;i>=0; i--){
    if((num1[i] + num2[i] + buffer)== 2){
      result[i] = 0;
      buffer = 1;
    }else if((num1[i] + num2[i] + buffer)== 3){
      result[i] = 1;
      buffer = 1;
    }else{
      result[i] = num1[i] + num2[i];
      buffer = 0;
    }
  }
  return result;
}

int * onesComplimentOf(int num[]){

  for(int i =0 ;i<16;i++){
    cout<<num[i];
    if(num[i] == 1){
      num[i] = 0;
    }else{
      num[i] = 1;
    }
  }
  cout<<endl;
  for(int i =0 ;i<16;i++){
    cout<<num[i];
  }
  return num;
}

int main(){

  int var,i=15;
  int binNum[16]={0}, binOne[15]={0};
  binOne[15] = 1;
  cin>>var;

  while(var>0 && i>0){
    binNum[i] = var%2;
    var = var/2;
    i--;
  }

  //one compliment
  for(int i =0 ;i<16;i++){
    if(binNum[i] == 1){
      binNum[i] = 0;
    }else{
      binNum[i] = 1;
    }
    cout<<binOne[i];
  }

  // int *result = binAdd(binOne, onesComplimentOf(binNum));
  // int *result = onesComplimentOf(binNum);

  //add one

    int buffer=0;
    for(int i=15;i>=0; i--){
      if((binNum[i] + binOne[i] + buffer)== 2){
        binNum[i] = 0;
        buffer = 1;
      }else if((binNum[i] + binOne[i] + buffer)== 3){
        binNum[i] = 1;
        buffer = 1;
      }else{
        binNum[i] = binNum[i] + binOne[i];
        buffer = 0;
      }
    }

  for(int k=0;i<15;i++){
    cout<<binNum[k];
  }

  return 0;
}
