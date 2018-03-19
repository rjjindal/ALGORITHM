import java.util.*;

class Main{

  static String editString(char str1[], char str2[], int m, int n){

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

    String sol = new String();
    int i=m, j=n;
    while(i>0 && j>0){
      if(str1[i-1] != str2[j-1]){
        sol = str1[i-1] + sol;
        i--;
        j--;
      }
      else{

        switch((Main.minIndex(dp[i-1][j], dp[i][j-1], dp[i-1][j-1]))){
          case 1: j--;
                  break;
          case 2: i--;
                  break;
          case 3: i--; j--;
                  break;
        }
      }
    }

    return(sol);
  }

  static int min(int a, int b, int c){

    if(a<b)
      return( a<c? a: c);
    else
      return( b<c? b: c);
  }

  static int minIndex(int a, int b, int c){

    if(a<b)
      return( a<c? 1: 3);
    else
      return( b<c? 2: 3);
  }

  public static void main(String[] args) {

    char str1[] = "geeks".toCharArray();
    char str2[] = "geaky".toCharArray();
    System.out.println(Main.editString(str1, str2, str1.length, str2.length));
  }
}
