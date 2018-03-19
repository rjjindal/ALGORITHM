class Main{

  static int palindromePartition(char a[], int n){
    int dp[][] = new int[n][n];

    for(int i=0;i<n;i++)
      dp[i][i] = 0;

    for(int i=0; i<n ;i++){
      for(int j=0, k=i; j<(n-i) && k < n; j++,k++){

        if(j==k){
          // dp[j][k] = 1;
          continue;
        }
        if(a[j] == a[k]){
          if(k-j == 1)
            dp[j][k] = 0;

          if(dp[j+1][k-1]==0)
            dp[j][k] = 0;

        }else{
          int res = -1;
          for(int c=j; c<(k-1); c++){
            int t = dp[j][k] + dp[k+1][j] + 1;
            res = Main.min(res, t);
          }
          dp[j][k] = res;
        }

        for(int q=0;q<n;q++){
          for(int r=0;r<n;r++){
            System.out.print(dp[q][r]+ " ");
          }
          System.out.println();
        }
      }
      }


    return(dp[0][n-1]);
  }

  static int min(int a, int b){
    return( a<b? a: b);
  }

  public static void main(String[] args) {

    char c[] = "abbam".toCharArray();
    System.out.println(Main.palindromePartition(c, c.length));

  }
}
