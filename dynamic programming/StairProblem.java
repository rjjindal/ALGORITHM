class Main{

  static int countStairs(int n, int m){

    int dp[] = new int[n+1];

    dp[0] = 1;
    dp[1] = 1;
    for(int i=2; i<=n;i++){

      dp[i] = 0;
      for(int j=1; j<=i && j<=m; j++)
        dp[i] += dp[i-j];
    }

    return(dp[n]);
  }

  public static void main(String[] args) {

    System.out.println(Main.countStairs(4, 2));
  }
}
