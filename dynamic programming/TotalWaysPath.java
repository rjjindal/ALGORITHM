import java.util.*;

class Main{

  int lookup[][] = new int[100][100];

  Main(){
    // Arrays.fill(lookup, -1);
  }

  int solve(int m, int n){

    if(m==1 || n==1)
      return(1);
    return( solve(m-1, n) + solve(m, n-1));
  }

  int solveDP(int m, int n){

    if(m==1 || n==1)
      lookup[m][n] = 1;

    if(lookup[m][n]!=0)
      return(lookup[m][n]);

    return(lookup[m][n] = solveDP(m-1, n) + solveDP(m, n-1));
  }

  public static void main(String[] args) {

    Main obj = new Main();

    System.out.println(obj.solveDP(4,4));
  }
}
