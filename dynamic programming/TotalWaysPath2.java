// Count all possible paths from top left to bottom right of a mXn matrix
// Bottom up DP approach (tabulation method)

import java.util.*;

class Main{

  int solve(int m, int n){

    if(m==1 || n==1)
      return(1);
    return( solve(m-1, n) + solve(m, n-1));
  }

  int solveDP(int m, int n){

    int lookup[][] = new int[m][n];

    for(int i=0;i<m;i++)
      lookup[i][0] = 1;

    for(int j=0;j<n;j++)
      lookup[0][j] = 1;

    for(int i=1;i<m;i++){

      for(int j=1; j<n; j++){

        lookup[i][j] = lookup[i-1][j] + lookup[i][j-1];
      }
    }
    return(lookup[m-1][n-1]);
  }

  public static void main(String[] args) {

    Main obj = new Main();

    System.out.println(obj.solveDP(4,4));
  }
}
