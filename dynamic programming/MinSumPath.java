class Main{

  static int solve(int cost[][], int m, int n){

    int dp[][] = new int[m+1][n+1];

    dp[0][0] = cost[0][0];
    for(int i = 1;i <= m; i++)
      dp[i][0] = dp[i-1][0] + cost[i][0];

    for(int i = 1;i <= m; i++)
      dp[0][i] = dp[0][i-1] + cost[0][i];

    for(int i=1;i<=m; i++){
      for(int j=1;j<=n ; j++){

        dp[i][j] = min(dp[i-1][j], dp[i][j-1], dp[i-1][j-1]) + cost[i][j];
      }
    }

    return(dp[m][n]);
  }

  static int min(int a, int b, int c){

    if(a<b)
      return(a < c ? a : c);
    else
      return(b < c ? b: c);
  }



  public static void main(String[] args) {

    int arr[][] = {{1, 2, 3},
                 {4, 8, 2},
                 {1, 5, 3}};

    System.out.println(Main.solve(arr, 2, 2));
  }
}
