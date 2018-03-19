class Main{

  static int lps(char s[], int n){

    int dp[][] = new int[n][n];

    for(int i=0;i<n;i++)
      dp[i][i] = 1;

    for(int i=0; i<n ;i++){
      for(int j=0, k=i; j<(n-i) && k < n; j++,k++){

        if(j==k){
          // dp[j][k] = 1;
          continue;
        }

        if(s[j] == s[k])
          dp[j][k] = dp[j+1][k-1] + 2;
        else
          dp[j][k] = Main.max(dp[j][k-1], dp[j+1][k]);
      }
    }
    return(dp[0][n-1]);
  }

  static int max(int a, int b){
    return( a>b? a: b);
  }

  public static void main(String[] args) {

    char s[] = "robort".toCharArray();
    System.out.println(Main.lps(s, s.length));
  }
}
