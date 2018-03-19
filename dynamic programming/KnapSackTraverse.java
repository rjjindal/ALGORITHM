class Main{

  static int knapSack(int wt[], int val[], int n, int W){

    int dp[][] = new int[n+1][W+1];

    for(int i=0;i<=n;i++){
      for(int j=0; j<=W; j++){

        if(i==0 || j==0)
          dp[i][j] = 0;
        else if(j < wt[i-1] )
          dp[i][j] = dp[i-1][j];
        else
          dp[i][j] = Main.max( val[i-1] + dp[i-1][j-wt[i-1]], dp[i-1][j]);
      }
    }

    int i=n, j=W;
    while(i>0 && j>0){

      if(dp[i][j] == dp[i-1][j]){
        i--;
      }else{
        System.out.println(wt[i]);
        j = j - wt[i];
      }
    }

    return(dp[n][W]);
  }

  static int max(int a, int b){
    return( a>b? a: b);
  }

  public static void main(String[] args) {

    int wt[] = {1, 3, 4, 5};
    int val[] = {1, 4, 5, 7};
    int W = 7;
    System.out.println(Main.knapSack(wt, val, wt.length, W));
  }
}
