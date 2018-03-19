import java.util.*;

class Main{

  static  int binomialCo(int n, int k){

    int dp[][] = new int[n+1][n+1];

    for(int i=0;i<=n;i++){

      for(int j=0;j<=i;j++){

        if(i==j || j==0){
          dp[i][j] = 1;
        }
        else{
          dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
        }
      }
    }
    return(dp[n][k]);
  }

  public static void main(String[] args) {

    // Main obj = new Main();
    System.out.println(Main.binomialCo(5, 2));
  }
}
