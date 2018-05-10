import java.util.*;

class Main{

  int numberOfArrangements(int s[], int m, int n){

    if(n==0)
      return(1);

    if(n<0)
      return(0);

    if (m <=0 )
        return 0;

    return(numberOfArrangements(s, m-1, n) + numberOfArrangements(s, m, n-s[m-1]));
  }


  public int numberOfSolutions(int total, int coins[]){

    int temp[][] = new int[coins.length+1][total+1];

    for(int i=0; i <= coins.length; i++){
        temp[i][0] = 1;
    }

    for(int i=1; i <= coins.length; i++){
        for(int j=1; j <= total ; j++){
            if(coins[i-1] > j){
                temp[i][j] = temp[i-1][j];
            }
            else{
                temp[i][j] = temp[i][j-coins[i-1]] + temp[i-1][j];
            }
        }
    }
    return temp[coins.length][total];
  }


  // int totalCoinExchange(int s[], int m, int n){
  //
  //   int dp[][] = new int[m+1][n + 1];
  //
  //   for(int i=0;i<(m+1);i++){
  //     dp[i][0] = 1;
  //     dp[0][i] = 0;
  //   }
  //
  //   for(int i=1;i<(m+1);i++){
  //     for(int j=1;j<(n+1);j++){
  // 
  //       if(j<s[i-1])
  //         dp[i][j] = dp[i-1][j];
  //       else
  //         dp[i][j] = dp[i][j-s[i-1]] + dp[i-1][j];
  //     }
  //   }
  //
  //   return(dp[m][n]);
  // }

  public static void main(String[] args) {

    int s[] = {2, 5, 3, 6};
    int n = 10;
    Main obj = new Main();

    // System.out.println(obj.numberOfSolutions(n, s));
    System.out.println(obj.totalCoinExchange(s, s.length, n));
  }
}
