import java.util.*;

class Main{

  static String lcs(char s1[], char s2[], int m, int n){

    int dp[][] = new int[m+1][n+1];

    for(int i=0;i<=m; i++)
      dp[i][0] = 0;

    for(int i=0;i<=m; i++)
      dp[0][i] = 0;

    for(int i=1;i<=m;i++){

      for(int j=1;j<=n;j++){

        if(s1[i-1] == s2[j-1]){
          dp[i][j] = dp[i-1][j-1] + 1;
        }else{
          dp[i][j] = Main.max(dp[i-1][j], dp[i][j-1]);
        }
      }
    }

    String sol = new String();
    int i=m, j=n;
    while(i > 0 && j > 0){
      if(s1[i-1] == s2[j-1]){

        sol = String.valueOf(s1[i-1]) + sol ;
        i--;
        j--;
      }else if(dp[i-1][j] > dp[i][j-1]){
        i--;
      }else{
        j--;
      }
    }

    return(sol);
  }

  static int max(int a, int b){
    return( a > b ? a : b);
  }

  public static void main(String[] args) {

    char[] str1 = "abcd".toCharArray();
    char[] str2 = "beda".toCharArray();

    System.out.println(Main.lcs( str1, str2, str1.length, str2.length));
  }
}
