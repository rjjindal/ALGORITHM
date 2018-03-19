// boolean parenthesiaisna program
// not giving correct output
// need another look!
class Main{

  public static int CountParenthe(boolean exp[], int op[], int n, int m){

    int t[][] = new int[n][n];
    int f[][] = new int[n][n];

    for(int i=0;i<n;i++){
      t[i][i] = exp[i] ? 1 : 0;
      f[i][i] = exp[i] ? 0 : 1;
    }

    for(int i=0; i<n ;i++){
      for(int j=0, p=i; j<(n-i) && p < n; j++,p++){

        if(j==p){
          // dp[j][p] = 1;
          continue;
        }



        for(int k=i; k<(p-1); k++){

          int tik = t[j][k] + f[j][k];
          int tkj = t[k+1][p] + f[k+1][p];

          if(op[k]==1){

            t[j][p] = t[j][k] * t[k+1][p];
            f[j][p] = tik * tkj - t[j][k]*t[k+1][p];
          }else if(op[k]==2){

            t[j][p] = tik * tkj - f[j][k] * f[k+1][p];
            f[j][p] = f[j][k] * f[k+1][p];
          }else if(op[k]==3){

            t[j][p] = t[j][k] * f[k+1][p] + f[j][k]*t[k+1][p];
            f[j][p] = t[j][k] * t[k+1][p] + f[j][k] * f[k+1][p];
          }
        }
      }
    }
    return(t[0][n-1]);
  }

  public static void main(String[] args) {

    boolean exp[] = {true, false, true};

    int op[] = {3,1};

    System.out.println(Main.CountParenthe(exp, op, exp.length, op.length));
  }
}
