import java.util.*;

class Main{

  static int solve(char[] str, int len){

    int dp[] = new int[len];

    dp[0] = 1;

    for(int i=1;i< len; i++){

      int num = (str[i-1]-'0')*10 + (str[i]-'0');

      if(str[i]!=0)
        dp[i] = dp[i-1];

      if(num > 9 && num < 27){

        if(i==1){
          dp[i] = dp[i] + 1;
        }else{
          dp[i] = dp[i] + dp[i-2];
        }

      }
    }
    return(dp[len-1]);
  }

  public static void main(String[] args) {

    String str = "25110";
    System.out.println(Main.solve(str.toCharArray(), str.length()));

  }
}
