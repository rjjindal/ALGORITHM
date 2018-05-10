class Main{

  int lps(char[] str, int n){

    int dp[][] = new int[n][n];

    for(int i=0;i<n;i++)
      dp[i][i] = 1;

    // cl - chain length
    for(int cl=2;cl<=n ; cl++){

      for(int i=0 ; i<n-cl+1 ; i++){

        int j = i + cl - 1 ;

        if( str[i]==str[j] && cl==2){
          dp[i][j] = 2;
        }else if(str[i]==str[j]){
          dp[i][j] = dp[i+1][j-1] + 2;
        }else{
          dp[i][j] = max( dp[i][j-1], dp[i+1][j]);
        }
      }
    }

    return(dp[0][n-1]);
  }

  int max(int a,int b){
    return(a>b?a:b);
  }

  public static void main(String[] args) {

    Main obj = new Main();
    String str = "forgeekeegrof";
    System.out.println("Length is: " + obj.lps(str.toCharArray(), str.length()));
  }
}
