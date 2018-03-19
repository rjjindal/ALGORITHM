import java.util.*;

class Main{

  static int editString(char str1[], char str2[], int m, int n){

    int dp[][] = new int[m+1][n+1];

    for(int i=0;i<=m;i++)
      dp[i][0] = i;

    for(int j=0;j<=n;j++)
      dp[0][j] = j;

    for(int i=1;i<=m;i++){
      for(int j=1;j<=n; j++){

        if(str1[i-1] == str2[j-1])
          dp[i][j] = dp[i-1][j-1];
        else
          dp[i][j] = Main.min(dp[i-1][j], dp[i][j-1], dp[i-1][j-1]) + 1;
      }
    }

    return(dp[m][n]);
  }

  static int min(int a, int b, int c){

    if(a<b)
      return( a<c? a: c);
    else
      return( b<c? b: c);
  }

  public static void main(String[] args) {

    char str1[] = "geeks".toCharArray();
    char str2[] = "geaky".toCharArray();
    System.out.println(Main.editString(str1, str2, str1.length, str2.length));
  }
}
