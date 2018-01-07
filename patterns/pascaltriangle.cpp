// print the pascal triangle pattern
#include<iostream>
using namespace std;

int main()
{
  int mat[100][100];
  for(int i=0;i<100;i++){
    mat[i][0] = 1;
    mat[0][i] = 1;
  }

  for(int i=1;i<100;i++){
    for(int j=1;j<100 ; j++){

      mat[i][j] = mat[i-1][j] + mat[i][j-1];

    }
  }

  for(int i=0;i<5;i++){
    for(int j=0;j<5 ; j++){
      cout<<mat[i][j]<<" ";
    }
    cout<<endl;
  }

}
