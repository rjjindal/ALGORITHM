class Main{

  int dp[][] = new int[1000][1000];

  Main(int n){

    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        dp[i][j] = -1;
      }
    }
  }

  int optimalScore(int v[], int n){


    int dp[][] = new int[n][n];


    for(int i=0; i<n ;i++){
      for(int j=0, k=i; j<(n-i) && k < n; j++,k++){


        if(j==k)
          dp[j][k] = v[j];

        else if( j+1 == k)
          dp[j][k] = v[j] > v[k] ? v[j] : v[k];
        else
          dp[j][k] = max( v[j] + min(dp[j+2][k-1], dp[j+1][k-1]), v[k] + min(dp[j+1][k-1], dp[j][k-2]));

      }
    }
    return(dp[0][n-1]);
  }

  int max(int a,int b){
    return( a>b? a: b);
  }

  int min(int a, int b){
    return( a<b? a: b);
  }

  public static void main(String[] args) {

    int v[] = {8, 15, 3, 7};

    Main obj = new Main(v.length);



    System.out.println(obj.optimalScore( v, v.length));

  }
}
